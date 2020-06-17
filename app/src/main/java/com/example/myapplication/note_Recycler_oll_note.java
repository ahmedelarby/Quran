package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class note_Recycler_oll_note extends AppCompatActivity {
RecyclerView rec_note;
Adapter_Recycler_oll_note adapter_recycler_oll_note;
LinearLayoutManager linearLayoutManager;
List<Model_room>idates = new ArrayList<>();
List<Model_room>idet;
public static Model_room room12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note__recycler_oll_note);
        rec_note=findViewById(R.id.rec_note);

        adapter_recycler_oll_note = new Adapter_Recycler_oll_note(idates,this);
        adapter_recycler_oll_note.setOnclickeitem(new Adapter_Recycler_oll_note.onclickeitem() {
            @Override
            public void onclicke(int pos, Model_room room) {
                if (room!=null) {
                    mydatabase.getMydatabaseinstins(note_Recycler_oll_note.this).
                            intrface_room1().delete(room);
                    Toast.makeText(note_Recycler_oll_note.this, "تم الازاله", Toast.LENGTH_SHORT).show();
                    Intent go = new Intent(note_Recycler_oll_note.this,mozikara.class);
                    startActivity(go);
                    finish();
                }


            }
        });
        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rec_note.setAdapter(adapter_recycler_oll_note);
        rec_note.setLayoutManager(linearLayoutManager);











    }

    @Override
    protected void onStart() {
        super.onStart();

        idates=  mydatabase.getMydatabaseinstins(this).intrface_room1().selcted();
        adapter_recycler_oll_note.setData(idates);
    }

    @Override
    protected void onResume() {
        super.onResume();

        adapter_recycler_oll_note.setData(idates);


    }
}
