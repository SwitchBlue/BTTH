package com.example.bth8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhoneAdapter extends ArrayAdapter<Phone> {

    Context context;
    List<Phone> list;

    public PhoneAdapter(Context context, List<Phone> list) {
        super(context, 0, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_list, parent, false);
        }

        ImageView img = convertView.findViewById(R.id.img);
        TextView txt = convertView.findViewById(R.id.txtName);

        Phone p = list.get(position);

        img.setImageResource(p.image);
        txt.setText(p.name);

        return convertView;
    }
}
