package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class GerarRelatorio extends AppCompatActivity {

    Button bbuscar = (Button)findViewById(R.id.buscaRelatorio);
    ImageView grafico = (ImageView)findViewById(R.id.grafRelatorio);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerarrelatorio);

        bbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grafico.setVisibility(View.VISIBLE);
            }
        });
    }

    /*public void startSecondActivity(View view) {
        Intent secondActivity = new Intent(this, Main2Activity.class);
            EditText editText = (EditText)findViewById(R.id.editText);
            String texto = editText.getText().toString();
            Bundle infos = new Bundle();
            infos.putString("editText", texto);
            secondActivity.putExtras(infos);
        startActivity(secondActivity);
    }*/
}
