package com.example.felix.myapplication01;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;



public class OtherActivity extends AppCompatActivity {
    private TextView myTextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);



        Intent intent = getIntent();
        String value = intent.getStringExtra("testIntent");
        myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText(value);
    }



}
