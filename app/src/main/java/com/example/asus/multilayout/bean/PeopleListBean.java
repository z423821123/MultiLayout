package com.example.asus.multilayout.bean;

import android.support.annotation.NonNull;

import com.example.asus.multilayout.type.IMainTypeFactory;

import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class PeopleListBean implements IMainBean{

    public List<PeopleBean> peopleBeanList;

    public PeopleListBean(@NonNull List<PeopleBean> peopleHot) {
        this.peopleBeanList = peopleBeanList;
    }


    @Override
    public int type(IMainTypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
