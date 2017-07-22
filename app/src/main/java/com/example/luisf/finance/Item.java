package com.example.luisf.finance;

/**
 * Created by Thaynara on 22/07/2017.
 */

public class Item {
    String nomeItem = new String();
    String codItem = new String();
    double precoItem;
    int qtdItem;


    public Item (String nomeItem, String codItem, double precoItem, int qtd){
        this.setNomeItem(nomeItem);
        this.setCodItem(codItem);
        this.setPrecoItem(precoItem);
        this.setQtdItem(qtd);
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtd) {
        this.qtdItem = qtd;
    }

    public void inicializa(){

        this.nomeItem = "Barra de Cereal";
        this.codItem = "123";
        this.precoItem = 1.20;
//çafado


    }
}

