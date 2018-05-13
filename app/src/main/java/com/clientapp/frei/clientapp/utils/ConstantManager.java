package com.clientapp.frei.clientapp.utils;


/**
 *
 *   ConstantManager - interface for constants
 *
 *      TAG_PREFIX - prefix for the application logging
 *      EDIT_MODE_KEY - edit parameters for app
 * by Andreichenko
 *
 */

public interface ConstantManager {

    String TAG_PREFIX = "DEV";
    String EDIT_MODE_KEY = "EDIT_MODE_KEY";

    String USER_PHONE_KEY = "USER_1_KEY";
    String USER_MAIL_KEY = "USER_2_KEY";

    String USER_BIO_KEY = "USER_5_KEY";
    String USER_PHOTO_KEY = "USER_PHOTO_KEY";
    String USER_AVATAR_KEY = "USER_AVATAR_KEY";
    String USER_RATING_VALUE = "USER_RATING_VALUE";
    String USER_CODE_LINES_VALUE = "USER_CODE_LINES_VALUE";
    String USER_PROJECT_VALUE = "USER_PROJECT_VALUE";

    String USER_ID_KEY = "USER_ID_KEY";
    String AUTH_TOKEN_KEY = "AUTH_TOKEN_KEY";

    String PARCELABLE_KEY = "PARCELABLE_KEY";

    String ORDER_PROPERTY = "ORDER_PROPERTY";
    String ORDER_ASC_OR_DESC = "ORDER_ASC_OR_DESC";

    int LOAD_PROFILE_PHOTO = 1;
    int REQUEST_CAMERA_PICTURE = 99;
    int REQUEST_GALLERY_PICTURE = 88;

    int REQUEST_PERMISSION_SETTINGS_CODE = 101;
    int REQUEST_PERMISSION_CAMERA_CODE = 102;
    int REQUEST_PERMISSIONS_READ_SDCARD_CODE = 103;

    int SEARCH_DELAY = 1500;

}
