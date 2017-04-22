package com.example.honguyen.feedy;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.honguyen.feedy.databases.Feedy;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private static final String TAG = "MainActivity ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView = (ListView) findViewById(R.id.listView);
        FeedyDatabases feedyDatabases = FeedyApplication.getInstance().getFeedyDatabases();
        feedyDatabases.loadAllFeedy();
        Log.d(TAG, "onCreate: " + feedyDatabases.loadAllFeedy().get(0).toString());



    }
}

