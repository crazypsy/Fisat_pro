package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterChoose extends AppCompatActivity {
    ImageView img1, img2;
    String choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_choose);

        img1 = findViewById(R.id.imageView4);
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
                choose = "1";
                Intent intent = new Intent(getApplicationContext(), Registeration.class);
                intent.putExtra("Key", choose);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), LoginOrSignUp.class));
    }
}