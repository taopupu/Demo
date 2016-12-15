package com.example.a56890.demo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    RecyclerView rv_order;
    List<OrderBean> list;
    String[] name;
    String[] phones;
    int image[] = {R.drawable.zhongtong, R.drawable.shentong, R.drawable.yuantong, R.drawable.shunfeng, R.drawable.yunda,
            R.drawable.ems, R.drawable.zhaijisong, R.drawable.quanfeng, R.drawable.huitong, R.drawable.tiantian, R.drawable.debang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addContent();
        init();
    }

    private void init() {
        rv_order = (RecyclerView) findViewById(R.id.rv_order);
        rv_order.setLayoutManager(new LinearLayoutManager(this));
        name = getResources().getStringArray(R.array.names);
        phones = getResources().getStringArray(R.array.phones);
        rv_order.setAdapter(new MyAdapter(list));

    }

    private void addContent() {
        list = new ArrayList<>();
       for (int i=0;i<name.length;i++){
           list.add(new OrderBean(name[i],phones[i],image[i]));
       }
    }
}
