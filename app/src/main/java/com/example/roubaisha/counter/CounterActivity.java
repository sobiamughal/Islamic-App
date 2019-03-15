package com.example.roubaisha.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        btn=(Button) findViewById(R.id.btn);
        tv=(TextView) findViewById(R.id.tv);
        count=0;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tv.setText("Count is: "+count);
            }
        });
    }
}
