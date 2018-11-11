package com.example.admin.itsnotmydish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);
        ImageView imageView = (ImageView) findViewById(R.id.Map_Buton);
        imageView.setImageResource(R.drawable.temp);
    }

    public void Btn1Clicked(View v){
        Intent intent = new Intent(MainMapActivity.this, subImpormation.class);
        startActivity(intent);
    }
}
