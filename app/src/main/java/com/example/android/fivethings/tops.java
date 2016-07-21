package com.example.android.fivethings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tops extends AppCompatActivity {
    Button buttonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops);
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