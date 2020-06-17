package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Model_room {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo
    String sabjact;
    @ColumnInfo
    String note;

    public Model_room() {
    }
    @Ignore
    public Model_room( String sabjact, String note) {

        this.sabjact = sabjact;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabjact() {
        return sabjact;
    }

    public void setSabjact(String sabjact) {
        this.sabjact = sabjact;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
