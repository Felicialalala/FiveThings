package com.example.android.fivethings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton1();
        addListenerOnButton2();
    }


    // dresses page
    public void addListenerOnButton1(){
        final Context context = this;
        button1 = (Button)findViewById(R.id.dresses);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, dresses.class);
                startActivity(intent);
            }
        });
    }
    //tops page
    public void addListenerOnButton2(){
        final Context context = this;
        button2 = (Button)findViewById(R.id.tops);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,tops.class);

                intent.putExtra("newRecords", "hello world");

                startActivity(intent);
            }
        });
    }
}
