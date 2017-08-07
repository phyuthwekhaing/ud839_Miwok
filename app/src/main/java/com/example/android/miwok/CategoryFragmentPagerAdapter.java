package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by PHYUTHWEHTETHTET on 7/28/2017.
 */

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {
    private int pageCount = 4;
    private String[] fragmentTitles = new String[]{"Numbers", "Family", "Colors", "Phrases"};
    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       switch(position){
           case 0: return new NumbersFragment();
           case 1: return new FamilyFragment();
           case 2: return new ColorsFragment();
           case 3: return new PhrasesFragment();
       }
       return new NumbersFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitles[position];
    }

    @Override
    public int getCount() {
        return pageCount;
    }
}
