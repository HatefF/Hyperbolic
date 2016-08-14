package com.hyperbolic.hyperbolic.db;

import android.provider.BaseColumns;

/**
 * Created by Hatef on 8/13/2016.
 */
public class ExerciseContract {
    public static final String DB_NAME = "com.hyperbolic.exercises" ;
    public static final int DB_VERSION = 1 ;
    public class ExerciseEntry implements BaseColumns {
        public static final String TABLE = "Exercises" ;
        public static final String COL_EXERCISE_NAME = "Exercises" ;
        public static final String COL_EXERCISE_STEPS = "Exercises" ;
        public static final String COL_EXERCISE_DURATION = "Exercises" ;
        public static final String COL_EXERCISE_MUSCLEGROUPS = "Exercises" ;
        public static final String COL_EXERCISE_REPSETS = "Exercises" ;
        public static final String COL_EXERCISE_EQUIPMENT = "Exercises" ;
    }
}

