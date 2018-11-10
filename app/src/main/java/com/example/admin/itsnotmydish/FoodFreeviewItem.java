package com.example.admin.itsnotmydish;

import java.io.Serializable;

public class FoodFreeviewItem implements Serializable {

    public long SerialVersionUID = 2L;

    private String Food_name;
    private String Distance;
    private String Person_name;
    private String Food_image_URL;

    FoodFreeviewItem(String Food_name, String Distance, String Person_name, String Food_image) {
        this.Food_name = Food_name;
        this.Distance = Distance;
        this.Person_name = Person_name;
        this.Food_image_URL = Food_image;

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

    public String getFood_image_URL() {
        return Food_image_URL;

    }

    public void setFood_image_URL(String food_image_URL) {
        Food_image_URL = food_image_URL;

    }

}
