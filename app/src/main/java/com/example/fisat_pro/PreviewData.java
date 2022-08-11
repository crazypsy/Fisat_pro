package com.example.fisat_pro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewData extends AppCompatActivity {
    Button k1;
    SharedPreferences sh;
    String set = "12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_data);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Final Submit");

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor ed = sh.edit();
                ed.putString("flood", set);
                ed.putString("humidity", set);
                ed.putString("pressure", set);
                ed.putString("rainfall", set);
                ed.putString("riverlength", set);
                ed.putString("temerap", set);
                ed.putString("groundwaterl", set);
                ed.putString("windfull", set);
                ed.commit();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Student_Input.class));
    }
}