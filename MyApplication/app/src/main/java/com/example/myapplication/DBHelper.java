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
        String CREATE_STATUS_TABLE = "CREATE TABLE " + TABLE_STATUS + "(" + ITEM_ID + " INTEGER PRIMARY KEY, " + ITEM_NAME + " TEXT, " + STATUS + " TEXT, " + CHECKED_OUT_TO + " TEXT)";
        db.execSQL(CREATE_STATUS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STATUS);
        onCreate(db);
    }

    void addUser(int id, String name, String email) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(USER_ID, id);
        values.put(USER_NAME, name);
        values.put(EMAIL, email);

        db.insert(TABLE_USERS, null, values);
        db.close();
    }

    void addStatus(int id, String name, String status, int checked){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(ITEM_ID, id);
        values.put(ITEM_NAME, name);
        values.put(STATUS, status);
        values.put(CHECKED_OUT_TO, checked);

        db.insert(TABLE_STATUS, null, values);
        db.close();
    }

    void updateStatus(int userid, String status, int checked) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(STATUS, status);
        values.put(CHECKED_OUT_TO, checked);

        db.update(TABLE_STATUS, values, ITEM_ID + " = ?", new String[] {String.valueOf(userid)});
    }

    // create separate get things for each bit to be displayed
    public String[] getItem(int itemid) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_STATUS, new String[]{ITEM_ID, ITEM_NAME, STATUS, CHECKED_OUT_TO}, ITEM_ID + "=?", new String[]{String.valueOf(itemid)}, null, null, null, null);
        if(cursor != null) cursor.moveToFirst();

        String[] item = new String[4];
        item[0] = cursor.getString(0);
        item[1] = cursor.getString(1);
        item[2] = cursor.getString(2);
        item[3] = cursor.getString(3);

        return item;
    }
}
