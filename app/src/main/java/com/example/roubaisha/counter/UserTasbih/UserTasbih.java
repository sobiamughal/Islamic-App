package com.example.roubaisha.counter.UserTasbih;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roubaisha.counter.R;

import java.util.ArrayList;

public class UserTasbih extends Activity {

    Context ctx = UserTasbih.this;
    Button btAdd;
    ListView lv;
    ArrayList<Person> pArrayList;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_tasbih);

       // fab = findViewById(R.id.fab);

        btAdd = (Button) findViewById(R.id.btAdd);
        lv = (ListView) findViewById(R.id.lv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(ctx, UserTasbihDetailActivity.class);
                intent.putExtra("Key_Person", pArrayList.get(i));
                startActivity(intent);

            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ctx, ActPersonAdd.class);
                startActivity(intent);
            }
        });

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(UserTasbih.this);
                dialog.setContentView(R.layout.dialoge_layout);

                final EditText etName = dialog.findViewById(R.id.etName);
                Button btSubmit = (Button) findViewById(R.id.btSubmit);
                btSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Lister ls = new Lister(ctx);
                        ls.createAndOpenDB();
                        boolean mFlag = ls.executeNonQuery("insert into person (name) values " +
                                "(" +
                                "'"+etName.getText().toString() +"'"+
                                ")"
                        );

                        dialog.dismiss();
                        if(mFlag){
                            onBackPressed();
                            Toast.makeText(ctx, "Record inserted !", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(ctx, "Record not inserted !", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                dialog.show();
            }
        });*/

    }




    @Override
    protected void onResume() {
        super.onResume();

        Lister ls = new Lister(ctx);
        ls.createAndOpenDB();

        try {
            String[][] data = ls.executeReader("select *from person");
            ls.closeDB();

            //Toast.makeText(ctx, "Records: " + data.length, Toast.LENGTH_SHORT).show();

            pArrayList = new ArrayList<Person>();
            Person person;

            for (int i = 0 ; i <data.length; i++){

                person = new Person();

                person.id = Integer.parseInt(data[i][0]);
                person.name = data[i][1];

                pArrayList.add(person);
            }

            Adapter adt = new Adapter(ctx, pArrayList);
            lv.setAdapter(adt);

        } catch (Exception e) {
            Toast.makeText(ctx, "Exception", Toast.LENGTH_SHORT).show();
        }

    }

    public class Adapter extends BaseAdapter {

        Context ctx;
        ArrayList<Person> mArrayList;
        private LayoutInflater inflater = null;

        public Adapter(Context ctx, ArrayList<Person> mArrayList) {

            this.ctx = ctx;
            this.mArrayList = mArrayList;

            inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {

            return mArrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return 0;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View row, ViewGroup viewGroup) {

            ViewHolder holder;
            if (row == null) {
                holder = new ViewHolder();
                row = inflater.inflate(R.layout.item_list_view_person, null);

                holder.tvName = (TextView) row.findViewById(R.id.tvName);
                row.setTag(holder);
            } else {
                holder = (ViewHolder) row.getTag();
            }

            if (position % 2 == 0) {
                row.setBackgroundColor(Color.parseColor("#f1f1f1"));
            }
            holder.tvName.setText(mArrayList.get(position).name);
            return row;
        }
    }

    static class ViewHolder {
        TextView tvName;

    }
}



