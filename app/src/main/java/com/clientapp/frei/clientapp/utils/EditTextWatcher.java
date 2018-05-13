package com.clientapp.frei.clientapp.utils;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditTextWatcher implements TextWatcher{

    private static final String emailPattern = "^[\\w\\.\\-]{3,}@[A-Za-z0-9\\-]{2,}\\.[A-Za-z]{2,3}$";

    Context mContext;
    EditText mEditText;
    TextInputLayout mTextInputLayout;

    public EditTextWatcher(Context context, EditText editText) {
        mContext = context;
        mEditText = editText;
        mTextInputLayout = (TextInputLayout) editText.getParent();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        String str = s.toString().toLowerCase();
        if (str.contains("http://")) {
            mEditText.setText(str.replace("http://", ""));
        }
        if (str.contains("https://")) {
            mEditText.setText(str.replace("https://", ""));
        }
    }

    @Override
    public void afterTextChanged(Editable s) {

        switch (mEditText.getId()) {
            case R.id.phone_et:
                checkPhoneString(s.toString(), mContext.getString(R.string.error_phone_et));
                break;
            case R.id.email_et:
                checkInputString(emailPattern, s.toString(), mContext.getString(R.string.error_email_et));
                break;
            case R.id.vk_et:
                checkInputString(vkPattern, s.toString(), mContext.getString(R.string.error_vk_et));
                break;
            case R.id.git_et:
                checkInputString(gitPattern, s.toString(), mContext.getString(R.string.error_git_et));
                break;
        }

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
