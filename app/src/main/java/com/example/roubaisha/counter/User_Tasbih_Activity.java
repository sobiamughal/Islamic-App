package com.example.roubaisha.counter;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class User_Tasbih_Activity extends AppCompatActivity implements CustomAdapter.OnClickListener {

    private static final String TAG = "MainActivity";
    String name;
    FloatingActionButton fab;
    ArrayList<LvItem> arrayList = new ArrayList<>();
    private RecyclerView mrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__tasbih_);
        mrecyclerview = (RecyclerView) findViewById(R.id.recyclerView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), arrayList, this);
        mrecyclerview.setLayoutManager(new LinearLayoutManager(getApplication()));
        mrecyclerview.setAdapter(customAdapter);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(User_Tasbih_Activity.this);
                dialog.setContentView(R.layout.fabitem);

                final EditText etname = dialog.findViewById(R.id.etname);

                Button btnsave = dialog.findViewById(R.id.btnsave);
                btnsave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        name = etname.getText().toString();

                        LvItem lvItem = new LvItem();
                        lvItem.setName(name);
                        arrayList.add(lvItem);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }

    @Override
    public void onItemClick(int poistion) {
        Log.d(TAG, "onItemClick: "+poistion);

        Intent intent = new Intent(getApplicationContext(),GalleryActivity.class);
        intent.putExtra("name",arrayList.get(poistion));
        startActivity(intent);
    }
}

