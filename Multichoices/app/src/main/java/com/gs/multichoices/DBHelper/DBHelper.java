package com.gs.multichoices.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteDatabase {

    private static final String DA_NAME = "EDMTQuiz2019.db";

    public DBHelper(Context context, String name, String storageDirectory, CursorFactory factory, int version){
        super(context,name, storageDirectory,factory,version);

    }
}
