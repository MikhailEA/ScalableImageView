package com.michev_work.scalableimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class MainActivity extends AppCompatActivity {
    private SubsamplingScaleImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable.chanterelle));

        //imageView.setImage(ImageSource.asset("map.png"));
        //imageView.setImage(ImageSource.uri("/sdcard/DCIM/DSCM00123.JPG"));
    }
}