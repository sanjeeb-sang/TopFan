package com.hackutd.android.topfan;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.hackutd.android.topfan.R;

import java.util.ArrayList;
import java.util.Locale;

public class CategoryFragment extends Fragment {

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_category, container, false);
        final ArrayList<String> mCategoryOptions = new ArrayList<String>();

        mCategoryOptions.add("Sports");
        mCategoryOptions.add("Music");
        mCategoryOptions.add("Film");
        mCategoryOptions.add("Arts");
        mCategoryOptions.add("Pop Culture");



        ListView listView = (ListView) rootView.findViewById(R.id.list);
        ListAdapter mListAdapter = new ListAdapter(getContext(), R.layout.category_fragment_option, mCategoryOptions);

        listView.setAdapter(mListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.category_option_checkBox);
                checkBox.isChecked();

            }
        });

        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();

    }

}
