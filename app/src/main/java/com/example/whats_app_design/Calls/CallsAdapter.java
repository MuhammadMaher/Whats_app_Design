package com.example.whats_app_design.Calls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whats_app_design.R;
import com.example.whats_app_design.Status.StatusAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.CallsHolder> {

    ArrayList<CallsModels> calls;
    private Context context;

    public CallsAdapter(ArrayList<CallsModels> calls, Context context) {
        this.calls = calls;
        this.context = context;
    }

    @NonNull
    @Override
    public CallsHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calls,parent,false);
        CallsHolder callsHolder=new CallsHolder(view);
        return callsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  CallsHolder holder, int position) {
        CallsModels callsModels=calls.get(position);
        holder.textViewName.setText(callsModels.getName());
        holder.textViewDate.setText(callsModels.getDate());
        Picasso.get().load(callsModels.getImage()).into(holder.imageViewImage);
    }
    @Override
    public int getItemCount() {
        return calls.size();
    }

    class CallsHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewDate;
        ImageView imageViewImage;

        public CallsHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.item_calls_tv_name);
            textViewDate = itemView.findViewById(R.id.item_calls_date);
            imageViewImage = itemView.findViewById(R.id.item_calls_circle_image);

        }
    }


}