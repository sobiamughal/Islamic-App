package com.example.roubaisha.counter.UserTasbih;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usman on 30/10/2015.
 */
public class Helper extends  SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "PersonDB";

    public Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


        String CREATE_TABLE = "CREATE TABLE Person ( " +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "name varchar(100) NULL"+
                ")";
        db.execSQL(CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS Person");
        this.onCreate(db);
    }

}













//
