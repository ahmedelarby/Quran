package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
Button qouran;
Button sabha;
Button mozikara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        qouran =findViewById(R.id.qouran);
        mozikara=findViewById(R.id.mozikara);
        sabha=findViewById(R.id.sabha);
        qouran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qouran = new Intent(Main2Activity.this,menu_one.class);
                startActivity(qouran);
            }
        });

        sabha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sabha = new Intent(Main2Activity.this,elsabha.class);
                startActivity(sabha);
            }
        });

        mozikara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mozikara= new Intent(Main2Activity.this,mozikara.class);
                startActivity(mozikara);
            }
        });
    }
}
