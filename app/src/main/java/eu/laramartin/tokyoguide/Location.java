/*
 * PROJECT LICENSE
 *
 * This project was submitted by Lara Martín as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2017 Lara Martín
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package eu.laramartin.tokyoguide;

import android.util.Log;

/**
 * Created by lara on 28/8/16.
 */
public class Location {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice(){
        return getPrice() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasSchedule(){
        return getSchedule() != null;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getSchedule() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}
