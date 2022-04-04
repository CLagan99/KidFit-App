package com.example.kidfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "userrewards.db";
    public static final String TABLE_NAME = "userrewards";
    public static final String COL_1 = "userID";
    public static final String COL_2 = "username";
    public static final String COL_3 = "rewardID";
    public static final String COL_4 = "rewardname";
    public static final String COL_5 = "userrewards";

    public DatabaseHelper(@Nullable Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("CREATE TABLE userrewards (ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, rewardID INT, rewardname TEXT) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public long addUser(String user)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues newValues = new ContentValues();
        newValues.put("username", user);
        long res = db.insert("userrewards", null, newValues);
        db.close();
        return res;
    }

    public long addReward(String user, String reward)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues newValues = new ContentValues();
        newValues.put("rewardname", reward);
        newValues.put("username", user);
        long res = db.insert("userrewards", null, newValues);
        db.close();
        return res;
    }
}
