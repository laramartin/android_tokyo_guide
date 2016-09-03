package eu.laramartin.toykoguide;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<Location> list) {

        list.add(new Location(
                "Genki Sushi",
                "Sushi restaurant. Choose the food on the screen in your table and " +
                        "recieve your order via conveyor belt",
                "24-8 Udagawacho, Shibuya, Tokyo 150-0042",
                "+81 3-3461-1281",
                "Mo-Fr 11:00–24:00. Sa-Su 10:30-24:00",
                "$$",
                R.drawable.food_genki_sushi
        ));

        list.add(new Location(
                "Tonkatsu Wako",
                "Restaurant specialised in Tonkatsu, fried pork cutlet.",
                "AQUA CiTY ODAIBA, 1 Chome-7-1 Daiba, Minatoku Tokyo 135-0091",
                "+81 3-3599-5144",
                "Mo-Su 11:00–22:00",
                "$$",
                R.drawable.food_genki_sushi
        ));
    }

}
