package com.example.honguyen.feedy;

import android.app.Application;

import com.example.honguyen.feedy.databases.Feedy;

/**
 * Created by HongUyen on 22-Apr-17.
 */

public class FeedyApplication extends Application {
    private FeedyDatabases feedyDatabases;
    private static FeedyApplication instance;

    @Override
    public void onCreate() {
        feedyDatabases = new FeedyDatabases(this);
        instance = this;
        super.onCreate();

    }

    public FeedyDatabases getFeedyDatabases(){
        return feedyDatabases;
    }

    public static FeedyApplication getInstance() {
        return instance;
    }
}
