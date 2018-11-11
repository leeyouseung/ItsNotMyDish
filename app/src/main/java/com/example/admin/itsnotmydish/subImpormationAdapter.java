package com.example.admin.itsnotmydish;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

public class subImpormationAdapter extends BaseAdapter {

    private Context context;
    private List<subviewItem> subviewItemList;

    public interface SelectedItem{
        public void selectItem(int pod);
    }

    subImpormationAdapter(Context context, List<subviewItem> subviewItemList) {
        this.context = context;
        this.subviewItemList = subviewItemList;

    }

    @Override
    public int getCount() {
        return subviewItemList.size();

    }

    @Override
    public Object getItem(int position) {
        return subviewItemList.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;

    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.food_lsit_view_item, parent, false);

        final ImageView food_image = convertView.findViewById(R.id.Food_image);

        subviewItem subviewItem1 = subviewItemList.get(position);

        Glide.with(context).load(subviewItem1.getFood_image()).into(food_image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(context instanceof subImpormation) {
                    ((subImpormation)context).selectItem(position);

                }

            }
        });

        return convertView;

    }

}
