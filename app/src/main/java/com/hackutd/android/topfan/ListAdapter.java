package com.hackutd.android.topfan;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanjeeb on 3/4/2017.
 */

public class ListAdapter extends ArrayAdapter<String> {

    private ArrayList<String> mCategoryOptions;
    private String mCurrentOption;
    private View mCurrentItemView;
    private CheckBox mCheckBox;
    private int mIntResource;
    private TextView mTextView;


    public ListAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public ListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] objects) {
        super(context, resource, objects);

    }

    public ListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<String> objects) {
        super(context, resource, (List<String>) objects);
        mCategoryOptions = objects;
        mIntResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        mCurrentOption = mCategoryOptions.get(position);

        mCurrentItemView = convertView;

        if (mCurrentItemView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            mCurrentItemView = layoutInflater.inflate(mIntResource, parent, false);
        }

        mCheckBox = (CheckBox) mCurrentItemView.findViewById(R.id.category_option_checkBox);
        mTextView = (TextView) mCurrentItemView.findViewById(R.id.category_option_text_view);

        mTextView.setText(mCurrentOption);

        return mCurrentItemView;
    }

}