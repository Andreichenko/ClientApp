package com.clientapp.frei.clientapp.data.managers;

import android.app.Application;
import android.content.SharedPreferences;

import com.clientapp.frei.clientapp.utils.ConstantManager;

import java.util.ArrayList;
import java.util.List;

public class PreferencesManager {


    private static final String[] USER_DATA = {
            ConstantManager.FIRST_NAME,
            ConstantManager.SECOND_NAME};
    private static final String[] USER_INFO = {
            ConstantManager.USER_PHONE_KEY,
            ConstantManager.USER_MAIL_KEY,
            ConstantManager.USER_VK_KEY,
            ConstantManager.USER_GIT_KEY,
            ConstantManager.USER_BIO_KEY};
    private static final String[] USER_PROFILE = {
            ConstantManager.USER_RATING_VALUE,
            ConstantManager.USER_CODE_LINES_VALUE,
            ConstantManager.USER_PROJECT_VALUE};
    private static final int[] USER_INFO_DEFAULT_VALUES = {
            R.string.user_profile_phone_et_default_value,
            R.string.user_profile_email_et_default_value,
            R.string.user_profile_vk_et_default_value,
            R.string.user_profile_git_et_default_value,
            R.string.user_profile_bio_et_default_value};
    private SharedPreferences mSharedPreferences;

    public PreferencesManager() {
        this.mSharedPreferences = Application.getSharedPreferences();
    }


    public void saveUserFullName(List<String> userData) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < USER_DATA.length; i++) {
            editor.putString(USER_DATA[i], userData.get(i));
        }
        editor.apply();
    }

    public String getFullName() {
        return mSharedPreferences.getString(ConstantManager.SECOND_NAME, "null") + " " +
                mSharedPreferences.getString(ConstantManager.FIRST_NAME, "null");
    }

    public void saveUserInfoData(List<String> userInfo) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < USER_INFO.length; i++) {
            editor.putString(USER_INFO[i], userInfo.get(i));
        }
        editor.apply();
    }

    public List<String> loadUserInfoData() {
        List<String> userInfo = new ArrayList<>();
        for (int i = 0; i < USER_INFO.length; i++) {
            userInfo.add(mSharedPreferences.getString(USER_INFO[i],
                    DevIntensiveApplication.getContext().getString(USER_INFO_DEFAULT_VALUES[i])));
        }
        return userInfo;
    }


    public void saveUserProfileData(int[] userProfile) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i = 0; i < USER_PROFILE.length; i++) {
            editor.putString(USER_PROFILE[i], String.valueOf(userProfile[i]));
        }
        editor.apply();
    }

    public List<String> loadUserProfileData() {
        List<String> userProfile = new ArrayList<>();
        for (int i = 0; i < USER_PROFILE.length; i++) {
            userProfile.add(mSharedPreferences.getString(USER_PROFILE[i], "0"));
        }
        return userProfile;
    }


}
