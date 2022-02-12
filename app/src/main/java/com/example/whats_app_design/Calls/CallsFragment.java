package com.example.whats_app_design.Calls;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whats_app_design.Adapter;
import com.example.whats_app_design.Chats.ChatsAdapter;
import com.example.whats_app_design.R;
import com.example.whats_app_design.Status.StatusAdapter;
import com.example.whats_app_design.Status.StatusModel;

import java.util.ArrayList;

public class CallsFragment extends Fragment {
ArrayList<CallsModels> callsModels22=new ArrayList<>();
    RecyclerView recyclerView;
    CallsAdapter callsAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        callsData();
        recyclerView=view.findViewById(R.id.rv_calls);
        callsAdapter = new CallsAdapter(callsModels22,getContext());

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(callsAdapter);

    }

    private void callsData(){
        CallsModels callsModels1=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels1);
        CallsModels callsModel2=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModel2);
        CallsModels callsModel3=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModel3);
        CallsModels callsModels4=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels4);
        CallsModels callsModels5=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels5);
        CallsModels callsModels6=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels6);
        CallsModels callsModels7=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels7);
        CallsModels callsModels8=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels8);
        CallsModels callsModels9=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels9);
        CallsModels callsModels10=new CallsModels("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        callsModels22.add(callsModels10);
    }
}