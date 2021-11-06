package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // date_button
    Button select_date;
    TextView date;
    DatePickerDialog date_picker_screen;
    int year;
    int month;
    int day_of_month;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView desc = (TextView) findViewById(R.id.item);
        ImageView amoogus1 = (ImageView) findViewById(R.id.amoogusImg);

        //Breakfast menu
        Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);

        ArrayAdapter<String> breakfastAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.breakfastNames));
        breakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter((breakfastAdapter));

        breakfastSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desc.setText(breakfastSpinner.getSelectedItem().toString());
                amoogus1.setImageResource(R.drawable.amoogus);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }



        });
                    // code for date_picking_button_starts here
            select_date = findViewById(R.id.btndate);
            date = findViewById(R.id.selected_date);

            select_date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    calendar = Calendar.getInstance();
                    year = calendar.get(Calendar.YEAR);
                    month = calendar.get(Calendar.MONTH);
                    day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
                    date_picker_screen = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                            date.setText(month + "/" + year);

                        }
                    }, 0,0,0);
                    date_picker_screen.show();
                }
            });

        //Coffee Menu
        Spinner coffeeSpinner = (Spinner) findViewById(R.id.coffee_menu);

        ArrayAdapter<String> coffeeAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.coffeeNames));
        coffeeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coffeeSpinner.setAdapter((coffeeAdapter));

        //Pastries Menu
        Spinner pastriesSpinner = (Spinner) findViewById(R.id.pastries_menu);

        ArrayAdapter<String> pastriesAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pastriesNames));
        pastriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pastriesSpinner.setAdapter((pastriesAdapter));


    }
}