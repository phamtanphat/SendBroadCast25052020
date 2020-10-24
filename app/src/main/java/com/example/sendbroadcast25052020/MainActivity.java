package com.example.sendbroadcast25052020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        intent.setAction("android.com.khoapham.Device1");
        intent.putExtra("message" , "Hello");
        sendBroadcast(intent);
    }
}