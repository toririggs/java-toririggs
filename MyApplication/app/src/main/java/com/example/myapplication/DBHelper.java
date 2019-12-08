package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "checkout";
    private static final String TABLE_USERS = "users";
    private static final String TABLE_STATUS = "status";
    private static final String ITEM_ID = "itemid";
    private static final String ITEM_NAME = "itemname";
    private static final String STATUS = "status";
    private static final String CHECKED_OUT_TO = "checkedoutto";
    private static final String USER_ID = "userid";
    private static final String USER_NAME = "username";
    private static final String EMAIL = "email";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USERS + "(" + USER_ID + " INTEGER PRIMARY KEY, " + USER_NAME + " TEXT, " + EMAIL + " TEXT)";
        db.execSQL(CREATE_USERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }
}
