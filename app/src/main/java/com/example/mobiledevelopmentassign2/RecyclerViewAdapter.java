package com.example.mobiledevelopmentassign2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final List<MenuItemAttributes> itemList = new ArrayList<>();
    private final Context context;

    public RecyclerViewAdapter(Context context, List<MenuItemAttributes> itemList) {
        this.context = context;
        this.itemList.addAll(itemList); // Copy values into the mutable list
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameView;
        TextView caloriesView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.itemImage);
            nameView = itemView.findViewById(R.id.itemName);
            caloriesView = itemView.findViewById(R.id.itemCalories);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.menu_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuItemAttributes item = itemList.get(position);
        holder.imageView.setImageResource(item.getImageResource());
        holder.nameView.setText(item.getName());
        holder.caloriesView.setText(item.getCalorieCount());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, MenuItemActivity.class);
            intent.putExtra("IMAGE_RESOURCE", item.getImageResource());
            intent.putExtra("NAME", item.getName());
            intent.putExtra("CALORIES", item.getCalorieCount());
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void updateList(List<MenuItemAttributes> newList) {
        itemList.clear();
        itemList.addAll(newList);
        notifyDataSetChanged();
    }
}