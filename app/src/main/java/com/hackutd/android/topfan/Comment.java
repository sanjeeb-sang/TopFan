package com.hackutd.android.topfan;

/**
 * Created by Sanjeeb on 3/5/2017.
 */

public class Comment extends Object {
    private String mCommentText = "";
    private boolean isThumbsUp = false;
    private boolean isThumbsDown = false;

    public Comment(){

    }

    public Comment(String commentText, boolean thumbsUp, boolean thumbsDown){
        mCommentText = commentText;
        isThumbsDown = thumbsDown;
        isThumbsUp = thumbsUp;

    }


    public void setCommentText(String mCommentText) {
        this.mCommentText = mCommentText;
    }

    public void isThumbsDown(boolean isThumbsDown) {
        this.isThumbsDown = isThumbsDown;
    }

    public void isThumbsUp(boolean isThumbsUp) {
        this.isThumbsUp = isThumbsUp;
    }

    public String getCommentText() {
        return mCommentText;
    }

    public boolean isThumbsDown() {
        return isThumbsDown;
    }

    public boolean isThumbsUp() {
        return isThumbsUp;
    }
}
