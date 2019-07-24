package com.example.asus.multilayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.bean.CommentData;


import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.NotesHotViewHolder> {

    private List<CommentData> commentData;
    private Context context;

    public void setData(List<CommentData> commentData) {
        this.commentData = commentData;
    }

    @Override
    public NotesHotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_travelnotes_hot_items, parent, false);
        return new NotesHotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotesHotViewHolder holder, int position) {


        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int margin_horizontal = context.getResources().getDimensionPixelSize(R.dimen.padding_size_default);
        lp.setMargins(margin_horizontal / 2, margin_horizontal / 2, margin_horizontal / 2, margin_horizontal / 2);
        holder.itemView.setLayoutParams(lp);

    }

    @Override
    public int getItemCount() {
        return commentData != null ? commentData.size() : 0;
    }


    public static class NotesHotViewHolder extends RecyclerView.ViewHolder {

        ImageView header_iv;
        ImageView content_iv;
        TextView my_content_tv;
        TextView name_tv;
        TextView clicksNum_tv;
        TextView collectNum_tv;
        TextView commentNum_tv;
        TextView createTime_tv;
        LinearLayout linearLayout;


        NotesHotViewHolder(View itemView) {
            super(itemView);
            header_iv = (ImageView) itemView.findViewById(R.id.head_iv);
            name_tv = (TextView) itemView.findViewById(R.id.name_tv);
            clicksNum_tv = itemView.findViewById(R.id.clicks_num_tv);
            collectNum_tv = itemView.findViewById(R.id.collect_num_tv);
            commentNum_tv = itemView.findViewById(R.id.comment_num_tv);
            my_content_tv = itemView.findViewById(R.id.my_content_tv);
            content_iv = itemView.findViewById(R.id.content_tv);
            createTime_tv = itemView.findViewById(R.id.time_tv);
            linearLayout = itemView.findViewById(R.id.linear_layout);
        }
    }
}
