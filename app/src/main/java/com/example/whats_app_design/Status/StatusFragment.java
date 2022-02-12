package com.example.whats_app_design.Status;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whats_app_design.Chats.ChatsAdapter;
import com.example.whats_app_design.R;

import java.util.ArrayList;

public class StatusFragment extends Fragment {

    ArrayList<StatusModel> statusModels=new ArrayList<>();
    RecyclerView recyclerView;
    StatusAdapter statusAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //data
        data();
       recyclerView=view.findViewById(R.id.rv_status);
        statusAdapter= new StatusAdapter(getContext(),statusModels);
        recyclerView = view.findViewById(R.id.rv_status);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(statusAdapter);
    }
    private void data(){
        StatusModel statusModel=new StatusModel("ali","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel);
        StatusModel statusModel2=new StatusModel("yasser","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel2);
        StatusModel statusModel3=new StatusModel("Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel3);
        StatusModel statusModel4=new StatusModel("Mohamed ","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel4);
        StatusModel statusModel5=new StatusModel("Ebrahim","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel5);
        StatusModel statusModel6=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel6);
        StatusModel statusModel7=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel7);
        StatusModel statusModel8=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel8);
        StatusModel statusModel9=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel9);
        StatusModel statusModel10=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel10);
        StatusModel statusModel11=new StatusModel("Mohamed Maher","before 2 mints","https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        statusModels.add(statusModel11);
        
        
        
    }
}
