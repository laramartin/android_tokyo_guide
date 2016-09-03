package eu.laramartin.toykoguide;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Shops {

    public static void initShopsList(List<Location> list) {

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

        list.add(new Location(
                "Amiami",
                "Hobbies supply shop, like figures and character goods. Selling of " +
                        "second hand items too. ",
                "1 Chome-11-5 Sotokanda, , Chiyoda-ku, Tokyo 101-0021",
                "+81 3-5289-3373",
                "Mo-Su 10:00–21:00",
                null,
                R.drawable.shops_amiami
        ));

        list.add(new Location(
                "Nakano Broadway",
                "Shopping complex full of stores selling anime items and idol goods. " +
                        "It includes a dozen small Mandarake stores.",
                "5-52-15 Nakano, Tokyo 164-0001",
                "+81 3-3388-7004",
                "Mo-Su 12:00–20:00",
                null,
                R.drawable.shops_nakano_broadway
        ));

        list.add(new Location(
                "Kiddy Land",
                "Toy shop since 1950",
                "6-1-9 Jingumae, Shibuya, Tokyo 150-0001",
                "+81 3-3409-3431",
                "Mo-Su 10:30–21:00",
                null,
                R.drawable.shops_kiddyland
        ));

        list.add(new Location(
                "Daiso",
                "Biggest 100 yen shop. ",
                "1chome 2−2 Kabukicho, Shinjuku, Tokyo 160-0021",
                "+81 3-5312-6656",
                "Mo-Su 10:00–21:00",
                null,
                R.drawable.shops_daiso
        ));

    }


   /* public Location(String name, String description, String address, String phone, String schedule,
                    String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }*/

}
