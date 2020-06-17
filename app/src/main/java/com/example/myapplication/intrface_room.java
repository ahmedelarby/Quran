package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface intrface_room {


    @Insert
    public void insart(Model_room room);
    @Update
    public  void updet(Model_room room);
    @Delete
    public  void delete(Model_room room);
    @Query("select * from Model_room;")
    public List<Model_room>selcted();

}
