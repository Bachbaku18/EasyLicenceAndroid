package com.example.easylicence.ViewsHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easylicence.R;

public class MySignsViewHolder extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public TextView codeView;
    public TextView nameView;
    public MySignsViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        codeView = itemView.findViewById(R.id.code);
        nameView = itemView.findViewById(R.id.name);
    }
}
