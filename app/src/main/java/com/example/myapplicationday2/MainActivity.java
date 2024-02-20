package com.example.myapplicationday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView myTitle;
    TextView myName;
    TextView myDisplay;
    EditText myInput;
    Button myClick;
    Button myClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num1;
        int countNumber;
        int average;

        char cat;
        boolean condition;

        String myName;
        int currentYear = 2014;
        currentYear = 2018;

        myTitle = findViewById(R.id.txtTitle);
        myName = findViewById(R.id.txtName);
        myDisplay = findViewById(R.id.txtDisplay);
        myInput = findViewById(R.id.txtInputName);
        myClick = findViewById(R.id.btnClickMe);
        myClear = findViewById(R.id.btnClear);



        //myDisplay.setText("HELLO POGI!");

        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = myInput.getText().toString();
                myDisplay.setText("HELLO"+name+"!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setText("HELLO POGI!");

            }
        });

    }
}