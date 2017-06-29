package com.tencent.neilchen.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by neil.chen on 2017/6/29.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

  public static final String CREATE_BOOK = "create table book ("
      + "id integer primary key autoincrement, "
      + "author text, "
      + "price real, "
      + "pages integer, "
      + "name text)";
  private Context context;

  public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
      int version) {
    super(context, name, factory, version);
    this.context = context;
  }


  @Override public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_BOOK);
    Toast.makeText(context,"Create succeeded",Toast.LENGTH_SHORT).show();
  }

  @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

  }
}
