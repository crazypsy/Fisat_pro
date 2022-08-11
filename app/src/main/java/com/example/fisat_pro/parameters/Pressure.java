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

public class Pressure extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "atm",
            "bars ",


    };
    Button k1;
    MaterialSpinner spinner;
    EditText pressure;
    String PressureNumber, Pressureunit, set;
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        pressure = findViewById(R.id.editTextPressure);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.PressureUnit);

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
                PressureNumber = pressure.getText().toString();
                Pressureunit = spinner.getText().toString();


                if (PressureNumber.equals("")) {
                    pressure.setError("Measure please");

                } else {

                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("pressure", set);
                    ed.commit();
                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    //  intent.putExtra("pressure", set);
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