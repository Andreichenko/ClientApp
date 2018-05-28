package com.clientapp.frei.clientapp.data.managers;


import android.content.Context;

import com.clientapp.frei.clientapp.ui.activities.MainActivity;
import com.clientapp.frei.clientapp.utils.ConstantManager;

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


}
