package com.example.asus.multilayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asus.multilayout.adapter.MainAdapter;
import com.example.asus.multilayout.bean.IMainBean;
import com.example.asus.multilayout.bean.CommentListBean;
import com.example.asus.multilayout.bean.PeopleBean;
import com.example.asus.multilayout.bean.PeopleListBean;
import com.example.asus.multilayout.bean.PropertyBean;
import com.example.asus.multilayout.bean.CommentData;
import com.example.asus.multilayout.type.IMainTypeFactory;
import com.example.asus.multilayout.type.MainTypeFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZWX
 * Description:
 * on 2019/7/23.
 */
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private MainAdapter mDataAdapter;
    List<IMainBean> iMainBeanList;
    private IMainTypeFactory iMainTypeFactory;
    private List<PeopleBean> peopleBeanList = new ArrayList<>();
    private PeopleListBean peopleListBean = new PeopleListBean(peopleBeanList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_main);
        iMainBeanList = new ArrayList<>();
        iMainTypeFactory = new MainTypeFactory();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDataAdapter = new MainAdapter(iMainTypeFactory, iMainBeanList);
        recyclerView.setAdapter(mDataAdapter);

        getData(iMainBeanList);


    }

    private void getData(List<IMainBean> iMainBean) {
        peopleBeanList.add(new PeopleBean("111","张三",null));
        peopleBeanList.add(new PeopleBean("111","李三",null));
        peopleBeanList.add(new PeopleBean("111","王五",null));

        iMainBean.add(peopleListBean);
        iMainBean.add(new PropertyBean("最新"));

        List<CommentData> rowsBeanList = new ArrayList<>();
        CommentData rowsBean1 = new CommentData();
        CommentData rowsBean2 = new CommentData();
        CommentData rowsBean3 = new CommentData();
        rowsBeanList.add(rowsBean1);
        rowsBeanList.add(rowsBean2);
        rowsBeanList.add(rowsBean3);

        CommentListBean commentListBean = new CommentListBean(rowsBeanList);
        iMainBeanList.add(commentListBean);

        mDataAdapter.notifyDataSetChanged();
    }
}
