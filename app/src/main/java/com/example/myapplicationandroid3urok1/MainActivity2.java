package com.example.myapplicationandroid3urok1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView photo;
    String textW = "WhatsApp";
    String textY = "YouTube";
    String textG = "Chrome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        photo = findViewById(R.id.im_ava);

       Bundle argument = getIntent().getExtras();

       String text = argument.getString("text");
       if (argument != null){
           Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
       }
       switch (text){
           case "WhatsApp":
          photo.setImageResource(R.drawable.img);
          break;

           case "YouTube":
               photo.setImageResource(R.drawable.img_1);
               break;

           case "Chrome":
               photo.setImageResource(R.drawable.img_2);
               break;
       }
    }
}