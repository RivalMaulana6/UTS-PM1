package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListChattingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chatting);

        ListView listView = findViewById(R.id.listView);
        String[] chats = {"Halo", "Apa kabar?", "Selamat datang!"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, chats);
        listView.setAdapter(adapter);
    }
}