package com.example.myapplicationandroid3urok1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    MaterialButton button;

   String text = "WhatsApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_edittext);
        button = findViewById(R.id.click_on_the);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString().trim();
                if (text.isEmpty()){
                    editText.setError("Заполни поля");
                }else {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("text",text);
                    startActivity(intent);
                }
            }
        });
        Log.e("lifecycle", "onClick: ");
    }
}