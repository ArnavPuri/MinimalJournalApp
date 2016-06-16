package in.teachcoder.minimaljournal.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Arnav on 16-Jun-16.
 */
public class MyDB {
    private SQLiteDatabase db;
    private DBHelper dbHelper;

    public MyDB (Context c){
        dbHelper = new DBHelper(c);
    }

    public void open(){
        db = dbHelper.getWritableDatabase();
    }

    public void close(){
        db.close();
    }


}
