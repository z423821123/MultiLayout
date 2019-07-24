package com.example.asus.multilayout.holder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.adapter.CommentAdapter;
import com.example.asus.multilayout.bean.IMainBean;
import com.example.asus.multilayout.bean.CommentListBean;
import com.example.asus.multilayout.bean.CommentData;


import java.util.List;


/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class CommentHolder extends MainViewHolder{

    private RecyclerView recyclerView;
    private CommentAdapter notesHotAdapter;

    public CommentHolder(View itemView) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_notes_hot);
        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        notesHotAdapter = new CommentAdapter();
        recyclerView.setAdapter(notesHotAdapter);
    }

    @Override
    public void bindItem(IMainBean iMainBean) {
        CommentListBean commentListBean = (CommentListBean) iMainBean;
        List<CommentData> notesHot = commentListBean.commentData;
        notesHotAdapter.setData(notesHot);
        notesHotAdapter.notifyDataSetChanged();
    }


}
