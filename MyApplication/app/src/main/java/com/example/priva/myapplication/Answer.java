package com.example.priva.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by priva on 30-Oct-17.
 */

public class Answer extends AppCompatActivity {
    TextView text2;
    public String showanswer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        text2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        showanswer = getIntent().getStringExtra("rate");
        Toast.makeText(this, showanswer, Toast.LENGTH_SHORT).show();
        text2.setText(showanswer);

    }
}
