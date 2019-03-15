package com.example.roubaisha.counter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {

    CompactCalendarView compactcalendar;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DDDD YYYY", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);


        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Calendar");

        compactcalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactcalendar.setUseThreeLetterAbbreviation(true);

        //for an event
        Event ev1 = new Event(Color.GREEN, 1551192067000L, "Meeting");
        compactcalendar.addEvent(ev1);


        compactcalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                if (dateClicked.toString().compareTo("tue feb [0:0:21 GMT] 2019")== 0){
                    Toast.makeText(context, "meeting", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context, "no event", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(simpleDateFormat.format(firstDayOfNewMonth));
            }
        });
    }
}
