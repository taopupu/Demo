package com.example.a56890.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

List<OrderBean> list;
    Context context;

    public MyAdapter(List<OrderBean> list) {
        this.list = list;
    }

    @Override
    public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context=parent.getContext();
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false));
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {
         holder.img_pic.setBackgroundResource(list.get(position).pic);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img_pic,img_phone;
        TextView tv_name,tv_phone;
        ViewGroup viewGroup;
        public MyHolder(View itemView) {
            super(itemView);
            img_phone= (ImageView) itemView.findViewById(R.id.img_phone);
            img_pic= (ImageView) itemView.findViewById(R.id.img_pic);
            tv_name= (TextView) itemView.findViewById(R.id.tv_name);
            tv_phone= (TextView) itemView.findViewById(R.id.tv_phone);
            viewGroup= (ViewGroup) itemView.findViewById(R.id.lin_phone);
        }
    }
}
