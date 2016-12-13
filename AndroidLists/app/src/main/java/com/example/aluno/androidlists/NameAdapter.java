package com.example.aluno.androidlists;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aluno on 12/12/2016.
 */

public class NameAdapter extends BaseAdapter{

    private List<Pessoa> nameList;
    private Activity activity;

    public NameAdapter(List<Pessoa> nameList, Activity activity) {
        this.nameList = nameList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        TextView name = (TextView)view.findViewById(R.id.text_view);
        TextView genero = (TextView)view.findViewById(R.id.txtGenero);
        TextView sangue = (TextView)view.findViewById(R.id.txtSangue);

        final Pessoa nome = nameList.get(position);

        name.setText(nome.getNome());
        genero.setText(nome.getGenero());
        sangue.setText(nome.getTipoSanguineo());

        int greenColorValue = Color.parseColor("#00ff00");
        int blueColorValue = Color.parseColor("#0000ff");



        if (nome.getDoador() == true){
            name.setBackgroundColor(greenColorValue);
        } else {
            name.setBackgroundColor(blueColorValue);
        }



        /*
        if (position%2 == 0){
            name.setBackgroundColor(greenColorValue);
            txtSim.setVisibility(View.VISIBLE);
            txtNao.setVisibility(View.GONE);
        } else{
            name.setBackgroundColor(blueColorValue);
            txtSim.setVisibility(View.GONE);
            txtNao.setVisibility(View.VISIBLE);
        }
*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("gustavo", nome.getNome());
            }
        });

        return view;
    }
}
