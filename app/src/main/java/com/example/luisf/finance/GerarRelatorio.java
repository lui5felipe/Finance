package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class GerarRelatorio extends AppCompatActivity {

    boolean show;
    ImageButton llConteudo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        show = true;
        setContentView(R.layout.gerarrelatorio);
        llConteudo = (ImageButton) findViewById(R.id.imageButton);
    }

   /* public void startSecondActivity(View view) {
        Intent secondActivity = new Intent(this, Main2Activity.class);
            EditText editText = (EditText)findViewById(R.id.editText);
            String texto = editText.getText().toString();
            Bundle infos = new Bundle();
            infos.putString("editText", texto);
            secondActivity.putExtras(infos);
        startActivity(secondActivity);
    }*/
   public void teste ()
   {
       if(show)
       {
           llConteudo.-f[99];
           show = false;
       }else {
           llConteudo.setVisibility(View.VISIBLE);
           show = true;
       }

   }

}
