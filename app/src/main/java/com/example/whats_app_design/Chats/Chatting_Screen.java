package com.example.whats_app_design.Chats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.whats_app_design.R;

public class Chatting_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting_screen);
    }

    public void arrowBack(View view) {
        Intent intent=new Intent(Chatting_Screen.this,ChatsFragment.class);
        startActivity(intent);
    }
}