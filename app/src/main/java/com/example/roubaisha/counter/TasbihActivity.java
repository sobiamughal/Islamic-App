package com.example.roubaisha.counter;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasbihActivity extends AppCompatActivity  {
    ListView listView;
    FloatingActionButton fab;

    String[] tasbihNames = {"SubhanAllah","Alhamdulilah","Astaghfirullah","Allah u Akbar","SubhanAllahi wa biHamdihi","La ilaha illa-llah"};
    int[] tasbihImages = {R.drawable.subhanallah,R.drawable.alhamdullillah,R.drawable.astagfirullah,R.drawable.allah_hu_akbar,R.drawable.subhanallah_wa_bihamdihi,R.drawable.la_ilaha_illa_llah};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        getSupportActionBar().setTitle("Tasbih Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //finding listview
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),tasbihNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),GalleryActivity.class);
                intent.putExtra("name",tasbihNames[i]);
                intent.putExtra("image",tasbihImages[i]);
                startActivity(intent);

            }
        });


    }

    public void openAlert(View view) {

        final TextView name = view.findViewById(R.id.fruits);
        final AlertDialog.Builder alert = new AlertDialog.Builder(TasbihActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.layout_dialog,null);

        final EditText add_tasbih = mView.findViewById(R.id.add_tasbih);
        Button btn_cancel = mView.findViewById(R.id.btn_cancel);
        Button btn_add = mView.findViewById(R.id.btn_add);

        alert.setView(mView);

        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ListElementsArrayList.add(add_tasbih.getText().toString());
                //customAdapter.notifyDataSetChanged();
            }
        });
        alertDialog.show();
    }

    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return tasbihImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.layout_listitem,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(tasbihNames[i]);
            image.setImageResource(tasbihImages[i]);
            return view1;



        }
    }
}
