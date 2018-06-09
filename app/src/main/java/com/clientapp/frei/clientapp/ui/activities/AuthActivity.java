package com.clientapp.frei.clientapp.ui.activities;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.clientapp.frei.clientapp.data.managers.DataManager;
import com.clientapp.frei.clientapp.utils.ConstantManager;

public class AuthActivity extends BaseActivity implements View.OnClickListener{

    public static final String TAG = ConstantManager.TAG_PREFIX + "AuthActivity";

    @BindView(R.id.main_coordinator_container)
    CoordinatorLayout mCoordinatorLayout;
    @BindView(R.id.authorization_box)
    CardView mAuthorizationBox;
    @BindView(R.id.login_btn)
    Button mSignIn;
    @BindView(R.id.remember_txt)
    TextView mRememberPassword;
    @BindView(R.id.login_email_et)
    EditText mLogin;
    @BindView(R.id.login_password_et)
    EditText mPassword;

    private ChronosConnector mConnector;
    private Bus mBus;

    private DataManager mDataManager;
}
