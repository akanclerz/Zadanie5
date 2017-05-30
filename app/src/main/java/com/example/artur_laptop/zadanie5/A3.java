package com.example.artur_laptop.zadanie5;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.artur_laptop.zadanie5.R.layout.a3;

/**
 * Created by Artur-laptop on 2017-04-18.
 */

public class A3 extends AppCompatActivity{


    private String[] lang;
    private ListView lv;

    protected void onCreate(Bundle savedInstanceState){



        super.onCreate(savedInstanceState);
        setContentView(a3);
        lv = (ListView) findViewById(R.id.galaxy_a3);
        initResources();
        initLanguagesListView();
    }

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.galaxy_a3);
    }

    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));
    }
}
