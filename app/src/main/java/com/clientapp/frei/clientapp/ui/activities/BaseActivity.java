package com.clientapp.frei.clientapp.ui.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import com.clientapp.frei.clientapp.utils.ConstantManager;

public class BaseActivity extends AppCompatActivity{

    static final String TAG = ConstantManager.TAG_PREFIX + "BaseActivity";

    protected ProgressDialog mProgressDialog;

    public void showProgress(){
        if (mProgressDialog == null){
      // todo       mProgressDialog = new ProgressDialog();
        }
    }
}
