package eu.laramartin.toykoguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lara on 1/9/16.
 */
public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) new SightsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
