package com.quicknexpert.layouttutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        //onCreate is called

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
