package com.example.roubaisha.counter.Names;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.roubaisha.counter.Qibla.QiblaActivity;
import com.example.roubaisha.counter.R;

public class NamesOptionActivity extends AppCompatActivity {

    private CardView allah_name;
    private CardView muhammad_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names_option);

        getSupportActionBar().setTitle("Names");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        allah_name=(CardView)findViewById(R.id.allah_name);
        allah_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllahNameActivity();
            }
        });

        muhammad_name=(CardView)findViewById(R.id.muhammad_name);
        muhammad_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMuhammadNameActivity();
            }
        });
    }

    private void openMuhammadNameActivity() {
        Intent intent = new Intent(this, MuhammadNamesActivity.class);
        startActivity(intent);
    }

    private void openAllahNameActivity() {
        Intent intent = new Intent(this, AllahNamesActivity.class);
        startActivity(intent);
    }
}
