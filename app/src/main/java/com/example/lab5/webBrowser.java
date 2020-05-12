package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class webBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        String msg = "This was (only) a demonstration for how to use Intent filters"
                + " to make an app component respond to the user, so the user can choose”
                + " which app to use" ;

        Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();

    }
}

