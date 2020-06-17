package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class Adapter_Recycler_oll_note extends RecyclerView.Adapter<Adapter_Recycler_oll_note.ViewHolder> {
        List<Model_room> list;
        Context context;
Model_room modelRoom;
onclickeitem onclickeitem;

    public void setOnclickeitem(onclickeitem onclickeitem) {
        this.onclickeitem = onclickeitem;
    }

    public Adapter_Recycler_oll_note(List<Model_room> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (LayoutInflater.from(parent.getContext())).inflate(R.layout.item_recycler_oll_note,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Model_room item = list.get(position);
        holder.text_one.setText((item.getSabjact()));
        holder.texttwo.setText((item.getNote()));
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oll = new Intent(context,mozikara.class);
               context. startActivity(oll);
                ((Activity)context).finish();

            }
        });
        if (onclickeitem!=null){
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclickeitem.onclicke(position,item);



            }
        });}


    }
        public void setData(List<Model_room>data){

            this.list=data;
            notifyDataSetChanged();

        }


        @Override
        public int getItemCount() {
        if (list==null){return 0;}
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView text_one;
            TextView texttwo;
            Button add;
            Button delete;
            View perantview;

            ViewHolder(View view) {
                super(view);
                texttwo= view.findViewById(R.id.textView6);
                text_one = view.findViewById(R.id.textView5);
                add = view.findViewById(R.id.add);
                delete = view.findViewById(R.id.delete);
                perantview = view;
            }
        }








public interface onclickeitem{
        void onclicke(int pos,Model_room room);






}













}
