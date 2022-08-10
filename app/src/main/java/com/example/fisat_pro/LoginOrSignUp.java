package com.example.fisat_pro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginOrSignUp extends AppCompatActivity {
    Button img1, img2;
    boolean doubleBackToExitPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_sign_up);



        img1=findViewById(R.id.imageButton);
        img2=findViewById(R.id.image);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegisterChoose.class));
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
    }
//    private void selectImageOption() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(LoginOrSignUp.this);
//        builder.setMessage("Are you sure you want to exit?");
//        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener()
//        {
//
//            @Override
//            public void onClick(DialogInterface arg0, int arg1)
//            {
//                startActivity(new Intent(getApplicationContext(), Cust_login.class));
//            }
//        }).setNegativeButton("No",null);
//        builder.show();
//    }

    public void onBackPressed() {
        // TODO Auto-generated method stub
//        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("Exit  :")
//                .setMessage("Are you sure you want to exit..?")
//                .setPositiveButton("Yes",new DialogInterface.OnClickListener()
//                {
//
//                    @Override
//                    public void onClick(DialogInterface arg0, int arg1)
//                    {
//                        // TODO Auto-generated method stub
//                        Intent i=new Intent(Intent.ACTION_MAIN);
//                        i.addCategory(Intent.CATEGORY_HOME);
//                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(i);
//                        finish();
//                    }
//                }).setNegativeButton("No",null).show();
//        Intent i=new Intent(Intent.ACTION_MAIN);
//        i.addCategory(Intent.CATEGORY_HOME);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(i);
//        finish();


        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
            finishAffinity();
            System.exit(0);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}