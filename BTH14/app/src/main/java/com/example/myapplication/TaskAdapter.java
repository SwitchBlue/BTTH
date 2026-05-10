package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskHolder> {

    ArrayList<String> list;

    public TaskAdapter(ArrayList<String> list) {
        this.list = list;
    }

    public static class TaskHolder extends RecyclerView.ViewHolder {

        TextView txtTask;

        public TaskHolder(@NonNull View itemView) {
            super(itemView);

            txtTask = itemView.findViewById(R.id.txtTask);
        }
    }

    @NonNull
    @Override
    public TaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_task, parent, false);

        return new TaskHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskHolder holder, int position) {

        String task = list.get(position);

        holder.txtTask.setText(task);

        // click để xoá
        holder.itemView.setOnClickListener(v -> {
            int pos = holder.getBindingAdapterPosition();
            if (pos != RecyclerView.NO_POSITION) {
                list.remove(pos);
                notifyItemRemoved(pos);
                notifyItemRangeChanged(pos, list.size());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}