package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class GerarRelatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.GerarRelatorio);
        Button btnOk =  (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(oncli);
    }

    private OnClickListener oncli = new OnClickListener() {
        @Override
        public void onClick(View view) {
            // TODO Auto-generated method stub
            Intent intent = new Intent(this, Teste.class);
            TextView edtTexto = (TextView) findViewById(R.id.edtTexto);

            String txt = "";
            txt = edtTexto.getText().toString();
            Bundle bundle = new Bundle();

            bundle.putString("txt", txt);
            intent.putExtras(bundle);

            startActivity(intent);


        }
    }
}
