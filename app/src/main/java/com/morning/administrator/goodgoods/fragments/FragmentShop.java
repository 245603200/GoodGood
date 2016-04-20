package com.morning.administrator.goodgoods.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.morning.administrator.goodgoods.R;
import com.morning.administrator.goodgoods.adapters.TabAdapter;
import com.morning.administrator.goodgoods.fragments.tabfragments.FragmentClass;
import com.morning.administrator.goodgoods.fragments.tabfragments.FragmentGift;
import com.morning.administrator.goodgoods.fragments.tabfragments.FragmentHome;
import com.morning.administrator.goodgoods.fragments.tabfragments.FragmentLogo;
import com.morning.administrator.goodgoods.fragments.tabfragments.FragmentTopic;

import java.util.ArrayList;
import java.util.List;

/**
 * 商店界面
 */
public class FragmentShop extends Fragment {

    public static final String TAG = FragmentShop.class.getSimpleName();
    private View view;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private TabAdapter adapter;
    private Fragment cacheFragment;
    private FragmentManager fragmentManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shop, container, false);
        initView();
        return view;
    }

    private void initView() {
        mTabLayout = ((TabLayout) view.findViewById(R.id.tab));
        mViewPager = ((ViewPager) view.findViewById(R.id.viewpager));

        //如果个数据不足够填满屏幕,设置MODE_FIXED之后会将屏幕按比例划分,填满屏幕
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

        List<String> title = new ArrayList<>();
        title.add("分类");
        title.add("品牌");
        title.add("首页");
        title.add("专题");
        title.add("礼物");

        adapter = new TabAdapter(getChildFragmentManager(), getFragment(), title);
        mViewPager.setAdapter(adapter);
        //使viewpager与tablayout联动
        mTabLayout.setupWithViewPager(mViewPager);
        //设置默认显示页面
        mViewPager.setCurrentItem(2);

//        cacheFragment = new FragmentHome();
//        fragmentManager = getChildFragmentManager();
//        fragmentManager.beginTransaction().add(R.id.shop_frame, cacheFragment, FragmentHome.TAG).commit();

    }

    //添加fragment
    private List<Fragment> getFragment() {

        List<Fragment> data = new ArrayList<>();
        FragmentClass fragmentClass = new FragmentClass();
        FragmentLogo fragmentLogo = new FragmentLogo();
        FragmentHome fragmentHome = new FragmentHome();
        FragmentTopic fragmentTopic = new FragmentTopic();
        FragmentGift fragmentGift = new FragmentGift();

        data.add(fragmentClass);
        data.add(fragmentLogo);
        data.add(fragmentHome);
        data.add(fragmentTopic);
        data.add(fragmentGift);

        return data;
    }
}
