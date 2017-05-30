package com.example.artur_laptop.zadanie5;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] lang;
    private String[] phrases;

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.langagues);
        initResources();
        initLanguagesListView();
    }

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.languages);
    }

    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,lang));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id){
                if(lang[pos].equals("Samsung A5 2016")  ) {
                    Intent intent = new Intent(MainActivity.this, A5.class);
                    startActivity(intent);
                }
                if(lang[pos].equals("Samsung A3 2016")  ) {
                    Intent intent = new Intent(MainActivity.this, A3.class);
                    startActivity(intent);
                }
                if(lang[pos].equals("Samsung J5 2016")  ) {
                    Intent intent = new Intent(MainActivity.this, J5.class);
                    startActivity(intent);
                }
            }
        });
    }
}
