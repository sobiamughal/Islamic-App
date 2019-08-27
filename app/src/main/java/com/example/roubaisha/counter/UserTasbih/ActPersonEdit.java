package com.example.roubaisha.counter.UserTasbih;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roubaisha.counter.R;

public class ActPersonEdit extends Activity {

    Context ctx = ActPersonEdit.this;
    Person person;
    EditText etName;

    Button btCancel, btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_edit);


        etName = (EditText) findViewById(R.id.etName);

        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);


        try{
            person = (Person) getIntent().getExtras().getSerializable("Key_Person");

            etName.setText(person.name);


        }catch (Exception e){

            Toast.makeText(ctx, "Data Not Found ", Toast.LENGTH_SHORT).show();
        }

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Lister ls = new Lister(ctx);
                ls.createAndOpenDB();
                boolean mFlag = ls.executeNonQuery("update person set " +
                                " name = '" + etName.getText().toString() + "' ," +
                                " where id =  " + person.id
                );

                if (mFlag) {
                    onBackPressed();
                    Toast.makeText(ctx, "Record Updated !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ctx, "Record not updated !", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

}
