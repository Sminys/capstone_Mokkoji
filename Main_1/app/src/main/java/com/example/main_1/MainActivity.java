package com.example.main_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<RecyclerViewItem> mList;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInit();

        for(int i=1;i<=10;i++){
            if(i == 1)
            addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 2)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 3)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 4)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 5)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 6)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 7)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 8)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 9)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
            else if(i == 10)
                addItem("iconName", "인기게시글" + i, "인기게시글 부연설명(작성자..)");
        }

        mRecyclerViewAdapter = new RecyclerViewAdapter(mList);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
    }

    public void firstInit(){
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mList = new ArrayList<>();
    }

    public void addItem(String imgName, String mainText, String subText){
        RecyclerViewItem item = new RecyclerViewItem();

        item.setImgName(imgName);
        item.setMainText(mainText);
        item.setSubText(subText);

        mList.add(item);
    }
}