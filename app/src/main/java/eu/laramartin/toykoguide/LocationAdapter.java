package eu.laramartin.toykoguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lara on 29/8/16.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, int resources, List<Location> locationsList) {
        super(context, 0, locationsList);
    }



    /*public LocationAdapter(Context context, int resource, int textViewResourceId,
                           List<Location> objects) {

        super(context, resource, textViewResourceId, objects);

    }*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView scheduleLocationTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        scheduleLocationTextView.setText(currentLocation.getSchedule());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getPrice());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPrice()){
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasSchedule()){
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhone()){
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;


    }


}
