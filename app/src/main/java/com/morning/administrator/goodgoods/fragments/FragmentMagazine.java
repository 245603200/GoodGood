package com.morning.administrator.goodgoods.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morning.administrator.goodgoods.R;

/**
 * Created by Administrator on 16-4-18.
 */
public class FragmentMagazine extends Fragment {
    public static final String TAG = FragmentMagazine.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_magazine, container, false);
        return view;
    }
}
