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

public class WaterLevel extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "centimeter",
            "meter ",
            "kilometer",


    };
    Button k1;
    EditText groundwater;
    MaterialSpinner spinner;
    String groundwaterNumber, groundwaterunit, set;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_level);
        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        groundwater = findViewById(R.id.editTextTextGroundwaterlevel);

        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.GroundWaterUnit);

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
                groundwaterNumber = groundwater.getText().toString();
                groundwaterunit = spinner.getText().toString();


                if (groundwaterNumber.equals("")) {
                    groundwater.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("groundwaterl", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    // intent.putExtra("groundwaterl", set);
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