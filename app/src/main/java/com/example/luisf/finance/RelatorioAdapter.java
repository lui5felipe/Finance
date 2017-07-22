package com.example.luisf.finance;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


public class RelatorioAdapter extends BaseExpandableListAdapter{

    private String[] listaPai = { "Tipo de venda", "Crédito", "Débito" };
    private String[][] listafilho = { { "Subcategoria 1", "Subcategoria 1.2" },
            { "Subcategoria 2" }, { "Subcategoria 3" } };
    Context context;

    public RelatorioAdapter(Context context) {

        this.context = context;
    }

    public Object getChild(int groupPosition, int childPosition) {
// TODO Auto-generated method stub
        return listafilho[groupPosition][childPosition];
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
// TODO Auto-generated method stub
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

// Criamos um TextView que conterá as informações da listafilho que
// criamos
        TextView textViewSubLista = new TextView(context);
        textViewSubLista.setText(listafilho[groupPosition][childPosition]);
// Definimos um alinhamento
        textViewSubLista.setPadding(10, 5, 0, 5);

        return textViewSubLista;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
// TODO Auto-generated method stub
        return listafilho[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
// TODO Auto-generated method stub
        return listaPai[groupPosition];
    }

    @Override
    public int getGroupCount() {
// TODO Auto-generated method stub
        return listaPai.length;
    }

    @Override
    public long getGroupId(int groupPosition) {
// TODO Auto-generated method stub
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

// Criamos um TextView que conterá as informações da listaPai que
// criamos
        TextView textViewCategorias = new TextView(context);
        textViewCategorias.setText(listaPai[groupPosition]);
// Definimos um alinhamento
        textViewCategorias.setPadding(30, 5, 0, 5);
// Definimos o tamanho do texto
        textViewCategorias.setTextSize(20);
// Definimos que o texto estará em negrito
        textViewCategorias.setTypeface(null, Typeface.BOLD);

        return textViewCategorias;
    }

    @Override
    public boolean hasStableIds() {
// TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
// Defina o return como sendo true se vc desejar que sua sublista seja selecionável
        return false;
    }
}
