package com.example.whats_app_design;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.whats_app_design.Calls.CallsFragment;
import com.example.whats_app_design.Camera.CameraFragment;
import com.example.whats_app_design.Chats.ChatsFragment;
import com.example.whats_app_design.Status.StatusFragment;

public class Adapter  extends FragmentStateAdapter {
    public Adapter(@NonNull  FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int i) {
        switch (i){
            case 0:
                return new CameraFragment();
            case 1:
                return new ChatsFragment();
            case 2:
                return new StatusFragment();
            case 3:
                return new CallsFragment();

        }
        return null;
    }



    @Override
    public int getItemCount() {
        return 4;
    }
}
