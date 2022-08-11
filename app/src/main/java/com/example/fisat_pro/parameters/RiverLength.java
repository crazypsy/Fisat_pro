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

public class RiverLength extends AppCompatActivity {
    private static final String[] ANDROID_VERSIONS = {
            "centimeter",
            "meter ",
            "kilometer",


    };
    Button k1;
    MaterialSpinner spinner;

    EditText riverlenth, riverstopWatch;
    String riverlenthNumber, riverlenthunit, riverlengthstopwatch, set;


    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river_length);

        sh = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        riverlenth = findViewById(R.id.editTextTextRiverWidth);
        riverstopWatch = findViewById(R.id.editTextStopWatche);
        k1 = findViewById(R.id.SubMit);
        k1.setText("Save");
        spinner = (MaterialSpinner) findViewById(R.id.RiverWidthUnit);

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
                riverlenthNumber = riverlenth.getText().toString();
                riverlengthstopwatch = riverstopWatch.getText().toString();
                riverlenthunit = spinner.getText().toString();


                if (riverlenthNumber.equals("")) {
                    riverlenth.setError("Measure please");

                } else if (riverlengthstopwatch.equals("")) {
                    riverstopWatch.setError("Measure please");

                } else {
                    set = "1";
                    SharedPreferences.Editor ed = sh.edit();
                    ed.putString("riverlength", set);
                    ed.commit();


                    Intent intent = new Intent(getApplicationContext(), Student_Input.class);
                    //intent.putExtra("riverlength", set);
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