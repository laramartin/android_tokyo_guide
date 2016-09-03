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

        list.add(new Location(
                "Mandarake",
                "Anime and manga second hand shop",
                "3-11-12 Sotokanda, Chiyoda, Tokyo 101-0021",
                "+81 3-3252-7007",
                "Mo-Su 12:00–21:00",
                null,
                R.drawable.shops_mandarake
        ));

        list.add(new Location(
                "Kinokuniya Shinjuku Main Store",
                "Bookstore with 9 floors",
                "3 Chome-17-7 Shinjuku, Tokyo 163-8636",
                "+81 3-3354-0131",
                "Mo-Su 10:00–21:00",
                null,
                R.drawable.shops_kinokuniya_bookstore
        ));

        list.add(new Location(
                "Bic Camera",
                "Appliances Store",
                "3 Chome-29-1 Shinjuku, Tokyo 160-0022",
                "+81 3-3226-1111",
                "Mo-Su 10:00–22:00",
                null,
                R.drawable.shop_bic_camera
        ));

        list.add(new Location(
                "Don Quijote",
                "Discount Store",
                "1 Chome-12-6 Okubo, Shinjuku Tokyo 169-0072",
                "+81 3-5292-7411",
                "Mo-Su 10:00–22:00",
                null,
                R.drawable.shops_don_quijote
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
