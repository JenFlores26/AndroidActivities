package com.example.activitysix;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class PageAdapter extends FragmentPagerAdapter {
    private int numoftabs;
    public PageAdapter(FragmentManager fm,int numofTabs) {
        super(fm);
        this.numoftabs = numofTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:return new Personal();
            case 1: return new Like();
            case 2: return new Hobby();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
