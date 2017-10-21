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
public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_potato_name),
                context.getString(R.string.shop_potato_description),
                context.getString(R.string.shop_potato_address),
                context.getString(R.string.shop_potato_phone),
                context.getString(R.string.shop_potato_schedule),
                null,
                R.drawable.shops_super_potato
        ));

        list.add(new Location(
                context.getString(R.string.shop_amiami_name),
                context.getString(R.string.shop_amiami_description),
                context.getString(R.string.shop_amiami_address),
                context.getString(R.string.shop_amiami_phone),
                context.getString(R.string.shop_amiami_schedule),
                null,
                R.drawable.shops_amiami
        ));

        list.add(new Location(
                context.getString(R.string.shop_nakano_name),
                context.getString(R.string.shop_nakano_description),
                context.getString(R.string.shop_nakano_address),
                context.getString(R.string.shop_nakano_phone),
                context.getString(R.string.shop_nakano_schedule),
                null,
                R.drawable.shops_nakano_broadway
        ));

        list.add(new Location(
                context.getString(R.string.shop_kiddy_name),
                context.getString(R.string.shop_kiddy_description),
                context.getString(R.string.shop_kiddy_address),
                context.getString(R.string.shop_kiddy_phone),
                context.getString(R.string.shop_kiddy_schedule),
                null,
                R.drawable.shops_kiddyland
        ));

        list.add(new Location(
                context.getString(R.string.shop_daiso_name),
                context.getString(R.string.shop_daiso_description),
                context.getString(R.string.shop_daiso_address),
                context.getString(R.string.shop_daiso_phone),
                context.getString(R.string.shop_daiso_schedule),
                null,
                R.drawable.shops_daiso
        ));

        list.add(new Location(
                context.getString(R.string.shop_mandarake_name),
                context.getString(R.string.shop_mandarake_description),
                context.getString(R.string.shop_mandarake_address),
                context.getString(R.string.shop_mandarake_phone),
                context.getString(R.string.shop_mandarake_schedule),
                null,
                R.drawable.shops_mandarake
        ));

        list.add(new Location(
                context.getString(R.string.shop_kinokuniya_name),
                context.getString(R.string.shop_kinokuniya_description),
                context.getString(R.string.shop_kinokuniya_address),
                context.getString(R.string.shop_kinokuniya_phone),
                context.getString(R.string.shop_kinokuniya_schedule),
                null,
                R.drawable.shops_kinokuniya_bookstore
        ));

        list.add(new Location(
                context.getString(R.string.shop_biccamera_name),
                context.getString(R.string.shop_biccamera_description),
                context.getString(R.string.shop_biccamera_address),
                context.getString(R.string.shop_biccamera_phone),
                context.getString(R.string.shop_biccamera_schedule),
                null,
                R.drawable.shop_bic_camera
        ));

        list.add(new Location(
                context.getString(R.string.shop_donki_name),
                context.getString(R.string.shop_donki_description),
                context.getString(R.string.shop_donki_address),
                context.getString(R.string.shop_donki_phone),
                context.getString(R.string.shop_donki_schedule),
                null,
                R.drawable.shops_don_quijote
        ));
    }
}
