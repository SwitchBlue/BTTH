package com.example.bth9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder> {

    ArrayList<Phone> list;

    public PhoneAdapter(ArrayList<Phone> list) {
        this.list = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public ViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.imgPhone);
            txt = view.findViewById(R.id.txtName);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_phone, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Phone p = list.get(position);
        holder.txt.setText(p.name);
        holder.img.setImageResource(p.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
