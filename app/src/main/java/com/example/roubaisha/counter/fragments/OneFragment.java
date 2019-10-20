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
import com.example.roubaisha.counter.activity.Fajarfard;
import com.example.roubaisha.counter.activity.Fajrsunnah;


public class OneFragment extends Fragment {
    Activity context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    public void onStart(){
        super.onStart();
        Button btfs=(Button)context.findViewById(R.id.btnOpenfs);
        btfs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Fajrsunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenff=(Button)context.findViewById(R.id.btnOpenff);
        btnOpenff.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Fajarfard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }



}
