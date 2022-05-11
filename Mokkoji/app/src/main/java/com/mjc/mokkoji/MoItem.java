package com.mjc.mokkoji;

public class MoItem {

    public MoItem(int a_imageResId, String a_strItem) {
        mImageResId = a_imageResId;
        mStrItem = a_strItem;
    }

    private int mImageResId;

    private String mStrItem;

    public void setImageResId(int a_imageResId) {
        mImageResId = a_imageResId;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public void setItem(String a_strItem) {
        mStrItem = a_strItem;
    }

    public String getMoItem() {
        return mStrItem;
    }
}