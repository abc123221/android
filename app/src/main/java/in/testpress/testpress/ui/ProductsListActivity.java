package in.testpress.testpress.ui;

import android.os.Bundle;

import in.testpress.testpress.R;

public class ProductsListActivity extends NavigationDrawer {

    protected ProductNativeGridBaseFragment productsListFragment;
    protected Bundle savedInstanceState;

    @Override
    public void onInt(Bundle savedInstanceState) {
        super.onInt(savedInstanceState);
        this.savedInstanceState=savedInstanceState;
        initUser();
        with(this)
                .startingPosition(1) //Starting position in the list
                .addAllHelpItem(mHelpLiveo.getHelp())
                .backgroundList(R.color.native_background)
                .build();
    }

    @Override
    public void onItemClick(int position) {
        if(position == 1) {
            initScreen();
        } else {
            super.onItemClick(position);
        }
    }

    protected void initScreen() {
        productsListFragment=new ProductNativeGridBaseFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, productsListFragment)
                .commitAllowingStateLoss();
    }
}
