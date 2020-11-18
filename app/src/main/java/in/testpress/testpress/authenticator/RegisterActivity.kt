package `in`.testpress.testpress.authenticator

import `in`.testpress.testpress.Injector
import `in`.testpress.testpress.R
import `in`.testpress.testpress.authenticator.LoginActivity.REQUEST_CODE_REGISTER_USER
import `in`.testpress.testpress.core.TestpressService
import `in`.testpress.testpress.enums.VerificationMethod
import `in`.testpress.testpress.models.InstituteSettings
import `in`.testpress.testpress.ui.fragments.AutoLoginFragment
import `in`.testpress.testpress.ui.fragments.EmailVerificationFragment
import `in`.testpress.testpress.ui.fragments.PhoneVerificationFragment
import android.content.Intent
import android.os.Bundle
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

open class RegisterActivity : AppCompatActivity() {

    @Inject
    lateinit var testPressService: TestpressService

    private val instituteSettings = InstituteSettings.getInstance()

    private val verificationMethod = instituteSettings.verificationType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Injector.inject(this)
        setContentView(R.layout.fragment_layout)
        initFragment()
    }

    private fun initFragment() {
        when (verificationMethod) {
            VerificationMethod.MOBILE -> navigateToPhoneVerificationFragment()
            VerificationMethod.EMAIL -> navigateToEmailVerificationFragment()
            VerificationMethod.NONE -> navigateToAutoLoginFragment()
        }
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun navigateToPhoneVerificationFragment() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.container, PhoneVerificationFragment(), "PhoneVerificationFragment")
            commit()
        }
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun navigateToEmailVerificationFragment() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.container, EmailVerificationFragment(), "EmailVerificationFragment")
            commit()
        }
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun navigateToAutoLoginFragment() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.container, AutoLoginFragment(), "AutoLoginFragment")
            commit()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_REGISTER_USER) {
            setResult(resultCode)
            finish()
        }
    }
}
