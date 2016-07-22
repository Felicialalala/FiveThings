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
    Button buttonBack;
    //Bundle bundle = getIntent().getExtras();

    public ListView itemsListView;
    public ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops);

        //String newRecords = getIntent().getStringExtra("newRecords");
        //Log.d("@@@@", "newRecords="+newRecords);

//        Bundle bundle = getIntent().getExtras();
//        String newRecord = bundle.getString("newRecord");

        String[] items = {"Red Valentino\n2016.5.17\npink\n4000\nNice gift!",
                "Kate Spade\n2016.8.1\nblack\n3000\nI shouldn't buy it.",
        "Lily Brown\n2016.8.3\nwhite\n800\nNice",
        "Snidel\n2016.8.10\ngrey\n900\nCute",
        "Snidel\n2016.8.10\npink\n800\nGood Style"};//The list of items
        itemsListView = (ListView) findViewById(R.id.records);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        itemsListView.setAdapter(arrayAdapter);

        addListenerOnButtonAdd();
        addListenerOnButtonBack();
    }

    /**
     * The page jump to when adding a new item
     */
    public void addListenerOnButtonAdd() {
        final Context context = this;
        buttonAdd = (Button) findViewById(R.id.add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, addNew.class);
                startActivity(intent);
            }
        });
    }

    /**
     * The page jump to when adding a new item
     */
    public void addListenerOnButtonBack() {
        final Context context = this;
        buttonAdd = (Button) findViewById(R.id.back);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}