package com.example.priva.myapplication;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;

import android.widget.ListView;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {

    String[] movies = {
            "An American Horror Story Season 1",
            "An American Horror Story Season 1",
            "An American Horror Story Season 1",
            "Game of Thrones Season 1",
            "Game of Thrones Season 2",
            "Game of Thrones Season 3",
            "Game of Thrones Season 4",
            "True Detective Season 1"

    };
    EditText text;
    Button btn;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(this);


        ListAdapter listviewadapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, movies);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(listviewadapter);
        listView.setOnItemClickListener(this);




    }

        //test upload
    @Override

    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        String movies = String.valueOf(parent.getItemAtPosition(position));
        Toast.makeText(this, movies, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Show.class);
        i.putExtra("movies", movies);
        startActivity(i);


    }
    @Override
    public void onClick(View view) {
        String New = text.getText().toString();

    }
//     public String[] newstring(String[] thestring) {
//        int n = thestring.length;
//
//    }

}