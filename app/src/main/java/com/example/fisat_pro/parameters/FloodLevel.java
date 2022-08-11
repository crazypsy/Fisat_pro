package com.example.fisat_pro.parameters;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fisat_pro.R;
import com.example.fisat_pro.Student_Input;
import com.example.fisat_pro.customspinner.MaterialSpinner;
import com.google.android.material.snackbar.Snackbar;

public class FloodLevel extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "volume",
            "milliliter ",
            "percentage",


    };
    EditText floolevelength;
    Button k1;
    String set, Floodlevel, floodunit;
    MaterialSpinner spinner;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_level);

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        floolevelength = findViewById(R.id.editTextFloodLevel);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        //  logid = sh.getString("logid", "");
        spinner = (MaterialSpinner) findViewById(R.id.FloodLevelUnit);

        spinner.setItems(ANDROID_VERSIONS);
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });

//        spinner.setOnNothingSelectedListener(new MaterialSpinner.OnNothingSelectedListener() {
//
//            @Override
//            public void onNothingSelected(MaterialSpinner spinner) {
//                Snackbar.make(spinner, "Nothing selected", Snackbar.LENGTH_LONG).show();
//            }
//        });


        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Floodlevel = floolevelength.getText().toString();
                floodunit = spinner.getText().toString();


                if (Floodlevel.equals("")) {
                    floolevelength.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("flood", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    // intent.putExtra("flood", set);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), Student_Input.class));
    }
}