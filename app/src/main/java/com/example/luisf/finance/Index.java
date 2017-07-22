package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Index);

    }

    public void startSecondActivity(View view) {

        Intent secondActivity = new Intent(this, GerarRelatorio.class);
        startActivity(secondActivity);
    }
}
