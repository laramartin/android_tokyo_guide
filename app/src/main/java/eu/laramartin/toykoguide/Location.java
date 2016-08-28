package eu.laramartin.toykoguide;

/**
 * Created by lara on 28/8/16.
 */
public class Location {

    String name;
    String description;
    String address;
    String phone;
    String schedule;
    String price;
    int imageResourceId;

    public Location(String name, String description, String address, String phone, String schedule,
                    String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String description, String address, String schedule, String price,
                    int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }
    
}
