package com.example.aluno.androidlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Pessoa> nameList = new ArrayList<>();
        nameList.add(new Pessoa("Gustavo", true, "M", "O+"));
        nameList.add(new Pessoa("Eveline", true, "F", "AB"));
        nameList.add(new Pessoa("Daniel", true, "M", "AA"));
        nameList.add(new Pessoa("Carmen", true, "F", "B"));
        nameList.add(new Pessoa("Luciana", false, "F", "O+"));
        nameList.add(new Pessoa("Mario", false, "M", "AA"));

        ListView listView = (ListView)findViewById(R.id.list_names);
        listView.setAdapter(new NameAdapter(nameList, this));

        /*ListView listView = (ListView)findViewById(R.id.list_names);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, nameList);

        listView.setAdapter(stringArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.e("gustavo", "clicado em: "+nameList.get(i));
            }
        });*/

    }
}
