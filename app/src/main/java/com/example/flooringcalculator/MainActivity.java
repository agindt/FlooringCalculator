package com.example.flooringcalculator;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextInputEditText txtRoomWidth;
    TextInputEditText txtRoomLength;
    Button btnCalc;
    String width;
    String length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRoomWidth = (TextInputEditText) findViewById(R.id.textEditRoomWidth);
        txtRoomLength = (TextInputEditText) findViewById(R.id.textEditRoomLength);

        btnCalc = (Button) findViewById(R.id.buttonCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do stuff
                width = txtRoomWidth.getText().toString();
                length = txtRoomLength.getText().toString();
                Intent resultIntent = new Intent(getApplicationContext(), FlooringResult.class);
                resultIntent.putExtra("Width", width);
                resultIntent.putExtra("Length", length);
                startActivity(resultIntent);

            }
        });

    }
}
