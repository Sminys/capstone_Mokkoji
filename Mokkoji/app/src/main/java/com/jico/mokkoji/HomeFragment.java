package com.jico.mokkoji;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public  class HomeFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup homeLayout, Bundle SavedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, homeLayout, false);
    }
}