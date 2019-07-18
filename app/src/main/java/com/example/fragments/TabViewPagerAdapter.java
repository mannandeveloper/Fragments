package com.example.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabViewPagerAdapter extends FragmentPagerAdapter
{

    public TabViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new MensWear();
        }
        else if (position == 1)
        {
            return new WomensWear();
        }
        else
        {
            return new KidsWear();
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0 : return "Mens Wear";
            case 1 : return "Womens Wear";
            case 2 : return "Kids Wear";
            default: return null;
        }
    }
}
