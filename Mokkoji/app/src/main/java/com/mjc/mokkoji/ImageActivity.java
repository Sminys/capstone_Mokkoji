package com.mjc.mokkoji;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.mjc.mokkoji.MainActivity.ExtraKey;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        bindImage();
    }

    private void bindImage() {
        int imageResId = 0;
        Intent intent = getIntent();
        if (intent != null) {
            imageResId = intent.getIntExtra(ExtraKey.IMAGE_RES_ID, 0);
        }

        if (imageResId > 0) {
            ImageView ivFlag = (ImageView) findViewById(R.id.iv_flag);
            ivFlag.setImageResource(imageResId);
        }
    }
}