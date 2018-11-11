package com.example.admin.itsnotmydish;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class FoodFreeviewListItemAdapter extends BaseAdapter {

    private Context context;
    private List<FoodFreeviewItem> foodFreeviewlist;

    public interface ItemSeleted {
        public void selectItem(int pos);

    }

    FoodFreeviewListItemAdapter(Context context, List<FoodFreeviewItem> foodFreeviewItem) {
        this.context = context;
        this.foodFreeviewlist = foodFreeviewItem;

    }


    @Override
    public int getCount() {
        return foodFreeviewlist.size();

    }

    @Override
    public Object getItem(int position) {
        return foodFreeviewlist.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;

    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.food_freeview_list_item, parent, false);

        FoodFreeviewItem foodFreeviewItem = foodFreeviewlist.get(position);

        final TextView food_name = convertView.findViewById(R.id.Food_name);
        final TextView distance = convertView.findViewById(R.id.Distance);
        final TextView person_name = convertView.findViewById(R.id.Person_name);
        final ImageView food_image = convertView.findViewById(R.id.Food_image);

        food_name.setText(foodFreeviewItem.getFood_name());
        distance.setText(foodFreeviewItem.getDistance());
        person_name.setText(foodFreeviewItem.getPerson_name());
        Glide.with(context).load(foodFreeviewItem.getFood_image_URL()).into(food_image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(context instanceof MainActivity) {
                    ((MainActivity)context).selectItem(position);

                }

            }
        });

        return convertView;
    }

}
