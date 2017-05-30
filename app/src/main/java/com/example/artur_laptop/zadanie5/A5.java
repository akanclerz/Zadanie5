package com.example.artur_laptop.zadanie5;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.artur_laptop.zadanie5.R.layout.a5;

/**
 * Created by Artur-laptop on 2017-04-18.
 */

public class A5 extends AppCompatActivity {


    private String[] lang;
    private String[] phrases;

    private ListView lv;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(a5);
        lv = (ListView) findViewById(R.id.galaxy_a5);
        initResources();
        initLanguagesListView();
    }

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.galaxy_a5);
    }

    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));
    }
}
