package com.example.roubaisha.counter.UserTasbih;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roubaisha.counter.R;

public class ActPersonDetails extends Activity {

    Context ctx = ActPersonDetails.this;
    Person person;
    TextView tvName;

    Button btEdit, btDelete, btSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_details);

        tvName = (TextView) findViewById(R.id.tvName);

        btEdit = (Button) findViewById(R.id.btEdit);
        btDelete = (Button) findViewById(R.id.btDelete);
        btSubmit = (Button) findViewById(R.id.btSubmit);

        try{
            person = (Person) getIntent().getExtras().getSerializable("Key_Person");

            tvName.setText(person.name);

        }catch (Exception e){
            Toast.makeText(ctx, "Data Not Found ", Toast.LENGTH_SHORT).show();
        }

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Lister ls = new Lister(ctx);
                ls.createAndOpenDB();

                boolean mFlag = ls.executeNonQuery("delete from person where id = "+person.id);

                if(mFlag){

                    onBackPressed();
                    Toast.makeText(ctx, "Delete Successfully !", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ctx, "Record not deleted !", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ctx, ActPersonEdit.class);
                intent.putExtra("Key_Person", person);
                startActivity(intent);
                finish();
            }
        });


    }

}
