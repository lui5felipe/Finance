package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GerarRelatorio extends AppCompatActivity {

    boolean isImageFitToScreen;
    ImageView grafico, grafico2, grafico3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_relatorio);
        Button bbuscar = (Button)findViewById(R.id.buscaRelatorio);

        //Alocação das Imagens e Textos
        final TextView text = (TextView)findViewById(R.id.textView5);
        final TextView text2 = (TextView)findViewById(R.id.textView7);
        final TextView text3 = (TextView)findViewById(R.id.textView8);
        grafico = (ImageView)findViewById(R.id.grafRelatorio);
        grafico2 = (ImageView)findViewById(R.id.grafRelatorio2);
        grafico3 = (ImageView)findViewById(R.id.grafRelatorio3);

       bbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grafico.setVisibility(View.VISIBLE);
                grafico2.setVisibility(View.VISIBLE);
                grafico3.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);

            }
        });
    }
}
