package com.example.luisf.finance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GerarRelatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerarrelatorio);
    }

    public void startSecondActivity(View view) {
        Intent secondActivity = new Intent(this, Main2Activity.class);
            EditText editText = (EditText)findViewById(R.id.editText);
            String texto = editText.getText().toString();
            Bundle infos = new Bundle();
            infos.putString("editText", texto);
            secondActivity.putExtras(infos);
        startActivity(secondActivity);
    }
}
