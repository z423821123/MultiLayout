package com.example.asus.multilayout.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.asus.multilayout.bean.IMainBean;
import com.example.asus.multilayout.type.IMainTypeFactory;
import com.example.asus.multilayout.holder.MainViewHolder;

import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private IMainTypeFactory mTypeFactory;
    private List<IMainBean> mVisitables;

    public MainAdapter(IMainTypeFactory typeFactory, List<IMainBean> visitables) {
        mTypeFactory = typeFactory;
        mVisitables = visitables;
    }

    @Override
    public int getItemViewType(int position) {
        return mVisitables.get(position).type(mTypeFactory);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mTypeFactory.onCreateViewHolder(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false), viewType);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.bindItem(mVisitables.get(position));
    }

    @Override
    public int getItemCount() {
        return mVisitables.size();
    }

}
