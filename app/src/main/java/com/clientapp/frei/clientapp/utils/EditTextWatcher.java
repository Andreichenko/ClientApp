package com.clientapp.frei.clientapp.utils;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.Patterns;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditTextWatcher {

    private static final String emailPattern = "^[\\w\\.\\-]{3,}@[A-Za-z0-9\\-]{2,}\\.[A-Za-z]{2,3}$";

    Context mContext;
    EditText mEditText;
    TextInputLayout mTextInputLayout;

    public EditTextWatcher(Context context, EditText editText) {
        mContext = context;
        mEditText = editText;
        mTextInputLayout = (TextInputLayout) editText.getParent();
    }


    private void checkInputString(String patternString, String inputString, String error) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.matches()) {
            mTextInputLayout.setErrorEnabled(false);
            mTextInputLayout.setError("");
        } else {
            mTextInputLayout.setErrorEnabled(true);
            mTextInputLayout.setError(error);
        }
    }

    private void checkPhoneString(String inputString, String error) {
        Pattern pattern = Patterns.PHONE;
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.matches() && inputString.length() >= 11 && inputString.length() <= 20) {
            mTextInputLayout.setErrorEnabled(false);
            mTextInputLayout.setError("");
        } else {
            mTextInputLayout.setErrorEnabled(true);
            mTextInputLayout.setError(error);
        }
    }

}
