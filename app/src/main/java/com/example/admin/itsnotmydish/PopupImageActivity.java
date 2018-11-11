package com.example.admin.itsnotmydish;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PopupImageActivity extends Activity {
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_image);
        Object obj = getIntent().getStringExtra("ImageData");
        if(obj instanceof String){
            String url = (String)obj;
            imgView = findViewById(R.id.popup__imgview);

            Glide.with(this).load(url).into(imgView);
        }
    }

}
