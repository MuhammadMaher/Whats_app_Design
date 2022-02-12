package com.example.whats_app_design.Chats;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whats_app_design.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ChatsHolder> {

    private Context context;
    private ArrayList<ChatsModels> chatsList;

    public ChatsAdapter(Context context, ArrayList<ChatsModels> chatsList) {
        this.context = context;
        this.chatsList = chatsList;
    }

    @NonNull
    @Override
    public ChatsHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);
        ChatsHolder chatsHolder=new ChatsHolder(view);
        return chatsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsAdapter.ChatsHolder holder, int position) {
        ChatsModels chatsModels=chatsList.get(position);
        holder.textViewName.setText(chatsModels.getName());
        Picasso.get().load(chatsModels.getImageUrl()).into(holder.imageViewUrl);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, Chatting_Screen.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return chatsList.size();
    }

    class ChatsHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        ImageView imageViewUrl;

        public ChatsHolder(@NonNull  View itemView) {
            super(itemView);
       textViewName=itemView.findViewById(R.id.tv_name);
       imageViewUrl=itemView.findViewById(R.id.circle_image);
        }

    }
}
