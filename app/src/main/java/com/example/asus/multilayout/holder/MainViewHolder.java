package com.example.asus.multilayout.holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.asus.multilayout.bean.IMainBean;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public abstract class MainViewHolder<T extends IMainBean> extends RecyclerView.ViewHolder {
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindItem(T t);
}
