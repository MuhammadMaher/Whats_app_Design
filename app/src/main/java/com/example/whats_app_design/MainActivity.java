package com.example.whats_app_design;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// ربطت الادبتر بال view pager لو عملت scroll هتتنفذ معايا
    viewPager2=findViewById(R.id.view_pager2);
    Adapter adapter=new Adapter(this);
    viewPager2.setAdapter(adapter);
    //.
    tabLayout=findViewById(R.id.tab_layout);
    //   هستخدم class جديد يربط ال (tabLayout) مع (viewpager2) من حيث الحركة بتاعتهم  ويرجع callBackInterface
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setIcon(R.drawable.ic_round_camera_alt_24);
//                        View view1 = getLayoutInflater().inflate(R.layout.my_custom_tab, null);
//                        tab.setCustomView(view1);
//                        LinearLayout layout = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0));
//                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
//                        layoutParams.weight = LinearLayout.LayoutParams.WRAP_CONTENT; // e.g. 0.5f
//                        layout.setLayoutParams(layoutParams);
                        break;
                    case 1:
                        tab.setText("Chats");
                        viewPager2.setCurrentItem(1);
                        break;
                    case 2:
                        tab.setText("Status");
                        break;
                    case 3:
                        tab.setText("Calls");
                        break;
                }

            }
        });
        tabLayoutMediator.attach();


    }



}