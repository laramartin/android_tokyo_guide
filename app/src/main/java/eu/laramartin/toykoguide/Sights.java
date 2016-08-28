package eu.laramartin.toykoguide;

import java.util.List;

/**
 * Created by lara on 28/8/16.
 */
public class Sights {

    public static void initSightsList(List<Location> list) {

        list.add(new Location(
                "Ghibli Museum",
                "Museum showcasing the work of the Japanese animation studio Studio Ghibli.",
                "1-1-83 Simorenjaku, Mitaka-shi Tokyo 181-0013",
                "+81 570-055-777",
                "10:00–18:00. Tuesdays closed.",
                "110-330¥",
                -1
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
