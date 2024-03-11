package com.example.easylicence.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easylicence.R;
import com.example.easylicence.ViewsHolder.MySignsViewHolder;
import com.example.easylicence.models.TrafficSigns;

import java.util.List;

public class SignsAdapter extends RecyclerView.Adapter<MySignsViewHolder> {
    Context context;
    List<TrafficSigns> items;

    public SignsAdapter(Context context, List<TrafficSigns> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MySignsViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new MySignsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  MySignsViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.codeView.setText(items.get(position).getCode());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
