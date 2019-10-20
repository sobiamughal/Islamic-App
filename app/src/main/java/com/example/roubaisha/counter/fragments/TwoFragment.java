package com.example.roubaisha.counter.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.roubaisha.counter.R;
import com.example.roubaisha.counter.activity.Zuhar_sunnah;
import com.example.roubaisha.counter.activity.Zuharfard;
import com.example.roubaisha.counter.activity.Zuharnafil;
import com.example.roubaisha.counter.activity.Zuharsunnah;


public class TwoFragment extends Fragment {
    Activity context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
    public void onStart(){
        super.onStart();
        Button btds=(Button)context.findViewById(R.id.btnOpends);
        btds.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Zuharsunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpendf=(Button)context.findViewById(R.id.btnOpendf);
        btnOpendf.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Zuharfard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpendss=(Button)context.findViewById(R.id.btnOpendss);
        btnOpendss.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Zuhar_sunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpendn=(Button)context.findViewById(R.id.btnOpendn);
        btnOpendn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Zuharnafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }


}
