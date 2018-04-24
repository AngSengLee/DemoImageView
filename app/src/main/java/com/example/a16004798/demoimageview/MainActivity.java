package com.example.a16004798.demoimageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dynamically create image in imageView 
        ImageView ivDay2 = (ImageView)findViewById(R.id.imageView2);
        ivDay2.setImageResource(R.drawable.day2);
    }
}
