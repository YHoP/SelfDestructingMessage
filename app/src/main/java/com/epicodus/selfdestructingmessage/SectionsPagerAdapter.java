package com.epicodus.selfdestructingmessage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;
    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
//        Fragment fragment = new DummySectionFragment();
//        Bundle args = new Bundle();
//        args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
//        fragment.setArguments(args);

        switch(position) {
            case 0:
                return new InboxFragment();
            case 1:
                return new FriendsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.title_section2).toUpperCase(l);
//            case 2:
//                return mContext.getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}