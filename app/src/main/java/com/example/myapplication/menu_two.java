package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class menu_two extends AppCompatActivity {
ViewPager viewPager;
List<model>list;
adapter adapter;
MediaPlayer mp = new MediaPlayer();
Integer []cor = null;
ArgbEvaluator argbEvaluator= new ArgbEvaluator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_two);





        int i=getIntent().getIntExtra("data",0);


        list= new ArrayList<>();
        switch (i){
            case (0):
                    list.add(new model(R.drawable.elfatha));

                break;

        case(1):
            list.add(new model(R.drawable.elbaqraone));
            list.add(new model(R.drawable.elbaqra_two));
            list.add(new model(R.drawable.elbqrathree));
            list.add(new model(R.drawable.elbqrafore));
            list.add(new model(R.drawable.elbaqrafife));
            list.add(new model(R.drawable.elbaqrasix));
            list.add(new model(R.drawable.elbaqrasefen));
            list.add(new model(R.drawable.elbaqraate));
            list.add(new model(R.drawable.elbaqranaine));
            list.add(new model(R.drawable.elbqrateen));
            list.add(new model(R.drawable.elbaqraelaven));
            list.add(new model(R.drawable.elbaqra_a));
            list.add(new model(R.drawable.elbaqra_b));
            list.add(new model(R.drawable.elbaqra_c));
            list.add(new model(R.drawable.elbaqra_d));
            list.add(new model(R.drawable.elbaqra_e));
            list.add(new model(R.drawable.elbaqra_f));
            list.add(new model(R.drawable.elbaqra_g));
            list.add(new model(R.drawable.elbaqra_h));
            list.add(new model(R.drawable.elbaqra_aey));
            list.add(new model(R.drawable.elbaqra_j));
            list.add(new model(R.drawable.elbaqra_k));
            list.add(new model(R.drawable.elbaqra_ell));
            list.add(new model(R.drawable.elbaqra_m));
            list.add(new model(R.drawable.elbaqra_n));
            list.add(new model(R.drawable.elbaqra_o));
            list.add(new model(R.drawable.elbaqra_p));
            list.add(new model(R.drawable.elbaqra_q));
            list.add(new model(R.drawable.elbaqra_r));
            list.add(new model(R.drawable.elbaqra_s));
            list.add(new model(R.drawable.elbaqra_t));
            list.add(new model(R.drawable.elbaqra_u));
            list.add(new model(R.drawable.elbaqra_v));
            list.add(new model(R.drawable.elbaqra_w));
            list.add(new model(R.drawable.elbaqra_x));
            list.add(new model(R.drawable.elbaqra_y));
            list.add(new model(R.drawable.elbaqra_z));
            list.add(new model(R.drawable.elbaqra_alf));
            list.add(new model(R.drawable.elbaqra_bah));
            list.add(new model(R.drawable.elbaqra_tah));
            list.add(new model(R.drawable.elbaqra_tha));
            list.add(new model(R.drawable.elbaqra_gem));
            list.add(new model(R.drawable.elbaqra_haa));
            list.add(new model(R.drawable.elbaqra_kha));
            list.add(new model(R.drawable.elbaqra_dal));
            list.add(new model(R.drawable.elbaqra_thal));
            list.add(new model(R.drawable.elbaqra_raa));
            list.add(new model(R.drawable.elbaqra_zeen));
            break;
            case (2):
                list.add(new model(R.drawable.all_omran_a));
                list.add(new model(R.drawable.all_omraan_b));
                list.add(new model(R.drawable.all_omraan_c));
                list.add(new model(R.drawable.all_omraan_d));
                list.add(new model(R.drawable.all_omraan_e));
                list.add(new model(R.drawable.all_omraan_f));
                list.add(new model(R.drawable.all_omraan_g));
                list.add(new model(R.drawable.all_omraan_h));
                list.add(new model(R.drawable.all_omraan_aee));
                list.add(new model(R.drawable.all_omraan_gaa));
                list.add(new model(R.drawable.all_omraan_k));
                list.add(new model(R.drawable.all_omraan_all));
                list.add(new model(R.drawable.all_omraan_m));
                list.add(new model(R.drawable.all_omraan_n));
                list.add(new model(R.drawable.all_omraan_o));
                list.add(new model(R.drawable.all_omraan_p));
                list.add(new model(R.drawable.all_omraan_q));
                list.add(new model(R.drawable.all_omraan_r));
                list.add(new model(R.drawable.all_omraan_s));
                list.add(new model(R.drawable.all_omraan_t));
                list.add(new model(R.drawable.all_omraan_u));
                list.add(new model(R.drawable.all_omraan_v));
                list.add(new model(R.drawable.all_omraan_w));
                list.add(new model(R.drawable.all_omraan_x));
                list.add(new model(R.drawable.all_omraan_y));
                list.add(new model(R.drawable.all_omraan_z));
                list.add(new model(R.drawable.all_omraan_alef));
                break;
            case (3):
                list.add(new model(R.drawable.elnsaa_a));
                list.add(new model(R.drawable.elnsaa_b));
                list.add(new model(R.drawable.elnsaa_c));
                list.add(new model(R.drawable.elnsaa_d));
                list.add(new model(R.drawable.elnsaa_e));
                list.add(new model(R.drawable.elnsaa_f));
                list.add(new model(R.drawable.elnsaa_g));
                list.add(new model(R.drawable.elnsaa_h));
                list.add(new model(R.drawable.elnsaa_aee));
                list.add(new model(R.drawable.elnsaa_gaa));
                list.add(new model(R.drawable.elnsaa_k));
                list.add(new model(R.drawable.elnsaa_oll));
                list.add(new model(R.drawable.elnsaa_m));
                list.add(new model(R.drawable.elnsaa_n));
                list.add(new model(R.drawable.elnsaa_o));
                list.add(new model(R.drawable.elnsaa_p));
                list.add(new model(R.drawable.elnsaa_q));
                list.add(new model(R.drawable.elnsaa_r));
                list.add(new model(R.drawable.elnsaa_s));
                list.add(new model(R.drawable.elnsaa_t));
                list.add(new model(R.drawable.elnsaa_u));
                list.add(new model(R.drawable.elnsaa_v));
                list.add(new model(R.drawable.elnsaa_w));
                list.add(new model(R.drawable.elnsaa_x));
                list.add(new model(R.drawable.elnsaa_y));
                list.add(new model(R.drawable.elnsaa_z));
                list.add(new model(R.drawable.elnsaa_one));
                list.add(new model(R.drawable.elnsaa_two));
                list.add(new model(R.drawable.elnsaa_three));
                list.add(new model(R.drawable.elnsaa_fore));
                break;
            case (4):
                list.add(new model(R.drawable.elnsaa_fore));






        }

        adapter= new adapter(list,this);
        viewPager=findViewById(R.id.viewpager);

        viewPager.setAdapter(adapter);
    }
}
