package com.example.applicationglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private String mImageAddress =
            "https://www.allmmorpg.ru/wp-content/uploads/2021/02/fito-azury-gambar-gw-5-original.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);

        // Загружаем картинку
        Glide
                .with(this)
                .load(mImageAddress)
                .into(mImageView);
    }
}