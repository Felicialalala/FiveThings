package com.example.android.fivethings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class tops extends AppCompatActivity {
    Button buttonAdd;
    //Bundle bundle = getIntent().getExtras();

    public ListView itemsListView;
    public ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops);
        //String newRecords = getIntent().getExtras().getString("newRecords");
        //Bundle bundle = getIntent().getExtras();
        //String newRecord = bundle.getString("newRecord");

        String[] items = {"Red Valentino\n2016.5.17\npink\n4000\nNice gift!",
        "Kate Spade\n2016.8.1\nblack\n3000\nI shouldn't buy it."};//The list of items
        itemsListView = (ListView)findViewById(R.id.records);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,items);
        itemsListView.setAdapter(arrayAdapter);

        addListenerOnButtonAdd();
    }

    /**
     * The page jump to when adding a new item
     */
    public void addListenerOnButtonAdd(){
        final Context context = this;
        buttonAdd = (Button)findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, addNew.class);
                startActivity(intent);
            }
        });
    }
}