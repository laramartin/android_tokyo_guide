package eu.laramartin.toykoguide;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<Location> list) {

        list.add(new Location(
                "Super Potato",
                "Chain of retro video game stores filed with equipment and merchandise for games. " +
                        "It includes vintage video game arcades.",
                "1 Chome-11-2 Sotokanda, Chiyoda-ku, Tokyo 101-0021",
                "+81 3-5289-9933",
                "Mo-Fr 11:00–20:00. Sa-Su 10:00-20:00",
                null,
                R.drawable.shops_super_potato
        ));

    }

}
