package com.example.android.fivethings;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class addNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
    }

    /**
     * pick a date
     */

    /**
     * take a photo with the Camera App
     */
    static final int REQUEST_IMAGE_CAPTURE = 1;

    /**
     * get the input information
     */
    public void saveButtom(View view){
        EditText brandField = (EditText)findViewById(R.id.brand);
        String brand = brandField.getText().toString();// store brand information
        EditText dateField = (EditText)findViewById(R.id.date);
        String date = dateField.getText().toString();//store date information
        EditText colorField = (EditText)findViewById(R.id.color);
        String color = colorField.getText().toString();//store color
        EditText priceField = (EditText)findViewById(R.id.price);
        String price = priceField.getText().toString();//store price
        EditText noteField = (EditText)findViewById(R.id.notes);
        String note = noteField.getText().toString();//store notes and thoughts
        String newRecords = createRecords(brand, date, color, price, note);
        display(newRecords);
    }

    /**
     * items list
     */
    public String createRecords(String brand,String date,String color,String price,String note){
        String records = "Brand: " + brand;
        records += "\nBought Date: " + date;
        records += "\nColor: " + color;
        records += "\nPrice: " + price;
        records += "\nNotes: " + note;
        return records;
    }
    /**
     * This method displays records on the screen.
     */
    private void display(String newRecords) {
        TextView quantityTextView = (TextView) findViewById(R.id.records);
        quantityTextView.setText(newRecords);
    }
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}
