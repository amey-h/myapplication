package com.example.mylibrary;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MyLibActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylib);

        Log.d("MyLibActivity", "onCreate");

        imageView = (ImageView) findViewById(R.id.icon);

        String url = "http://i.imgur.com/DvpvklR.png";

        Log.d("MyLibActivity", "ImageUrl: " + url);

        try {
            Log.d("MyLibActivity", "trying to load image");
            Picasso.with(MyLibActivity.this).load(url).
                    error(getResources().getDrawable(R.drawable.vod_service)).into(imageView);
        }  catch (Exception e) {
            Log.e("MyLibActivity", e.getMessage());
            e.printStackTrace();

        }
    }
}
