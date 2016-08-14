package com.hyperbolic.hyperbolic.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hatef on 8/13/2016.
 */
public class ExerciseDbHelper extends SQLiteOpenHelper {
    @Override
    public void onCreate(SQLiteDatabase db){
        String createTable = "CREATE TABLE" + ExerciseContract.ExerciseEntry.TABLE + "( " +
                ExerciseContract.ExerciseEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_NAME + " TEXT NOT NULL, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_STEPS + " TEXT NOT NULL, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_DURATION + " TEXT NOT NULL, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_MUSCLEGROUPS + " TEXT NOT NULL, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_REPSETS + " TEXT NOT NULL, " +
                ExerciseContract.ExerciseEntry.COL_EXERCISE_EQUIPMENT + " TEXT NOT NULL); ";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + ExerciseContract.ExerciseEntry.TABLE);
        onCreate(db);
    }

    public ExerciseDbHelper (Context context) {
        super (context, ExerciseContract.DB_NAME, null, ExerciseContract.DB_VERSION);


    }

}
