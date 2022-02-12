package com.example.whats_app_design.Chats;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whats_app_design.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {

    ArrayList<ChatsModels> chat=new ArrayList<>();
     RecyclerView recyclerView;
     ChatsAdapter chatsAdapter;
//    private ArrayList<String> names ;
TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list();
        chatsAdapter = new ChatsAdapter(requireContext(), chat);
        recyclerView = view.findViewById(R.id.rv_chat);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(chatsAdapter);
    }

    private void list() {

        ChatsModels chatsModels1 = new ChatsModels("ali",  "https://cdn.shopify.com/s/files/1/0984/4522/products/Android-Studio-T-Shirt-4_large.jpg?v=1578321810");
        chat.add(chatsModels1);
        ChatsModels chatsModels2 = new ChatsModels("ahmed",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels2);
        ChatsModels chatsModels3 = new ChatsModels("mohamed",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels3);
        ChatsModels chatsModels4 = new ChatsModels("nour",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels4);
        ChatsModels chatsModels5 = new ChatsModels("Jhon",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels5);
        ChatsModels chatsModels6 = new ChatsModels("alaa",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels6);
        ChatsModels chatsModels7 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels7);
        ChatsModels chatsModels8 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels8);
        ChatsModels chatsModels9 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels9);
        ChatsModels chatsModels10 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels10);
        ChatsModels chatsModels11 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels11);
        ChatsModels chatsModels12 = new ChatsModels("ayman",  "https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Juicy-Forest-700.png");
        chat.add(chatsModels12);

//
//        names.add("ahmed");
//        names.add("khaled");
//        names.add("ziyad");
//        names.add("alaa");
//        names.add("Ebrahim");
//        names.add("Ayman");
//        names.add("Aya");
//        names.add("Samy");
//        names.add("Nour");
//        names.add("ali");
//        names.add("jasmine");
//        names.add("jack");
//        names.add("john");
//        names.add("joe");
//        names.add("ross");
    }
//    private void addImages(){
//
//        imageUrl.add("https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/700x474-PST.png");
//        imageUrl.add("https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/700x474-MF.png");
//        imageUrl.add ("https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/700x474-Hot-Choco.png");
//        imageUrl.add("https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Menu/McCafe/Lrg-Tea-700x474.png");
//    }
}