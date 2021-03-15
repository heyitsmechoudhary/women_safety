package com.example.womensafety;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHandler extends SQLiteOpenHelper {
    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
    }

    public void onCreate(SQLiteDatabase db){

    }

}
