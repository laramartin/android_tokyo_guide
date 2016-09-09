package eu.laramartin.tokyoguide;

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
                R.drawable.food_tonkatsu_wako
        ));

        list.add(new Location(
                "Rokumonya",
                "Restaurant specialised in Okonomiyaki, a Japanese savoury pancake containing " +
                        "a variety of ingredients",
                "3 Chome−35, Shinjuku, Tokyo 160-0022",
                "+81 3-3356-6824",
                "Mo-Su 11:30–23:30",
                "$$",
                R.drawable.shop_rokumonya_okonomiyaki
        ));

        list.add(new Location(
                "Kisoji",
                "Restaurant specialised in sukiyaki and shabu shabu",
                "3-17-5 New Fuji Building, Shinjuku, Tokyo, 160-0022",
                "+81 3-3226-0667",
                "Mo-Su 11:30–14:30 and 17:30-21:30",
                "$$$$",
                R.drawable.food_kisoji_shabushabu
        ));

        list.add(new Location(
                "Gogo curry",
                "Restaurant specialised in Japanese curry with fried meat on top",
                "1 Chome−161, Kanda Sakumacho, Chiyoda, Tokyo, 101-0025",
                "+81 3-5256-5525",
                "Mo-Su 10:00–22:00",
                "$",
                R.drawable.food_gogo_curry
        ));

        list.add(new Location(
                "Tenya",
                "Restaurant specialised in Tendon, a bowl of rice with tempura fried food on top",
                "3 Chome−3−31−2, Shinjuku, Tokyo, 160-0022",
                "+81 3-5269-7216",
                "Mo-Su 11:00–22:00",
                "$",
                R.drawable.food_tenya
        ));

        list.add(new Location(
                "Shitukatsu",
                "Tonkatsu place run by Agetarou's family. Agetarou is also known as Tonkatsu DJ.",
                "21−6, Udagawacho, Shibuya, Tokyo, 150-0042",
                "+81 3-0000-0000",
                "Mo-Su 11:00–22:00",
                "$",
                R.drawable.food_shibukatsu
        ));

    }

}
