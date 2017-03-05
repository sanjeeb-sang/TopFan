package com.hackutd.android.topfan;

/**
 * Created by Sanjeeb on 3/4/2017.
 */

public class Option extends Object {
    private String mOptionWord = "";
    private boolean mIsChecked = false;

    public Option() {

    }

    public Option(String optionWord, boolean isChecked) {
        mOptionWord = optionWord;
        mIsChecked = isChecked;
    }
}
