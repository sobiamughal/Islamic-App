package com.example.roubaisha.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TasbihOption extends AppCompatActivity implements View.OnClickListener {

    private CardView tasbih, usertasbih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih_option);

        tasbih = (CardView) findViewById(R.id.tasbih);
        usertasbih = (CardView) findViewById(R.id.usertasbih);

        tasbih.setOnClickListener(this);
        usertasbih.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tasbih:
                Intent i = new Intent(TasbihOption.this,TasbihActivity.class); startActivity(i);
            case R.id.usertasbih:
                Intent in = new Intent(TasbihOption.this,MainActivity.class); startActivity(in);
            default:break;
        }
    }
}
