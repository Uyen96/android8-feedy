package com.example.honguyen.feedy;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.honguyen.feedy.databases.Feedy;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HongUyen on 22-Apr-17.
 */

public class FeedyDatabases extends SQLiteAssetHelper {
    private SQLiteAssetHelper openHelper;
    private SQLiteDatabase database;

    private static final String DB_NAME = "feedy.db";
    private static final int DB_VERSION = 1;

    private static final String FEEDY_IMANGE = "image";
    private static final String FEEDY_NAME = "name";
    private static final String FEEDY_RECIPE = "recipe";
    private static final String FEEDY_IS_FAVORITE = "is_favourite";

    private static final String[] FEEDY_NEW_COLUMNS = new String[]{
            FEEDY_IMANGE,
            FEEDY_NAME,
            FEEDY_RECIPE,
            FEEDY_IS_FAVORITE
    };
    private static final String TAG = "FeedyDatabases" ;

    public FeedyDatabases(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    public void  close(){
        if(database != null){
            this.database.close();
        }
    }

    public List<Feedy> loadAllFeedy() {
        List<Feedy> feedyList = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query("tbl_feedy", FEEDY_NEW_COLUMNS, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String image = cursor.getString(cursor.getColumnIndex(FEEDY_IMANGE));
            String name = cursor.getString(cursor.getColumnIndex(FEEDY_NAME));
            String recipe = cursor.getString(cursor.getColumnIndex(FEEDY_RECIPE));
            boolean isFavorite = cursor.getInt(cursor.getColumnIndex(FEEDY_IS_FAVORITE)) != 0;

            Feedy feedy = new Feedy(image, name, recipe, isFavorite);
            feedyList.add(feedy);
        }
        return feedyList;
    }


}
