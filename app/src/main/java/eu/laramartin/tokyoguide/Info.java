package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Info {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info_internet_name),
                context.getString(R.string.info_internet_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_konbini_name),
                context.getString(R.string.info_konbini_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_transport_name),
                context.getString(R.string.info_transport_description),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}
