package a58010207.com.example.priva.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import static a58010207.com.example.priva.myapplication.constant.*;


public class NotesHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "simple_sqlite.db";
    private static final int DATABASE_VERSION = 1;

    public NotesHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TIME + " INTEGER, " + CONTENT + " TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
