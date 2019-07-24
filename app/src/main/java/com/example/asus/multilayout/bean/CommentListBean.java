package com.example.asus.multilayout.bean;

import android.support.annotation.NonNull;

import com.example.asus.multilayout.type.IMainTypeFactory;

import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class CommentListBean implements IMainBean{

    public List<CommentData> commentData;

    public void setCommentData(List<CommentData> commentData) {
        this.commentData = commentData;
    }

    public CommentListBean(@NonNull List<CommentData> notesHot) {
        this.commentData = notesHot;
    }

    @Override
    public int type(IMainTypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
