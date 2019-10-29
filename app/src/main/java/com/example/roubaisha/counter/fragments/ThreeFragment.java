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
import com.example.roubaisha.counter.activity.Asrfard;
import com.example.roubaisha.counter.activity.Asrsunnah;


public class ThreeFragment extends Fragment {
    Activity context;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    public void onStart(){
        super.onStart();
        Button btas=(Button)context.findViewById(R.id.btnOpenas);
        btas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Asrsunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenaf=(Button)context.findViewById(R.id.btnOpenaf);
        btnOpenaf.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Asrfard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }



}
