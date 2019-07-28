package com.example.admin.itsnotmydish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addClicked(View v){
        finish();
    }
}
