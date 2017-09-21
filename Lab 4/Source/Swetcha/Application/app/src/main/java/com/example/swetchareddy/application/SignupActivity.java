package com.example.swetchareddy.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Swetcha Reddy on 9-20-2017.
 */

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        TextView ls = (TextView) findViewById(R.id.btn_login);

        /*
        ls.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                finish();
            }

        });
        */
    }

    public void register(View v) {
        Intent redirect = new Intent(SignupActivity.this, MainActivity.class);
        startActivity(redirect);
    }
}