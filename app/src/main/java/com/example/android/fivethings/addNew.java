package com.example.android.fivethings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
        addListenerOnsaveButton();
    }

    /**
     * pick a date
     */

    /**
     * when press save, jump to the former page
     */
    Button save_buttom;

    public void addListenerOnsaveButton() {
        final Context context = this;
        save_buttom = (Button) findViewById(R.id.saveButton);
        save_buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, tops.class);

                startActivity(intent);

            }
        });

    }

    /**
     * get the input information
     */
    public void saveButtom(View view) {
        EditText brandField = (EditText) findViewById(R.id.brand);
        String brand = brandField.getText().toString();// store brand information
        EditText dateField = (EditText) findViewById(R.id.date);
        String date = dateField.getText().toString();//store date information
        EditText colorField = (EditText) findViewById(R.id.color);
        String color = colorField.getText().toString();//store color
        EditText priceField = (EditText) findViewById(R.id.price);
        String price = priceField.getText().toString();//store price
        EditText noteField = (EditText) findViewById(R.id.notes);
        String note = noteField.getText().toString();//store notes and thoughts
        String newRecords = createRecords(brand, date, color, price, note);

        Intent i = new Intent(addNew.this, tops.class);
        i.putExtra("newRecords", "hello world");
        startActivity(i);

        //Toast.makeText(this,"A new item added!",Toast.LENGTH_SHORT).show();
    }

    /**
     * items list
     */
    public String createRecords(String brand, String date, String color, String price, String note) {
        String records = "Brand: " + brand;
        records += "\nBought Date: " + date;
        records += "\nColor: " + color;
        records += "\nPrice: " + price;
        records += "\nNotes: " + note;
        return records;
    }

    /**
     * take a photo with the Camera App
     */
    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
