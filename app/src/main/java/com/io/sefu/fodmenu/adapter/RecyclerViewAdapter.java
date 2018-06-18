package com.io.sefu.fodmenu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.io.sefu.fodmenu.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyView> {

    private List<String> list;

    public class MyView extends RecyclerView.ViewHolder {

        public TextView textViewHotelName;

        public MyView(View view) {
            super(view);

            textViewHotelName = (TextView) view.findViewById(R.id.foodName);

        }
    }


    public RecyclerViewAdapter(List<String> horizontalList) {
        this.list = horizontalList;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);

        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(final MyView holder, final int position) {

        holder.textViewHotelName.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}