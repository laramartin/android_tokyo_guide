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
                R.drawable.sights_ghibli_museum
        ));

        list.add(new Location(
                "Tokyo Imperial Palace",
                "It is a large park-like area that contains buildings including the main palace, " +
                        "the private residences of the Imperial Family, an archive, " +
                        "museums and administrative offices.",
                "1-1 Chiyoda, Tokyo 100-8111",
                "+81 3-3213-1111",
                "9:00–17:00. Mondays & Fridays closed.",
                "Free",
                R.drawable.sights_imperial_palace
        ));

        list.add(new Location(
                "Yasukuni Shrine",
                "Shinto shrine founded by Emperor Meiji. Commemorates those who died in service " +
                        "of the Empire of Japan, which existed from the Meiji Restoration of " +
                        "1869 until the nation was renamed during the Allied occupation in 1947.",
                "3-1-1 Kudankita, Chiyoda, Tokyo 102-8246",
                "+81 3-3261-8326",
                "Always open",
                "Free",
                R.drawable.sights_yasukuni_shrine
        ));

        list.add(new Location(
                "Koishikawa Korakuen Garden",
                "Edo period clan garden, one of Tokyo's oldest gardens. It was named Korakuen " +
                        "after a poem encouraging a ruler to enjoy pleasure only after achieving " +
                        "happiness for his people.",
                "1-6-6 Koraku, Bunkyo, Tokyo 112-0004",
                "+81 3-3811-3015",
                "9:00-17:00",
                "Free",
                R.drawable.sights_koishikawa_korakuen_park
        ));

        list.add(new Location(
                "Hie Shrine",
                "Shinto Shrine dedicated to the god Ōyamakui-no-kam. It's located in Nagatcho, " +
                        "the Japanese seat of government, it sits amongst the sky scrappers.",
                "2-10-5, Nagatachō Chiyoda, Tokyo 100-0014",
                "+81 3-3581-2471",
                "5:00–18:00.",
                "Free",
                R.drawable.sights_hie_shrine
        ));

        list.add(new Location(
                "Hachikō statue",
                "Statue of the Akita dog Hachikō. He is remembered for his remarkable " +
                        "loyalty to his owner which continued for more than nine years " +
                        "after his owner's death.",
                "1 Dogenzaka, Shibuya Train Station, Shibuya 150-0043,",
                "+81 3-3378-1703",
                "Always open",
                "Free",
                R.drawable.sights_hachiko_statue
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
