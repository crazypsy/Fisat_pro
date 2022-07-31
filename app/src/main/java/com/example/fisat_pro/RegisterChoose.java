package com.example.fisat_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RegisterChoose extends AppCompatActivity {
    ImageView img1,img2;
    String choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_choose);

        img1=findViewById(R.id.imageView4);
        img2=findViewById(R.id.imageView3);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose="0";
                Intent intent=new Intent(getApplicationContext(),Registeration.class);
                intent.putExtra("Key",choose);
                startActivity(intent);

            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose="1";
                Intent intent=new Intent(getApplicationContext(),Registeration.class);
                intent.putExtra("Key",choose);
                startActivity(intent);

            }
        });
    }
}