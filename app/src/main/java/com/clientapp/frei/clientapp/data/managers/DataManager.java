package com.clientapp.frei.clientapp.data.managers;


import android.content.Context;
import android.util.Log;

import com.clientapp.frei.clientapp.ui.activities.MainActivity;
import com.clientapp.frei.clientapp.utils.ConstantManager;

import java.util.ArrayList;

public class DataManager {

    public static final String TAG = ConstantManager.TAG_PREFIX + "DataManager";

    private static DataManager INSTANCE = null;

    private PreferencesManager mPreferencesManager;
    private Context mContext;

    private RestService mRestService;
    private Picasso mPicasso;
    private DaoSession mDaoSession;

    private DataManager() {
        mPreferencesManager = new PreferencesManager();
        mContext = MainActivity.getContext();

        mRestService = ServiceGenerator.createService(RestService.class);
        mPicasso = new PicassoCache(mContext).getPicassoInstance();
        mDaoSession = MainActivity.getDaoSession();


    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }
    public PreferencesManager getPreferencesManager() {
        return mPreferencesManager;
    }

    public Context getContext() {
        return mContext;
    }

    public Picasso getPicasso() {
        return mPicasso;
    }

    public RestService getRestService() {
        return mRestService;
    }

    //region --- Network ---
    public Call<UserLoginRes> loginUser(UserLoginReq userLoginReq) {
        return mRestService.loginUser(userLoginReq);
    }

    public Call<UserDataRes> loginToken(String userId) {
        return mRestService.loginToken(userId);
    }

    public Call<UploadPhotoRes> uploadPhoto(String userId, MultipartBody.Part file) {
        return mRestService.uploadPhoto(userId, file);
    }

    public Call<UploadPhotoRes> uploadAvatar(String userId, MultipartBody.Part file) {
        return mRestService.uploadAvatar(userId, file);
    }

    public Call<UserListRes> getUserListFromNetwork() {
        return mRestService.getUserList();
    }

    public Call<UserContactsRes> changeUserContacts(String userId, UserContactsReq userContactsReq) {
        return mRestService.changeUserContacts(userId, userContactsReq);
    }

    public Call<UserLikeRes> likeUser(String userId) {
        return mRestService.likeUser(userId);
    }

    public Call<UserUnlikeRes> unlikeUser(String userId) {
        return mRestService.unlikeUser(userId);
    }
    //endregion

    //region --- Database ---
    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public List<User> getUserListByName(String query) {
        List<User> userList = new ArrayList<>();

        try {
            userList = mDaoSession.queryBuilder(User.class)
                    .where(UserDao.Properties.Rating.gt(0), UserDao.Properties.SearchName.like("%" + query.toUpperCase() + "%"))
                    .orderDesc(UserDao.Properties.Rating)
                    .build()
                    .list();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "getUserListByName: " + e.getMessage());
        }

        return userList;
    }

}
