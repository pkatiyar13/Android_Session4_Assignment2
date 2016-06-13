package com.example.pankajkatiyar.phonenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] name = {"Rony","Nivedita","Snehal","Tony","Leela"};
    private String[] phone = {"9865234565","9889655235","9988665234","9848758652","9886563254"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lstView = (ListView)findViewById(R.id.lstView);

        CustomAdapter adapter = new CustomAdapter(this,name,phone);

        lstView.setAdapter(adapter);

    }
}
