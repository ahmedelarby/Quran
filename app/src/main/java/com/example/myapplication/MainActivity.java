package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent s =new Intent(MainActivity.this,Main2Activity.class);
            startActivity(s);
            finish();
        }
    }, 3000);



    }
}
