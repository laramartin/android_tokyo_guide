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

import android.content.Context;

import java.util.List;

/**
 * Created by Lara on 03/09/2016.
 */
public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_genki_name),
                context.getString(R.string.food_genki_description),
                context.getString(R.string.food_genki_address),
                context.getString(R.string.food_genki_phone),
                context.getString(R.string.food_genki_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_genki_sushi
        ));

        list.add(new Location(
                context.getString(R.string.food_wako_name),
                context.getString(R.string.food_wako_description),
                context.getString(R.string.food_wako_address),
                context.getString(R.string.food_wako_phone),
                context.getString(R.string.food_wako_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_tonkatsu_wako
        ));

        list.add(new Location(
                context.getString(R.string.food_rokumonya_name),
                context.getString(R.string.food_rokumonya_description),
                context.getString(R.string.food_rokumonya_address),
                context.getString(R.string.food_rokumonya_phone),
                context.getString(R.string.food_rokumonya_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.shop_rokumonya_okonomiyaki
        ));

        list.add(new Location(
                context.getString(R.string.food_kisoji_name),
                context.getString(R.string.food_kisoji_description),
                context.getString(R.string.food_kisoji_address),
                context.getString(R.string.food_kisoji_phone),
                context.getString(R.string.food_kisoji_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.food_kisoji_shabushabu
        ));

        list.add(new Location(
                context.getString(R.string.food_gogo_name),
                context.getString(R.string.food_gogo_description),
                context.getString(R.string.food_gogo_address),
                context.getString(R.string.food_gogo_phone),
                context.getString(R.string.food_gogo_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_gogo_curry
        ));

        list.add(new Location(
                context.getString(R.string.food_tenya_name),
                context.getString(R.string.food_tenya_description),
                context.getString(R.string.food_tenya_address),
                context.getString(R.string.food_tenya_phone),
                context.getString(R.string.food_tenya_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_tenya
        ));

        list.add(new Location(
                context.getString(R.string.food_shibukatsu_name),
                context.getString(R.string.food_shibukatsu_description),
                context.getString(R.string.food_shibukatsu_address),
                context.getString(R.string.food_shibukatsu_phone),
                context.getString(R.string.food_shibukatsu_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_shibukatsu
        ));
    }
}
