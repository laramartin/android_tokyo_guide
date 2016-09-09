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
