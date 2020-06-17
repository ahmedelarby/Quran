package com.example.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
@Database(entities = {Model_room.class},version = 1,exportSchema = false)
public abstract class mydatabase extends RoomDatabase {


  private static   mydatabase mydatabaseinstins;
public abstract intrface_room intrface_room1();
    public static mydatabase getMydatabaseinstins(Context context) {
        if (mydatabaseinstins==null){

            mydatabaseinstins = Room.databaseBuilder(context.getApplicationContext(),
                    mydatabase.class,"todo").allowMainThreadQueries().build();

        }
        return mydatabaseinstins;

    }
}
