package com.example.asus.multilayout.holder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.asus.multilayout.R;
import com.example.asus.multilayout.bean.IMainBean;
import com.example.asus.multilayout.bean.PropertyBean;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class PropertyViewHolder extends MainViewHolder {

    private TextView titleText;
    private RadioButton radioRecommend;
    private RadioButton radioHot;
    private RadioButton radioNew;
    private RadioButton radioNear;
    public PropertyViewHolder(View itemView) {
        super(itemView);
        titleText = (TextView) itemView.findViewById(R.id.title);
        radioRecommend = (RadioButton)itemView.findViewById(R.id.rb_recommend);
        radioHot = (RadioButton)itemView.findViewById(R.id.rb_hot);
        radioNew = (RadioButton) itemView.findViewById(R.id.rb_new);
        radioNear = (RadioButton)itemView.findViewById(R.id.rb_near);

    }

    @Override
    public void bindItem(IMainBean iTravelNotesBean) {
        PropertyBean property = (PropertyBean) iTravelNotesBean;
        titleText.setText(property.title);
        titleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
