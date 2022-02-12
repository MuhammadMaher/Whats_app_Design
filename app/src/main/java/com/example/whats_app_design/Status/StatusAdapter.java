package com.example.whats_app_design.Status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.whats_app_design.Calls.CallsModels;
import com.example.whats_app_design.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class StatusAdapter  extends  RecyclerView.Adapter<StatusAdapter.StatuesHodler>{
    private Context context;
    private ArrayList<StatusModel> statusList;

    public StatusAdapter(Context context, ArrayList<StatusModel> statusList) {
        this.context = context;
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public StatuesHodler onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_status,parent,false);
        StatuesHodler statuesHodler=new StatuesHodler(view);

        return statuesHodler;
    }

    @Override
    public void onBindViewHolder(@NonNull  StatusAdapter.StatuesHodler holder, int position) {
        StatusModel statusModel=statusList.get(position);
        holder.textViewName.setText(statusModel.getName());
        Picasso.get().load(statusModel.getImage()).into(holder.imageViewUrl);
        holder.textViewDate.setText(statusModel.getDate());

    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }


    class StatuesHodler extends RecyclerView.ViewHolder{
        TextView textViewDate;
        TextView textViewName;
        ImageView imageViewUrl;

        public StatuesHodler(@NonNull View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.item_Statue_tv_name);
            imageViewUrl=itemView.findViewById(R.id.item_Statue_circle_image);
            textViewDate=itemView.findViewById(R.id.item_Statue_date);
        }
    }
}
