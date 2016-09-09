package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_genki_name),
                context.getString(R.string.food_genki_description),
                context.getString(R.string.food_genki_address),
                context.getString(R.string.food_genki_phone),
                context.getString(R.string.food_genki_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_genki_sushi
        ));

        list.add(new Location(
                context.getString(R.string.food_wako_name),
                context.getString(R.string.food_wako_description),
                context.getString(R.string.food_wako_address),
                context.getString(R.string.food_wako_phone),
                context.getString(R.string.food_wako_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_tonkatsu_wako
        ));

        list.add(new Location(
                context.getString(R.string.food_rokumonya_name),
                context.getString(R.string.food_rokumonya_description),
                context.getString(R.string.food_rokumonya_address),
                context.getString(R.string.food_rokumonya_phone),
                context.getString(R.string.food_rokumonya_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.shop_rokumonya_okonomiyaki
        ));

        list.add(new Location(
                context.getString(R.string.food_kisoji_name),
                context.getString(R.string.food_kisoji_description),
                context.getString(R.string.food_kisoji_address),
                context.getString(R.string.food_kisoji_phone),
                context.getString(R.string.food_kisoji_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.food_kisoji_shabushabu
        ));

        list.add(new Location(
                context.getString(R.string.food_gogo_name),
                context.getString(R.string.food_gogo_description),
                context.getString(R.string.food_gogo_address),
                context.getString(R.string.food_gogo_phone),
                context.getString(R.string.food_gogo_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_gogo_curry
        ));

        list.add(new Location(
                context.getString(R.string.food_tenya_name),
                context.getString(R.string.food_tenya_description),
                context.getString(R.string.food_tenya_address),
                context.getString(R.string.food_tenya_phone),
                context.getString(R.string.food_tenya_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_tenya
        ));

        list.add(new Location(
                context.getString(R.string.food_shibukatsu_name),
                context.getString(R.string.food_shibukatsu_description),
                context.getString(R.string.food_shibukatsu_address),
                context.getString(R.string.food_shibukatsu_phone),
                context.getString(R.string.food_shibukatsu_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_shibukatsu
        ));
    }
}
