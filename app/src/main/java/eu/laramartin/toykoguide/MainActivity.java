package eu.laramartin.toykoguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Location> list = new ArrayList<>();
        Sights.initSightsList(list);

        Log.v("MainActivity", list.get(0).toString());
    }
}
