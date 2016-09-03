package eu.laramartin.toykoguide;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Info {

    public static void initInfoList(List<Location> list) {

        list.add(new Location(
                "Internet",
                "Rent a pocket WIFI to have internet access everywhere. It is very " +
                        "convenient when travelling since most of the hotels have " +
                        "limited internet access. It works even in the subway!",
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                "Convenience stores",
                "Did you forget your toothbrush? Are you jet-lagged and need a coffee fix at 4am?" +
                "\n\nYou need a konbini, a convenience store that is open 24/7. Here you will " +
                        "find from foods and drinks, to first necessity articles. " +
                        "\n\nSome known konibini chains are: " +
                        "\n- Lawson" +
                        "\n- 7-Eleven" +
                        "\n- FamilyMart" +
                        "\n- Daily",
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                "Suica Prepaid Train Card",
                "The Suica card is a prepaid smart card that allows you to use most public " +
                        "transport (metro, trains, buses, monorail) in Japan. The card is " +
                        "debited for every trip or purchase you make when you touch the card " +
                        "to the reader." +
                        "\n\nThe Suica card was created by JR East, but can also be " +
                        "used throughout Japan on the other prepaid card networks like Pasmo.",
                null,
                null,
                null,
                null,
                -1
        ));
    }
}
