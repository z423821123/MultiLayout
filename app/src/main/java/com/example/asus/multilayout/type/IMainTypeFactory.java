package com.example.asus.multilayout.type;

import android.view.View;

import com.example.asus.multilayout.bean.CommentListBean;
import com.example.asus.multilayout.bean.PeopleListBean;
import com.example.asus.multilayout.bean.PropertyBean;
import com.example.asus.multilayout.holder.MainViewHolder;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public interface IMainTypeFactory {
    int type(PeopleListBean name);
    int type(PropertyBean property);
    int type(CommentListBean name);

    MainViewHolder onCreateViewHolder(View itemView, int viewType);
}
