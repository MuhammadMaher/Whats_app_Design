package com.example.whats_app_design.Camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.whats_app_design.R;
import com.google.android.material.tabs.TabLayout;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class CameraFragment extends Fragment {

    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    Button btnCapture;
    ImageView imageView;
    Intent intent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnCapture=(Button) view.findViewById(R.id.btnCapturePicture);
        //imageView = (ImageView) rootView.findViewById(R.id.imageview);

        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);


            }
        });


    }
    //    @Override
//    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        imgCapture =view.findViewById(R.id.image_view);
//        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(camera,Image_Capture_Code);
//    }
//
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 100) {
//            if (resultCode == RESULT_OK) {
//                Bitmap bp = (Bitmap) data.getExtras().get("data");
//                imgCapture.setImageBitmap(bp);
//            } else if (resultCode == RESULT_CANCELED) {
//                Toast.makeText(getActivity(), "Cancelled", Toast.LENGTH_SHORT).show();
//    }
//    }
//    }
}