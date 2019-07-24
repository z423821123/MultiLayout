package com.example.asus.multilayout.holder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.adapter.PeopleAdapter;
import com.example.asus.multilayout.bean.IMainBean;
import com.example.asus.multilayout.bean.PeopleBean;
import com.example.asus.multilayout.bean.PeopleListBean;


import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class PeopleViewHolder extends MainViewHolder{

    private RecyclerView recyclerView;
    private PeopleAdapter peopleAdapter;


    public PeopleViewHolder(View itemView) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_people_hot);
        LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        peopleAdapter = new PeopleAdapter();
        recyclerView.setAdapter(peopleAdapter);
    }

    @Override
    public void bindItem(IMainBean iMainBean) {
        PeopleListBean productList = (PeopleListBean) iMainBean;
        List<PeopleBean> products = productList.peopleBeanList;
        peopleAdapter.setData(products);
        peopleAdapter.notifyDataSetChanged();
    }
}
