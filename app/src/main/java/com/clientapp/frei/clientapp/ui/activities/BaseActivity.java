package com.clientapp.frei.clientapp.ui.activities;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.clientapp.frei.clientapp.R;
import com.clientapp.frei.clientapp.utils.ConstantManager;



/**
 *
 *  The BaseClass for another Activities
 *
 *
 *
 *   by Andreichenko
 */

public class BaseActivity extends AppCompatActivity{

    static final String TAG = ConstantManager.TAG_PREFIX + "BaseActivity";

    protected ProgressDialog mProgressDialog;


//    Progress bar todo This ist progress bar for any activities

    /**
     * This is ProgressBar
     */

    public void showProgress(){
        if (mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this, R.style.customDialog);
            mProgressDialog.setCancelable(false);
            mProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }

        mProgressDialog.show();
        mProgressDialog.setContentView(R.layout.progress_splash);
    }

//    Hide Progress bar

    /**
     *
     *  Hide Bar
     *
     *
     */

    public void hideProgress(){
        if (mProgressDialog != null){
            if (mProgressDialog.isShowing()){
                mProgressDialog.hide();
            }
        }
    }
//    Show message

    /**
     *
     *  Show Bar
     *
     * @param message  message from Toast
     */

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

//    Hide Progress bar after 5 seconds // todo 5 seconds


    /**
     *
     *  Run and delay 5 seconds
     *
     *
     */

    public void runWithDelay(){
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                hideProgress();
            }
        }, 5000);
    }
}
