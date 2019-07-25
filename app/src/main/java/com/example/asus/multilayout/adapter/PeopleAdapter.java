package com.example.asus.multilayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.bean.PeopleBean;


import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleHotViewHolder> {

    private List<PeopleBean> peopleHot;
    private Context context;

    public void setData(List<PeopleBean> peopleHot) {
        this.peopleHot = peopleHot;
    }

    @Override
    public PeopleHotViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_travelnotes_people_hot_items, parent, false);
        return new PeopleHotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PeopleHotViewHolder holder, int position) {
        final PeopleBean people = peopleHot.get(position);
    //    holder.name_tv.setText(people.name);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int margin_horizontal = context.getResources().getDimensionPixelSize(R.dimen.padding_size_default);
        lp.setMargins(margin_horizontal / 2, margin_horizontal / 2, margin_horizontal / 2, margin_horizontal / 2);
        holder.itemView.setLayoutParams(lp);

    }

    @Override
    public int getItemCount() {
        return peopleHot != null ? peopleHot.size() : 0;
    }


    public static class PeopleHotViewHolder extends RecyclerView.ViewHolder {

        ImageView header_iv;
        TextView name_tv;
        RelativeLayout hot_rl;
        PeopleHotViewHolder(View itemView) {
            super(itemView);
            header_iv = (ImageView) itemView.findViewById(R.id.header_iv);
            name_tv = (TextView) itemView.findViewById(R.id.name_tv);
            hot_rl = (RelativeLayout) itemView.findViewById(R.id.rl_hot_people);
        }
    }
}
