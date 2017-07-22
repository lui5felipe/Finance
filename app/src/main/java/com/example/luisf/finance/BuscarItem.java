package com.example.luisf.finance;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class BuscarItem extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_item);
    }

    public void startCameraLeitor(View view) {
        Intent startCameraLeitor = new Intent(this, BuscarItem.class);
        startActivity(startCameraLeitor);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 5678);
    }

    public ArrayList<Item> buscarItem (String nomeItem){

        Item nomeItemR;
        int i=0;
        ArrayList<Item> retorno = new ArrayList<>();
        List<Item> itens = new ArrayList<Item>() {
            {
                add(new Item("Barra de Cereal", "123", 1.20, 10));
                add(new Item("Barra de Cereal", "623", 0.90, 20));
                add(new Item("Macarrão", "721", 1.99, 05));
                add(new Item("Sabonete", "994", 0.69, 07));
                add(new Item("Chocolate", "420", 4.20, 24));
                add(new Item("Chocolate", "024", 4.20, 69));
            }
        };

        for(i=0;i<itens.size();i++) {
            if(itens.get(i).getNomeItem().equals(nomeItem)) {
                 retorno.add(itens.get(i));
            }
        }
        return retorno;
    }





}
