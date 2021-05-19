package com.gs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.imageView);
        showImage();
    }

    private void showImage() {
        String URL = "https://firebasestorage.googleapis.com/v0/b/fir-1-11768.appspot.com/o/1.jpg?alt=media&token=8397793e-3e42-4e2e-8bb8-f1dd37c147d0";
        Picasso.get()
                .load(URL)
                .into(img);
    }
}