package eu.laramartin.toykoguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        List<Location> list = new ArrayList<>();
        Sights.initSightsList(list);

        Log.v("MainActivity", list.get(0).toString());


        LocationAdapter adapter = new LocationAdapter(this, -1, list);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);


    }
}
