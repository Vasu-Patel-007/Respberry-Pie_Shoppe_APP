package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class activity_payment extends AppCompatActivity {
    // date_button
    Button select_date;
    TextView date;
    DatePickerDialog date_picker_screen;
    int year;
    int month;
    int day_of_month;
    Calendar calendar;

    //    // code for date_picking_button_starts here
//    select_date = findViewById(R.id.btndate);
//    date = findViewById(R.id.selected_date);
//
//            select_date.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            calendar = Calendar.getInstance();
//            year = calendar.get(Calendar.YEAR);
//            month = calendar.get(Calendar.MONTH);
//            day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
//            date_picker_screen = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
//                @Override
//                public void onDateSet(DatePicker datePicker, int year, int month, int day) {
//                    date.setText(month + "/" + year);
//
//                }
//            }, 0,0,0);
//            date_picker_screen.show();
//        }
//    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        select_date = findViewById(R.id.btndate);
        date = findViewById(R.id.selected_date);

        select_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day_of_month = calendar.get(Calendar.DAY_OF_MONTH);

                date_picker_screen = new DatePickerDialog(activity_payment.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                //datePicker.setText(dayOfMonth + "/" + month + "/" + year);
                            }
                        }, year, month, day_of_month);
                date_picker_screen.show();
            }
        });

    }
}