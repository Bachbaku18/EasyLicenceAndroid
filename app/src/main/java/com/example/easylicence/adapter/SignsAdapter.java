package com.example.easylicence.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easylicence.R;
import com.example.easylicence.ViewsHolder.MySignsViewHolder;
import com.example.easylicence.models.TrafficSigns;

import java.util.ArrayList;
import java.util.List;

public class SignsAdapter extends RecyclerView.Adapter<MySignsViewHolder> implements Filterable {
    Context context;
    private List<TrafficSigns> items;

    private List<TrafficSigns> itemsOld;
    public SignsAdapter(Context context, List<TrafficSigns> items) {
        this.context = context;
        this.items = items;
        this.itemsOld = items;
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


    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String strSearch = constraint.toString();
                if(strSearch.isEmpty()){
                    items = itemsOld;
                }else{
                    List<TrafficSigns> list = new ArrayList<>();
                    for (TrafficSigns sign : itemsOld){
                        if(sign.getName().toLowerCase().contains(strSearch.toLowerCase())){
                            list.add(sign);
                        }
                    }
                    items = list;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = items;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                 items = (List<TrafficSigns>) results.values;
                 notifyDataSetChanged();
            }
        };
    }
}
