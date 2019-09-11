package in.testpress.testpress.models;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import in.testpress.testpress.models.InstituteSettings;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "INSTITUTE_SETTINGS".
*/
public class InstituteSettingsDao extends AbstractDao<InstituteSettings, String> {

    public static final String TABLENAME = "INSTITUTE_SETTINGS";

    /**
     * Properties of entity InstituteSettings.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property BaseUrl = new Property(0, String.class, "baseUrl", true, "BASE_URL");
        public final static Property VerificationMethod = new Property(1, String.class, "verificationMethod", false, "VERIFICATION_METHOD");
        public final static Property AllowSignup = new Property(2, Boolean.class, "allowSignup", false, "ALLOW_SIGNUP");
        public final static Property ForceStudentData = new Property(3, Boolean.class, "forceStudentData", false, "FORCE_STUDENT_DATA");
        public final static Property RemoveTpBranding = new Property(4, Boolean.class, "removeTpBranding", false, "REMOVE_TP_BRANDING");
        public final static Property Url = new Property(5, String.class, "url", false, "URL");
        public final static Property ShowGameFrontend = new Property(6, Boolean.class, "showGameFrontend", false, "SHOW_GAME_FRONTEND");
        public final static Property CoursesEnabled = new Property(7, Boolean.class, "coursesEnabled", false, "COURSES_ENABLED");
        public final static Property CoursesEnableGamification = new Property(8, Boolean.class, "coursesEnableGamification", false, "COURSES_ENABLE_GAMIFICATION");
        public final static Property CoursesLabel = new Property(9, String.class, "coursesLabel", false, "COURSES_LABEL");
        public final static Property PostsEnabled = new Property(10, Boolean.class, "postsEnabled", false, "POSTS_ENABLED");
        public final static Property PostsLabel = new Property(11, String.class, "postsLabel", false, "POSTS_LABEL");
        public final static Property StoreEnabled = new Property(12, Boolean.class, "storeEnabled", false, "STORE_ENABLED");
        public final static Property StoreLabel = new Property(13, String.class, "storeLabel", false, "STORE_LABEL");
        public final static Property DocumentsEnabled = new Property(14, Boolean.class, "documentsEnabled", false, "DOCUMENTS_ENABLED");
        public final static Property DocumentsLabel = new Property(15, String.class, "documentsLabel", false, "DOCUMENTS_LABEL");
        public final static Property ResultsEnabled = new Property(16, Boolean.class, "resultsEnabled", false, "RESULTS_ENABLED");
        public final static Property DashboardEnabled = new Property(17, Boolean.class, "dashboardEnabled", false, "DASHBOARD_ENABLED");
        public final static Property FacebookLoginEnabled = new Property(18, Boolean.class, "facebookLoginEnabled", false, "FACEBOOK_LOGIN_ENABLED");
        public final static Property GoogleLoginEnabled = new Property(19, Boolean.class, "googleLoginEnabled", false, "GOOGLE_LOGIN_ENABLED");
        public final static Property CommentsVotingEnabled = new Property(20, boolean.class, "commentsVotingEnabled", false, "COMMENTS_VOTING_ENABLED");
        public final static Property BookmarksEnabled = new Property(21, Boolean.class, "bookmarksEnabled", false, "BOOKMARKS_ENABLED");
        public final static Property ForumEnabled = new Property(22, Boolean.class, "forumEnabled", false, "FORUM_ENABLED");
        public final static Property TwilioEnabled = new Property(23, Boolean.class, "twilioEnabled", false, "TWILIO_ENABLED");
        public final static Property Allow_profile_edit = new Property(24, Boolean.class, "allow_profile_edit", false, "ALLOW_PROFILE_EDIT");
        public final static Property LearnLabel = new Property(25, String.class, "learnLabel", false, "LEARN_LABEL");
        public final static Property LeaderboardLabel = new Property(26, String.class, "leaderboardLabel", false, "LEADERBOARD_LABEL");
        public final static Property DashboardLabel = new Property(27, String.class, "dashboardLabel", false, "DASHBOARD_LABEL");
        public final static Property BookmarksLabel = new Property(28, String.class, "bookmarksLabel", false, "BOOKMARKS_LABEL");
        public final static Property LoginLabel = new Property(29, String.class, "loginLabel", false, "LOGIN_LABEL");
        public final static Property LoginPasswordLabel = new Property(30, String.class, "loginPasswordLabel", false, "LOGIN_PASSWORD_LABEL");
        public final static Property AboutUs = new Property(31, String.class, "aboutUs", false, "ABOUT_US");
        public final static Property DisableStudentAnalytics = new Property(32, Boolean.class, "disableStudentAnalytics", false, "DISABLE_STUDENT_ANALYTICS");
        public final static Property CustomRegistrationEnabled = new Property(33, Boolean.class, "customRegistrationEnabled", false, "CUSTOM_REGISTRATION_ENABLED");
        public final static Property EnableParallelLoginRestriction = new Property(34, Boolean.class, "enableParallelLoginRestriction", false, "ENABLE_PARALLEL_LOGIN_RESTRICTION");
        public final static Property MaxParallelLogins = new Property(35, Integer.class, "maxParallelLogins", false, "MAX_PARALLEL_LOGINS");
        public final static Property LockoutLimit = new Property(36, Integer.class, "lockoutLimit", false, "LOCKOUT_LIMIT");
    };


    public InstituteSettingsDao(DaoConfig config) {
        super(config);
    }
    
    public InstituteSettingsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"INSTITUTE_SETTINGS\" (" + //
                "\"BASE_URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: baseUrl
                "\"VERIFICATION_METHOD\" TEXT," + // 1: verificationMethod
                "\"ALLOW_SIGNUP\" INTEGER," + // 2: allowSignup
                "\"FORCE_STUDENT_DATA\" INTEGER," + // 3: forceStudentData
                "\"REMOVE_TP_BRANDING\" INTEGER," + // 4: removeTpBranding
                "\"URL\" TEXT," + // 5: url
                "\"SHOW_GAME_FRONTEND\" INTEGER," + // 6: showGameFrontend
                "\"COURSES_ENABLED\" INTEGER," + // 7: coursesEnabled
                "\"COURSES_ENABLE_GAMIFICATION\" INTEGER," + // 8: coursesEnableGamification
                "\"COURSES_LABEL\" TEXT," + // 9: coursesLabel
                "\"POSTS_ENABLED\" INTEGER," + // 10: postsEnabled
                "\"POSTS_LABEL\" TEXT," + // 11: postsLabel
                "\"STORE_ENABLED\" INTEGER," + // 12: storeEnabled
                "\"STORE_LABEL\" TEXT," + // 13: storeLabel
                "\"DOCUMENTS_ENABLED\" INTEGER," + // 14: documentsEnabled
                "\"DOCUMENTS_LABEL\" TEXT," + // 15: documentsLabel
                "\"RESULTS_ENABLED\" INTEGER," + // 16: resultsEnabled
                "\"DASHBOARD_ENABLED\" INTEGER," + // 17: dashboardEnabled
                "\"FACEBOOK_LOGIN_ENABLED\" INTEGER," + // 18: facebookLoginEnabled
                "\"GOOGLE_LOGIN_ENABLED\" INTEGER," + // 19: googleLoginEnabled
                "\"COMMENTS_VOTING_ENABLED\" INTEGER NOT NULL ," + // 20: commentsVotingEnabled
                "\"BOOKMARKS_ENABLED\" INTEGER," + // 21: bookmarksEnabled
                "\"FORUM_ENABLED\" INTEGER," + // 22: forumEnabled
                "\"TWILIO_ENABLED\" INTEGER," + // 23: twilioEnabled
                "\"ALLOW_PROFILE_EDIT\" INTEGER," + // 24: allow_profile_edit
                "\"LEARN_LABEL\" TEXT," + // 25: learnLabel
                "\"LEADERBOARD_LABEL\" TEXT," + // 26: leaderboardLabel
                "\"DASHBOARD_LABEL\" TEXT," + // 27: dashboardLabel
                "\"BOOKMARKS_LABEL\" TEXT," + // 28: bookmarksLabel
                "\"LOGIN_LABEL\" TEXT," + // 29: loginLabel
                "\"LOGIN_PASSWORD_LABEL\" TEXT," + // 30: loginPasswordLabel
                "\"ABOUT_US\" TEXT," + // 31: aboutUs
                "\"DISABLE_STUDENT_ANALYTICS\" INTEGER," + // 32: disableStudentAnalytics
                "\"CUSTOM_REGISTRATION_ENABLED\" INTEGER," + // 33: customRegistrationEnabled
                "\"ENABLE_PARALLEL_LOGIN_RESTRICTION\" INTEGER," + // 34: enableParallelLoginRestriction
                "\"MAX_PARALLEL_LOGINS\" INTEGER," + // 35: maxParallelLogins
                "\"LOCKOUT_LIMIT\" INTEGER);"); // 36: lockoutLimit
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"INSTITUTE_SETTINGS\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, InstituteSettings entity) {
        stmt.clearBindings();
 
        String baseUrl = entity.getBaseUrl();
        if (baseUrl != null) {
            stmt.bindString(1, baseUrl);
        }
 
        String verificationMethod = entity.getVerificationMethod();
        if (verificationMethod != null) {
            stmt.bindString(2, verificationMethod);
        }
 
        Boolean allowSignup = entity.getAllowSignup();
        if (allowSignup != null) {
            stmt.bindLong(3, allowSignup ? 1L: 0L);
        }
 
        Boolean forceStudentData = entity.getForceStudentData();
        if (forceStudentData != null) {
            stmt.bindLong(4, forceStudentData ? 1L: 0L);
        }
 
        Boolean removeTpBranding = entity.getRemoveTpBranding();
        if (removeTpBranding != null) {
            stmt.bindLong(5, removeTpBranding ? 1L: 0L);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(6, url);
        }
 
        Boolean showGameFrontend = entity.getShowGameFrontend();
        if (showGameFrontend != null) {
            stmt.bindLong(7, showGameFrontend ? 1L: 0L);
        }
 
        Boolean coursesEnabled = entity.getCoursesEnabled();
        if (coursesEnabled != null) {
            stmt.bindLong(8, coursesEnabled ? 1L: 0L);
        }
 
        Boolean coursesEnableGamification = entity.getCoursesEnableGamification();
        if (coursesEnableGamification != null) {
            stmt.bindLong(9, coursesEnableGamification ? 1L: 0L);
        }
 
        String coursesLabel = entity.getCoursesLabel();
        if (coursesLabel != null) {
            stmt.bindString(10, coursesLabel);
        }
 
        Boolean postsEnabled = entity.getPostsEnabled();
        if (postsEnabled != null) {
            stmt.bindLong(11, postsEnabled ? 1L: 0L);
        }
 
        String postsLabel = entity.getPostsLabel();
        if (postsLabel != null) {
            stmt.bindString(12, postsLabel);
        }
 
        Boolean storeEnabled = entity.getStoreEnabled();
        if (storeEnabled != null) {
            stmt.bindLong(13, storeEnabled ? 1L: 0L);
        }
 
        String storeLabel = entity.getStoreLabel();
        if (storeLabel != null) {
            stmt.bindString(14, storeLabel);
        }
 
        Boolean documentsEnabled = entity.getDocumentsEnabled();
        if (documentsEnabled != null) {
            stmt.bindLong(15, documentsEnabled ? 1L: 0L);
        }
 
        String documentsLabel = entity.getDocumentsLabel();
        if (documentsLabel != null) {
            stmt.bindString(16, documentsLabel);
        }
 
        Boolean resultsEnabled = entity.getResultsEnabled();
        if (resultsEnabled != null) {
            stmt.bindLong(17, resultsEnabled ? 1L: 0L);
        }
 
        Boolean dashboardEnabled = entity.getDashboardEnabled();
        if (dashboardEnabled != null) {
            stmt.bindLong(18, dashboardEnabled ? 1L: 0L);
        }
 
        Boolean facebookLoginEnabled = entity.getFacebookLoginEnabled();
        if (facebookLoginEnabled != null) {
            stmt.bindLong(19, facebookLoginEnabled ? 1L: 0L);
        }
 
        Boolean googleLoginEnabled = entity.getGoogleLoginEnabled();
        if (googleLoginEnabled != null) {
            stmt.bindLong(20, googleLoginEnabled ? 1L: 0L);
        }
        stmt.bindLong(21, entity.getCommentsVotingEnabled() ? 1L: 0L);
 
        Boolean bookmarksEnabled = entity.getBookmarksEnabled();
        if (bookmarksEnabled != null) {
            stmt.bindLong(22, bookmarksEnabled ? 1L: 0L);
        }
 
        Boolean forumEnabled = entity.getForumEnabled();
        if (forumEnabled != null) {
            stmt.bindLong(23, forumEnabled ? 1L: 0L);
        }
 
        Boolean twilioEnabled = entity.getTwilioEnabled();
        if (twilioEnabled != null) {
            stmt.bindLong(24, twilioEnabled ? 1L: 0L);
        }
 
        Boolean allow_profile_edit = entity.getAllow_profile_edit();
        if (allow_profile_edit != null) {
            stmt.bindLong(25, allow_profile_edit ? 1L: 0L);
        }
 
        String learnLabel = entity.getLearnLabel();
        if (learnLabel != null) {
            stmt.bindString(26, learnLabel);
        }
 
        String leaderboardLabel = entity.getLeaderboardLabel();
        if (leaderboardLabel != null) {
            stmt.bindString(27, leaderboardLabel);
        }
 
        String dashboardLabel = entity.getDashboardLabel();
        if (dashboardLabel != null) {
            stmt.bindString(28, dashboardLabel);
        }
 
        String bookmarksLabel = entity.getBookmarksLabel();
        if (bookmarksLabel != null) {
            stmt.bindString(29, bookmarksLabel);
        }
 
        String loginLabel = entity.getLoginLabel();
        if (loginLabel != null) {
            stmt.bindString(30, loginLabel);
        }
 
        String loginPasswordLabel = entity.getLoginPasswordLabel();
        if (loginPasswordLabel != null) {
            stmt.bindString(31, loginPasswordLabel);
        }
 
        String aboutUs = entity.getAboutUs();
        if (aboutUs != null) {
            stmt.bindString(32, aboutUs);
        }
 
        Boolean disableStudentAnalytics = entity.getDisableStudentAnalytics();
        if (disableStudentAnalytics != null) {
            stmt.bindLong(33, disableStudentAnalytics ? 1L: 0L);
        }
 
        Boolean customRegistrationEnabled = entity.getCustomRegistrationEnabled();
        if (customRegistrationEnabled != null) {
            stmt.bindLong(34, customRegistrationEnabled ? 1L: 0L);
        }
 
        Boolean enableParallelLoginRestriction = entity.getEnableParallelLoginRestriction();
        if (enableParallelLoginRestriction != null) {
            stmt.bindLong(35, enableParallelLoginRestriction ? 1L: 0L);
        }
 
        Integer maxParallelLogins = entity.getMaxParallelLogins();
        if (maxParallelLogins != null) {
            stmt.bindLong(36, maxParallelLogins);
        }
 
        Integer lockoutLimit = entity.getLockoutLimit();
        if (lockoutLimit != null) {
            stmt.bindLong(37, lockoutLimit);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public InstituteSettings readEntity(Cursor cursor, int offset) {
        InstituteSettings entity = new InstituteSettings( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // baseUrl
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // verificationMethod
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // allowSignup
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // forceStudentData
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // removeTpBranding
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // url
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // showGameFrontend
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // coursesEnabled
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // coursesEnableGamification
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // coursesLabel
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // postsEnabled
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // postsLabel
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // storeEnabled
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // storeLabel
            cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0, // documentsEnabled
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // documentsLabel
            cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0, // resultsEnabled
            cursor.isNull(offset + 17) ? null : cursor.getShort(offset + 17) != 0, // dashboardEnabled
            cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0, // facebookLoginEnabled
            cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0, // googleLoginEnabled
            cursor.getShort(offset + 20) != 0, // commentsVotingEnabled
            cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0, // bookmarksEnabled
            cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0, // forumEnabled
            cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0, // twilioEnabled
            cursor.isNull(offset + 24) ? null : cursor.getShort(offset + 24) != 0, // allow_profile_edit
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // learnLabel
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // leaderboardLabel
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // dashboardLabel
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // bookmarksLabel
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // loginLabel
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // loginPasswordLabel
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // aboutUs
            cursor.isNull(offset + 32) ? null : cursor.getShort(offset + 32) != 0, // disableStudentAnalytics
            cursor.isNull(offset + 33) ? null : cursor.getShort(offset + 33) != 0, // customRegistrationEnabled
            cursor.isNull(offset + 34) ? null : cursor.getShort(offset + 34) != 0, // enableParallelLoginRestriction
            cursor.isNull(offset + 35) ? null : cursor.getInt(offset + 35), // maxParallelLogins
            cursor.isNull(offset + 36) ? null : cursor.getInt(offset + 36) // lockoutLimit
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, InstituteSettings entity, int offset) {
        entity.setBaseUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setVerificationMethod(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAllowSignup(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setForceStudentData(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setRemoveTpBranding(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setShowGameFrontend(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setCoursesEnabled(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setCoursesEnableGamification(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setCoursesLabel(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPostsEnabled(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setPostsLabel(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setStoreEnabled(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setStoreLabel(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setDocumentsEnabled(cursor.isNull(offset + 14) ? null : cursor.getShort(offset + 14) != 0);
        entity.setDocumentsLabel(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setResultsEnabled(cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0);
        entity.setDashboardEnabled(cursor.isNull(offset + 17) ? null : cursor.getShort(offset + 17) != 0);
        entity.setFacebookLoginEnabled(cursor.isNull(offset + 18) ? null : cursor.getShort(offset + 18) != 0);
        entity.setGoogleLoginEnabled(cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0);
        entity.setCommentsVotingEnabled(cursor.getShort(offset + 20) != 0);
        entity.setBookmarksEnabled(cursor.isNull(offset + 21) ? null : cursor.getShort(offset + 21) != 0);
        entity.setForumEnabled(cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0);
        entity.setTwilioEnabled(cursor.isNull(offset + 23) ? null : cursor.getShort(offset + 23) != 0);
        entity.setAllow_profile_edit(cursor.isNull(offset + 24) ? null : cursor.getShort(offset + 24) != 0);
        entity.setLearnLabel(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setLeaderboardLabel(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setDashboardLabel(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setBookmarksLabel(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setLoginLabel(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setLoginPasswordLabel(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setAboutUs(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setDisableStudentAnalytics(cursor.isNull(offset + 32) ? null : cursor.getShort(offset + 32) != 0);
        entity.setCustomRegistrationEnabled(cursor.isNull(offset + 33) ? null : cursor.getShort(offset + 33) != 0);
        entity.setEnableParallelLoginRestriction(cursor.isNull(offset + 34) ? null : cursor.getShort(offset + 34) != 0);
        entity.setMaxParallelLogins(cursor.isNull(offset + 35) ? null : cursor.getInt(offset + 35));
        entity.setLockoutLimit(cursor.isNull(offset + 36) ? null : cursor.getInt(offset + 36));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(InstituteSettings entity, long rowId) {
        return entity.getBaseUrl();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(InstituteSettings entity) {
        if(entity != null) {
            return entity.getBaseUrl();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
