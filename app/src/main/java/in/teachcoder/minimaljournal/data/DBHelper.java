package in.teachcoder.minimaljournal.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Arnav on 16-Jun-16.
 */
public class DBHelper extends SQLiteOpenHelper {

//    Create table query - SQLite
    private static final String CREATE_TABLE = "create table " +
            Constants.TABLE_NAME  + " (" +
            Constants.KEY_ID + " integer primary key autoincrement " +
            Constants.TITLE_NAME + " text not null " +
            Constants.CONTENT_NAME + " text not null " +
            Constants.HIGHLIGHT_NAME + " text not null " +
            Constants.MOOD + " text not null " +
            Constants.DATE_NAME + " text not null) " ;



    public DBHelper(Context c) {
        super(c, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" drop table if exists " + Constants.TABLE_NAME);
        onCreate(db);
    }
}
