package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Breakfast menu
        Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);

        ArrayAdapter<String> breakfastAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.breakfastNames));
        breakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter((breakfastAdapter));

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