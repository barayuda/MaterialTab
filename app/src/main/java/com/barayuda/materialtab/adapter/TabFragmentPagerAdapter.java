package com.barayuda.materialtab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.barayuda.materialtab.fragment.Tab1Fragment;
import com.barayuda.materialtab.fragment.Tab2Fragment;

/**
 * Created by barayuda on 10/17/16.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    // nama tabnya
    String[] title = new String[] {
            "Tab 1", "Tab 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // method ini yang akan memanipulasi penampilan Fragmet dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }

}
