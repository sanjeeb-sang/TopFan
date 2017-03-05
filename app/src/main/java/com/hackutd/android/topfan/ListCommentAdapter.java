package com.hackutd.android.topfan;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanjeeb on 3/5/2017.
 */

public class ListCommentAdapter extends ArrayAdapter<Comment> {
    private Context mContext;
    private int mResourceId;
    private ArrayList<Comment> commentObjects;
    private Comment mCurrentComment;
    private View mCurrentView;
    private TextView mCommentTextView;
    private ImageView mThumbsUpIV;
    private ImageView mThumbsDownIV;

    public ListCommentAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public ListCommentAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Comment[] objects) {
        super(context, resource, objects);
    }

    public ListCommentAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Comment> objects) {
        super(context, resource, objects);
        mContext = context;
        mResourceId = resource;
        commentObjects = (ArrayList<Comment>) objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        mCurrentComment = commentObjects.get(position);

        mCurrentView = convertView;

        if (mCurrentView == null){

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());

            mCurrentView = layoutInflater.inflate(mResourceId, parent, false);
        }

        mCommentTextView = (TextView) mCurrentView.findViewById(R.id.comment_text_view);

        mThumbsUpIV = (ImageView) mCurrentView.findViewById(R.id.thumbs_up_image_view);

        mThumbsDownIV = (ImageView) mCurrentView.findViewById(R.id.thumbs_down_image_view);

        mCommentTextView.setText(mCurrentComment.getCommentText());

        if (mCurrentComment.isThumbsDown()){
            // do something when it is thumbs up
        }
        if (mCurrentComment.isThumbsUp()){
            // do something when it is thumbs down
        }

        return mCurrentView;
    }
}
