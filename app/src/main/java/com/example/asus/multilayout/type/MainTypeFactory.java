package com.example.asus.multilayout.type;

import android.view.View;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.bean.CommentListBean;
import com.example.asus.multilayout.bean.PeopleListBean;
import com.example.asus.multilayout.bean.PropertyBean;
import com.example.asus.multilayout.holder.MainViewHolder;
import com.example.asus.multilayout.holder.CommentHolder;
import com.example.asus.multilayout.holder.PeopleViewHolder;
import com.example.asus.multilayout.holder.PropertyViewHolder;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class MainTypeFactory implements IMainTypeFactory {
    @Override
    public int type(PeopleListBean name) {
        return R.layout.fragment_travelnotes_people_hot;
    }

    @Override
    public int type(PropertyBean property) {
        return R.layout.fragment_travelnotes_property;
    }

    @Override
    public int type(CommentListBean name) {
        return R.layout.fragment_travelnotes_hot;
    }

    @Override
    public MainViewHolder onCreateViewHolder(View itemView, int viewType) {
        MainViewHolder viewHolder = null;
        switch (viewType) {
            case R.layout.fragment_travelnotes_people_hot:
                viewHolder = new PeopleViewHolder(itemView);
                break;

            case R.layout.fragment_travelnotes_property:
                viewHolder = new PropertyViewHolder(itemView);
                break;

            case R.layout.fragment_travelnotes_hot:
                viewHolder = new CommentHolder(itemView);
                break;
            default:
                break;
        }
        return viewHolder;
    }
}
