/*
PROJECT LICENSE
This project was submitted by Lara Martín as part of the Nanodegree At Udacity.
As part of Udacity Honor code, your submissions must be your own work, hence
submitting this project as yours will cause you to break the Udacity Honor Code
and the suspension of your account.
Me, the author of the project, allow you to check the code as a reference, but if
you submit it, it's your own responsibility if you get expelled.
Copyright (c) 2017 Lara Martín
Besides the above notice, the following license applies and this license notice
must be included in all works derived from this project.
MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;

/**
 * Created by lara on 28/8/16.
 */
public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sight_ghibli_name),
                context.getString(R.string.sight_ghibli_description),
                context.getString(R.string.sight_ghibli_address),
                context.getString(R.string.sight_ghibli_phone),
                context.getString(R.string.sight_ghibli_schedule),
                context.getString(R.string.sight_ghibli_price),
                R.drawable.sights_ghibli_museum
        ));

        list.add(new Location(
                context.getString(R.string.sight_imperial_name),
                context.getString(R.string.sight_imperial_description),
                context.getString(R.string.sight_imperial_address),
                context.getString(R.string.sight_imperial_phone),
                context.getString(R.string.sight_imperial_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_imperial_palace
        ));

        list.add(new Location(
                context.getString(R.string.sight_yasukuni_name),
                context.getString(R.string.sight_yasukuni_description),
                context.getString(R.string.sight_yasukuni_address),
                context.getString(R.string.sight_yasukuni_phone),
                context.getString(R.string.sight_yasukuni_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_yasukuni_shrine
        ));

        list.add(new Location(
                context.getString(R.string.sight_koishikawa_name),
                context.getString(R.string.sight_koishikawa_description),
                context.getString(R.string.sight_koishikawa_address),
                context.getString(R.string.sight_koishikawa_phone),
                context.getString(R.string.sight_koishikawa_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_koishikawa_korakuen_park
        ));

        list.add(new Location(
                context.getString(R.string.sight_hie_shrine_name),
                context.getString(R.string.sight_hie_shrine_description),
                context.getString(R.string.sight_hie_shrine_address),
                context.getString(R.string.sight_hie_shrine_phone),
                context.getString(R.string.sight_hie_shrine_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_hie_shrine
        ));

        list.add(new Location(
                context.getString(R.string.sight_hachikou_name),
                context.getString(R.string.sight_hachikou_description),
                context.getString(R.string.sight_hachikou_address),
                context.getString(R.string.sight_hachikou_phone),
                context.getString(R.string.sight_hachikou_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_hachiko_statue
        ));

        list.add(new Location(
                context.getString(R.string.sight_government_building_name),
                context.getString(R.string.sight_government_building_description),
                context.getString(R.string.sight_government_building_address),
                context.getString(R.string.sight_government_building_phone),
                context.getString(R.string.sight_government_building_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sights_metropolitan_government_building
        ));
    }
}
