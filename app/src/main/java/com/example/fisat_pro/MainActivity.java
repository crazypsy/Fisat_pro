package com.example.fisat_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton b1;
Button k1,k2,k3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.floating);
        k1=findViewById(R.id.Nosstification);
        k2=findViewById(R.id.approvedMore);
        k3=findViewById(R.id.DeclinedMore);
        k1.setText("more");
        k2.setText("more");
        k3.setText("more");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),Student_Input.class);

                startActivity(intent);

            }
        });
    }
}