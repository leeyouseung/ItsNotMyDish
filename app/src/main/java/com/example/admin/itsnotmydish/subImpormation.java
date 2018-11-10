package com.example.admin.itsnotmydish;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class subImpormation extends AppCompatActivity {

    FoodFreeviewItem item;
    TextView foodname;
    TextView distance;
    TextView personName;
    ImageView foodImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_impormation);

        Object obj = getIntent().getSerializableExtra("ListData");
        if(obj instanceof FoodFreeviewItem){
            this.item = (FoodFreeviewItem)obj;
            foodname = findViewById(R.id.Food_name);
            foodname.setText(item.getFood_name());

            this.item = (FoodFreeviewItem)obj;
            distance = findViewById(R.id.Distance);
            distance.setText(item.getDistance());

            this.item = (FoodFreeviewItem)obj;
            personName = findViewById(R.id.Person_name);
            personName.setText(item.getPerson_name());

            this.item = (FoodFreeviewItem)obj;
            foodImage = findViewById(R.id.Food_image);
            Glide.with(this).load(item.getFood_image_URL()).into(foodImage);

        }

    }

    public void backButton(View v) {
        finish();

    }

    public void changeButton(View v) {
        AlertDialog.Builder button_change = new AlertDialog.Builder(this);
        button_change.setMessage("교환을 신청 하시겠습니까?").setCancelable(
                false).setPositiveButton("Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Action for 'Cancel' Button;

                    }
                }).setNegativeButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Action for 'OK' Button;

                    }
                });

        final AlertDialog change_button = button_change.create();

        ImageButton trash_button = findViewById(R.id.change_Button);
        trash_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change_button.show();

            }
        });

    }

}
