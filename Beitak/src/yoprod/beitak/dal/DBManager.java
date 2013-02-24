package yoprod.beitak.dal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "beitak.db";
	private static final int SCHEMA_VERSION = 1;
	
	public DBManager(Context context, String name, CursorFactory factory, int version) {
		super(context, DATABASE_NAME, factory, SCHEMA_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE login (_id INTEGER PRIMARY KEY AUTOINCREMENT," +
		"user_name VARCHAR(MAX), password VARCHAR(MAX));");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}
