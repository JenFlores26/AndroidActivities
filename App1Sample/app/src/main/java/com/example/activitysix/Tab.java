package com.example.activitysix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Tab extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager viewPager;
    private TabItem personal, like, hobby;
    public PagerAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tab = (TabLayout) findViewById(R.id.tab);
        personal = (TabItem) findViewById(R.id.personal);
        like = (TabItem) findViewById(R.id.like);
        hobby = (TabItem) findViewById(R.id.hobby);
        viewPager = findViewById(R.id.viewpager);

        pageAdapter = new PageAdapter(getSupportFragmentManager(), tab.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 1) {
                    pageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 2) {
                    pageAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));
    }
}