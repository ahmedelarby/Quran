package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class menu_one extends AppCompatActivity {
ListView list;
     RecyclerView recyclerView;
     List<String>  idates= new ArrayList<>();
      Rec_adapter adapter1;

      LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_one);
       // list=findViewById(R.id.list);
        String []data={"الفاتحه","البقره","ال عمران","النساء","المائده","الانعام",
                "الاعراف","الانفال","التوبه",
                "يونس","هود","يوسف","الرعد","ابراهيم","الحجر","النحل","الاسراء","الكهف","مريم","طه","الانبياء","الحج","المومنون",
                  "النور","الفرقان","الشعراء","النمل","القصص","العنكبوت","الروم","لقمان",
                "السجده","الاحزاب","سبا","فاطر","يس","الصافات","ص","الزمر","غافر","فصلت","الشوري","الزخرف",
                 "الدخان","الجاثيه","الاحقاق","محمد","الفتح","الحجرات","ق",
                "الذاريات","الطور","النجم","القمر","الرحمن","الواقعه","الحديد","المجادله",
                "الحشر","الممتحنه","الصف","الجمعه","المنافقون","التغابن","الطلاق","التحريم",
                "الملك","القلم","الحاقه",
                "المعارج","نوج","الجن","المزمل","المدثر","القيامه","الانسان",
                "المرسلات","النبا","النازعات","عبس",
        "التكوير","الانفطار","المطففين","الانشقاق","البروج","الطارق","الاعلي",
                "الغاشيه","الفجر","البلد","الشمس","الليل","الضحي",
                "الشرح","التين","العلق","القدر","البينه","الزلزله","العاديات","القارعه",
                "التكاثر","العصر","الهمزه","الفيل","قريش",
        "الماعون","الكوثر","الكافرون","النصر","المسد","الاخلاص","الفلق","الناس","دعاء ختم القران"};

      //  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.item,data);
      //  list.setAdapter(arrayAdapter);
      /*  list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent go = new Intent(menu_one.this,menu_two.class);
                go.putExtra("data",position);
                startActivity(go);
            }
        });*/

  recyclerView = findViewById(R.id.rec);
        for(int i = 0;i<data.length;i++){

            idates.add(data[i]);
        }


        adapter1 = new Rec_adapter(idates,menu_one.this);

        linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(linearLayoutManager);




    }
}
