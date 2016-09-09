package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;

/**
 * Created by lara on 28/8/16.
 */
public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sight_ghibli_name),
                context.getString(R.string.sight_ghibli_description),
                context.getString(R.string.sight_ghibli_address),
                context.getString(R.string.sight_ghibli_phone),
                context.getString(R.string.sight_ghibli_schedule),
                context.getString(R.string.sight_ghibli_price),
                R.drawable.sights_ghibli_museum
        ));

        list.add(new Location(
                context.getString(R.string.sight_imperial_name),
                context.getString(R.string.sight_imperial_description),
                context.getString(R.string.sight_imperial_address),
                context.getString(R.string.sight_imperial_phone),
                context.getString(R.string.sight_imperial_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_imperial_palace
        ));

        list.add(new Location(
                context.getString(R.string.sight_yasukuni_name),
                context.getString(R.string.sight_yasukuni_description),
                context.getString(R.string.sight_yasukuni_address),
                context.getString(R.string.sight_yasukuni_phone),
                context.getString(R.string.sight_yasukuni_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_yasukuni_shrine
        ));

        list.add(new Location(
                context.getString(R.string.sight_koishikawa_name),
                context.getString(R.string.sight_koishikawa_description),
                context.getString(R.string.sight_koishikawa_address),
                context.getString(R.string.sight_koishikawa_phone),
                context.getString(R.string.sight_koishikawa_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_koishikawa_korakuen_park
        ));

        list.add(new Location(
                context.getString(R.string.sight_hie_shrine_name),
                context.getString(R.string.sight_hie_shrine_description),
                context.getString(R.string.sight_hie_shrine_address),
                context.getString(R.string.sight_hie_shrine_phone),
                context.getString(R.string.sight_hie_shrine_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_hie_shrine
        ));

        list.add(new Location(
                context.getString(R.string.sight_hachikou_name),
                context.getString(R.string.sight_hachikou_description),
                context.getString(R.string.sight_hachikou_address),
                context.getString(R.string.sight_hachikou_phone),
                context.getString(R.string.sight_hachikou_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_hachiko_statue
        ));

        list.add(new Location(
                context.getString(R.string.sight_government_building_name),
                context.getString(R.string.sight_government_building_description),
                context.getString(R.string.sight_government_building_address),
                context.getString(R.string.sight_government_building_phone),
                context.getString(R.string.sight_government_building_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_metropolitan_government_building
        ));
    }
}
