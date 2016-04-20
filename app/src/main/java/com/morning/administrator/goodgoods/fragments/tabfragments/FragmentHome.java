package com.morning.administrator.goodgoods.fragments.tabfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morning.administrator.goodgoods.R;

/**
 *
 */
public class FragmentHome extends Fragment {

    public static final String TAG = FragmentHome.class.getSimpleName();
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shop_home, container, false);

        return view;
    }
}
