package com.example.admin.itsnotmydish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.Map_Buton);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your code here
                Intent intent = new Intent( MainActivity.this, MainMapActivity.class);
                startActivity(intent);
            }
        });
    }

    public void LogoutButton(View v) {
        Toast toast = Toast.makeText(this, "로그아웃 되었습니다.", Toast.LENGTH_SHORT);
        toast.show();


        //startActivity(intent);

    }



}
