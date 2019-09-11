package com.example.roubaisha.counter.duaen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.roubaisha.counter.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MusnoonActivity extends AppCompatActivity
{
    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "Dua before meals", "Dua after meals ", "Dua before sleeping", "Dua when wake up from sleep",
            "Dua when enter the home ", "Dua when leave the home", "Dua when enter the mosque", "Dua when leave the mosque",
            "Dua for traveling ","Dua when entering the market","Dua when meeting another muslim","Dua upon sneezing",
            "Dua when hearing someone sneeze","Dua when facing trouble ","Dua for relief from all hardships","Dua at the time of dressing",
            "Dua when visiting the sick","Dua before wudhu ", "Dua while performing wudhu ", "Dua before entering toilet",
            "Dua after leaving toilet ", "Dua when you become angry ", "Dua at the time Of seeing a muslim smiling ","Dua when sighting the moon ",
            "Dua when you see someone in trouble","Dua after drinking milk","Dua when dining at someone's house", "Dua when you forget to say bismillah before meal","Dua after fajr & maghrib prayer",
            "Dua when fearing the enemy","Dua wearing a new amaamah ","Dua when entering the graveyard ","Dua at the time of lowering a dead body into a grave ",
            "Dua  for shab e qadr  ","Dua when sighting the new moon ","Dua for bride & groom after nikah","Dua for sehri ",
            "Dua for iftar","Dua when looking in the mirror","Dua for animal suffering through evil eye (nazar)",
            "Dua when drinking zam zam water",





    };


    int[] listviewImage = new int[]{
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo, R.drawable.dualogo,
            R.drawable.dualogo,




    };

    String[] listviewShortDescription = new String[]{
            "کھانے سے پہلے کی دعا", "کھانے کے بعد کی دعا", "سوتے وقت کی دعا", "نیند سے بیدار ہونے کی دعا",
            "گھر میں داخل ہوتے وقت کی دعا", "گھر سے نکلتے وقت کی دعا", "مسجد میں داخل ہونے کی دعا", "مسجد سے نکلنے کی دعا",
            "سفر اور سواری کی دعا","بازار میں داخل ہوتے وقت کی دعا","ملاقات کے وقت کی دعا", "چھینک آنے کے وقت کی دعا",
            "چھینک آنے پر الحمد للہ کہنے والے کے لئے دعا", "مصیبت و پریشانی کے وقت کی دعا", "مصیبت کے وقت ورد کرنا","لباس پہنتے وقت کی دعا",
            "عیادت کرتے وقت کی دعا", "وضو سے پہلے کی دعا", "وضو کے درمیان پڑھنے کی دعا", "بیت الخلاء میں داخل ہونے سے پہلے کی دعا",
            "بیت الخلاء سے باہر آنے کے بعد کی دعا", "غصہ آنے کے وقت کی دعا","کسی مسلمان کو ہنستا دیکھ کر پڑھنے کی دعا","جب بھی چاند پر نظر پڑھے کی دعا",
            "مصیبت ذدہ کو دیکھتے وقت کی دعا","دودھ پینے کے بعد کی دعا", "دعوت کھانے کے بعد کی دعا",
            "کھانا کھانے سے قبل اگر بسم اللہ پڑھنا بھول جائیں تو یہ دعا پڑھیں",
            " نماز فجر اور مغرب کے بعد کی دعا",
            "کسی قوم سے خطرے کی دعا","نیا عمامہ یا نئی چادر پہنتے وقت کی دعا"," قبرستان میں داخل ہوتے وقت کی دعا", " میت کو قبر میں رکھتے وقت کی دعا" ,
            "شبِ قدر کی دعا","نیا چاند دیکھتے وقت کی دعا","نکاح کے بعد دولہا اور دلہن کے لئے دعا","روزہ رکھنے کی نیت",
            " روزہ افطار کرنے کے بعد کی دعا","آئنہ دیکھتے وقت کی دعا"," جانور کو نزر لگ جانے پر پڑھنے کی دعا" ,
            "آب زم زم پیتے وقت کی دعا",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        getSupportActionBar().setTitle("Masnoon Duain");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 41; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.activity_musnoon, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity4.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity5.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity6.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity7.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity8.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity9.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity10.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity11.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity12.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity13.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 13) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity14.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity15.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 15) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity16.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 16) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity17.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity18.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 18) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity19.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 19) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity20.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity21.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 21) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity22.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 22) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity23.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 23) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity24.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity25.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 25) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity26.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 26) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity27.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity28.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 28) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity29.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 29) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity30.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity31.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 31) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity32.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 32) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity33.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 33) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity34.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity35.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 35) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity36.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 36) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity37.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity38.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 38) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity39.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 39) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity40.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity41.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });

    }
}