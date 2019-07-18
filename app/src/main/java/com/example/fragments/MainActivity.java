package com.example.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    TabLayout mTabLayout;
    ViewPager mViewPager;
    TabViewPagerAdapter mTabViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.viewPager); 
        mTabViewPagerAdapter = new TabViewPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mTabViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
