package com.io.sefu.fodmenu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.io.sefu.fodmenu.fragment.DrinkFragment;
import com.io.sefu.fodmenu.fragment.MealFragment;
import com.io.sefu.fodmenu.fragment.SnackFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                MealFragment mealOne = new MealFragment();
                return mealOne;
            case 1:
                SnackFragment snackOne = new SnackFragment();
                return snackOne;
            case 2:
                DrinkFragment drinkOne = new DrinkFragment();
                return drinkOne;
            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
