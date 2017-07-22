package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        Bundle infos = intent.getExtras();
        String texto = infos.getString("editText");
        textView.setText(texto);
    }
}
