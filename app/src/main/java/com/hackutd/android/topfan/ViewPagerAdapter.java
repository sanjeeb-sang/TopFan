package com.hackutd.android.topfan;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static android.R.attr.fragment;

/**
 * Created by Sanjeeb on 2/8/2017.
 */


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Fragment fragment;
    private String mFragmentTitle;

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                fragment = new CategoryFragment();
                break;
            case 1:
                fragment = new TweetHomeFragment();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                mFragmentTitle = "Category";
                break;
            case 1:
                mFragmentTitle = "Home";
                break;
        }
        return mFragmentTitle;
    }
}
