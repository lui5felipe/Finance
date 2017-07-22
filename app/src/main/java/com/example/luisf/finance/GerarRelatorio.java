package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class GerarRelatorio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_relatorio);
        Button bbuscar = (Button)findViewById(R.id.buscaRelatorio);
        final ImageView grafico = (ImageView)findViewById(R.id.grafRelatorio);

       bbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grafico.setVisibility(View.VISIBLE);
            }
        });
    }
}
