package com.mjc.mokkoji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public interface ExtraKey {
        String IMAGE_RES_ID = "ImageResourceId";
    }

    // 이미지 클릭 이벤트를 위한 listener
    public interface ImageItemClickListener {
        void onImageItemClick(int a_imageResId) ;
    }

    // List item
    private List<MoItem> mItemList;

    // ListView adapter
    private MoArrayAdapter mCountryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindList();
    }

    private void bindList() {
        mItemList = new ArrayList<>();
        mItemList.add(new MoItem(R.mipmap.ic_launcher, "A"));
        mItemList.add(new MoItem(R.mipmap.ic_launcher, "B"));
        mItemList.add(new MoItem(R.mipmap.ic_launcher, "C"));
        mItemList.add(new MoItem(R.mipmap.ic_launcher, "D"));
        mItemList.add(new MoItem(R.mipmap.ic_launcher, "E"));

        mCountryAdapter = new MoArrayAdapter(this, mItemList);

        // List item 중 image view click event 처리
        mCountryAdapter.setImageItemClickListener(new ImageItemClickListener() {
            @Override
            public void onImageItemClick(int a_imageResId) {
                Intent intent = new Intent(MainActivity.this, com.mjc.mokkoji.ImageActivity.class);
                intent.putExtra(ExtraKey.IMAGE_RES_ID, a_imageResId);
                startActivity(intent);
            }
        });

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(mCountryAdapter);
    }
}

