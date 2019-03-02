package com.example.flooringcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FlooringResult extends AppCompatActivity {

    TextView tvResult;
    Button btnDone;
    String width;
    String length;
    int rWidth;
    int rLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring_result);

        tvResult = (TextView) findViewById(R.id.textViewFloorResult);
        btnDone = (Button) findViewById(R.id.buttonDone);

        Bundle extras = getIntent().getExtras();
        width = extras.getString("width");
        length = extras.getString("length");
        //seems like errors with parsing int
        rWidth = Integer.parseInt(width);
        rLength = Integer.parseInt(length);

        tvResult.setText("With a width of " + width + "and a length of " + length + ", the square feet of flooring needed is " + calculateArea(rWidth,rLength) + ".");

    }

    protected int calculateArea(int width, int length)
    {
        int area = 0;
        area = width * length;

        return area;
    }
}
