package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mozikara extends AppCompatActivity {
EditText sibjact;
EditText editText_note;
Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozikara);

        sibjact=findViewById(R.id.sibjact);
        editText_note=findViewById(R.id.editText_note);
        save=findViewById(R.id.save);






        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Sibjet=sibjact.getText().toString();
                String noted = editText_note.getText().toString();
                if (Sibjet.isEmpty()){
                    sibjact.setError("is Empty");
                    save.setError("is Empty");
                    return;
                }
                if (noted.isEmpty()){
                    editText_note.setError("is Empty");
                    return;
                }

                 else{
                Model_room room = new Model_room(Sibjet,noted);

                mydatabase.getMydatabaseinstins(mozikara.this).
                      intrface_room1().insart(room);
                Intent oll = new Intent(mozikara.this,note_Recycler_oll_note.class);
                startActivity(oll);
                finish();
                }















            }
        });













    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item1:
                Intent note= new Intent(this,note_Recycler_oll_note.class);
                startActivity(note);
                finish();




        }
        return super.onOptionsItemSelected(item);

    }
}
