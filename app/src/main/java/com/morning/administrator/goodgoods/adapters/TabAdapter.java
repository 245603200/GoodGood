package com.morning.administrator.goodgoods.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * TabLayoutAdapter
 */
public class TabAdapter extends FragmentPagerAdapter {

    private List<Fragment> data;
    private List<String> title;

    public TabAdapter(FragmentManager fm,List<Fragment> data,List<String> title) {
        super(fm);
        this.data = data;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data != null ? data.size():0;
    }

    /**
     * 想要与tablayout进行联动 需要重写getpagetitle方法 这个返回值会作为我们fragment对应的标题
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
