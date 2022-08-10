package com.example.fisat_pro;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewData extends AppCompatActivity {
    Button k1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_data);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Final Submit");
    }
}