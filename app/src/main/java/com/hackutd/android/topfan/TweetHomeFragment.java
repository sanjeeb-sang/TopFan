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

public class TweetHomeFragment extends Fragment {

    public TweetHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_tweet_home, container, false);
        final ArrayList<Comment> commentsArray = new ArrayList<Comment>();

        commentsArray.add(new Comment("Christiano Ronaldo is a great player.", true, false));
        commentsArray.add(new Comment("Lionel Messi is a great player.", true, false));
        commentsArray.add(new Comment("Gareth Bale is a great player.", true, false));
        commentsArray.add(new Comment("Anthony Martial is a great player.", true, false));


        ListView listView = (ListView) rootView.findViewById(R.id.tweet_home_list);
        ListCommentAdapter mListCommentAdapter = new ListCommentAdapter(getContext(), R.layout.fragment_tweet_home_option, commentsArray);

        listView.setAdapter(mListCommentAdapter);

        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();

    }

}
