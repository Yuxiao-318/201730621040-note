package cn.jsbintask.memo.common;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import cn.jsbintask.memo.MemoApplication;


public class DBOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = DBOpenHelper.class.getSimpleName();
    private static final int VERSION = 1;
    private static final String DB_NAME = "memo.db";

    public DBOpenHelper() {
        super(MemoApplication.getContext(), DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /*第一次初始化app，创建表结构 */
        db.execSQL("CREATE TABLE IF NOT EXISTS " + ColumnContacts.EVENT_TABLE_NAME + "( "
                    + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + ColumnContacts.EVENT_TITLE_COLUMN + " text, "
                    + ColumnContacts.EVENT_CONTENT_COLUMN + " text, "
                    + ColumnContacts.EVENT_CREATED_TIME_COLUMN + " datetime, "
                    + ColumnContacts.EVENT_UPDATED_TIME_COLUMN + " datetime, "
                    + ColumnContacts.EVENT_REMIND_TIME_COLUMN + " datetime, "
                    + ColumnContacts.EVENT_IS_IMPORTANT_COLUMN + " INTEGER, "
                    + ColumnContacts.EVENT_IS_CLOCKED + " INTEGER"
        + ")");

        db.setTransactionSuccessful();
        db.endTransaction();
    }

    /*版本更新时会执行该方法，如版本变更 => 2  */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Nothing to do
    }
}
