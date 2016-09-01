package eu.laramartin.toykoguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lara on 1/9/16.
 */
public class SightsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        /*List<Location> list = new ArrayList<>();
        Sights.initSightsList(list);

        Log.v("MainActivity", list.get(0).toString());


        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = super.onCreateView(inflater, container, savedInstanceState);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;*/
        ViewPager = (ViewPager) findViewById(R.id.pager);
        ViewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        // When swiping between pages, select the
                        // corresponding tab.
                        getActionBar().setSelectedNavigationItem(position);
                    }
                });

    }
}
