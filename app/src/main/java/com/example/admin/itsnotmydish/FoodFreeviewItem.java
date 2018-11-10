package com.example.admin.itsnotmydish;

import android.widget.ImageView;

public class FoodFreeviewItem {
    private String Food_name;
    private String Distance;
    private String Person_name;
    private ImageView Food_image;

    FoodFreeviewItem(String Food_name, String Distance, String Person_name, ImageView Food_image) {
        this.Food_name = Food_name;
        this.Distance = Distance;
        this.Person_name = Person_name;
        this.Food_image = Food_image;

    }

    public String getFood_name() {
        return Food_name;

    }

    public void setFood_name(String food_name) {
        Food_name = food_name;

    }

    public String getDistance() {
        return Distance;

    }

    public void setDistance(String distance) {
        Distance = distance;

    }

    public String getPerson_name() {
        return Person_name;

    }

    public void setPerson_name(String person_name) {
        Person_name = person_name;

    }

    public ImageView getFood_image() {
        return Food_image;

    }

    public void setFood_image(ImageView food_image) {
        Food_image = food_image;

    }

}
