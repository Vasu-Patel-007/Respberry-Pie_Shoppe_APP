package com.wpc5100.a411pro;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;


public class activity_payment extends AppCompatActivity {
    //Global variables
    Button selectDate;
    TextView date;
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayofMonth;
    Calendar calendar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_payment);

        //Get date from activity
        selectDate = findViewById(R.id.btnDate);
        date = findViewById(R.id.selected_date);

        selectDate.setOnClickListener((view) -> {
            //Set calender details
            calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            dayofMonth = calendar.get(Calendar.DAY_OF_MONTH);
            datePickerDialog = new DatePickerDialog(activity_payment.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                            //Set date text based on chosen date
                            date.setText((month +1) + "/" + year);
                        }
                    }, year, month, dayofMonth);
            //Display the date
            datePickerDialog.show();
        });
    }
}