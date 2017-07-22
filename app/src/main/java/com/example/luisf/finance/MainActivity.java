package com.example.luisf.finance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onCreate2(View view) {
        setContentView(R.layout.activity_main2);
    }

    public void onCreate3(View view) {
        setContentView(R.layout.activity_main);
    }
}
