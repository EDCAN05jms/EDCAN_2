package com.example.setsn.edcan_2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by setsn on 2018-05-14.
 */

public class ListviewAdapter extends BaseAdapter {


    ArrayList<ListviewItem> listviewItems = new ArrayList<ListviewItem>();

    @Override
    public int getCount() {
        return listviewItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.icon);
        TextView name = convertView.findViewById(R.id.name);
        TextView artist = convertView.findViewById(R.id.artist);
        ListviewItem listviewItem = listviewItems.get(position);
        imageView.setImageDrawable(listviewItem.getImage());
        name.setText(listviewItem.getName());
        artist.setText(listviewItem.getArtist());

        return convertView;
    }

    public void addItem(Drawable image, String name, String artist) {
        ListviewItem item = new ListviewItem();
        item.setArtist(artist);
        item.setName(name);
        item.setImage(image);

        listviewItems.add(item);
    }

}
