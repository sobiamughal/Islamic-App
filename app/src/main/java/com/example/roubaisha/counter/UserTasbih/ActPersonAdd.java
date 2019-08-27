package com.example.roubaisha.counter.UserTasbih;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roubaisha.counter.R;

public class ActPersonAdd extends Activity {

    Context ctx = ActPersonAdd.this;
    EditText etName;
    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_add);


        etName = (EditText) findViewById(R.id.etName);

        btSubmit = (Button) findViewById(R.id.btSubmit);


        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Lister ls = new Lister(ctx);
                ls.createAndOpenDB();
                boolean mFlag = ls.executeNonQuery("insert into person (name) values " +
                        "(" +
                        "'"+etName.getText().toString() +"'"+
                        ")"
                );

                if(mFlag){
                    onBackPressed();
                    Toast.makeText(ctx, "Record inserted !", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(ctx, "Record not inserted !", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
