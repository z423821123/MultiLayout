package com.example.asus.multilayout.bean;

import com.example.asus.multilayout.type.IMainTypeFactory;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class PropertyBean implements IMainBean{

    public String title;

    public PropertyBean(String title) {
        this.title = title;
    }

    @Override
    public int type(IMainTypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
