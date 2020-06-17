package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class elsabha extends AppCompatActivity {
TextView textsabha;
Button entersabha;
int cunter=0;
TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elsabha);
        textView3=findViewById(R.id.textView3);
        textsabha=findViewById(R.id.textsabha);
        textsabha.setText(cunter+"");
        entersabha=findViewById(R.id.entersabha);
        entersabha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              cunter++;
                textsabha.setText(cunter+"");
                entersabha.setText("انتا الان تسبح");
                    for (int i =0; i<20;i++){
                    textView3.setVisibility(View.VISIBLE);}

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        entersabha.setText("اضغط للتسبيح");
                        textView3.setVisibility(View.GONE);
                    }
                }, 3000);



            }
        });

    }
}
