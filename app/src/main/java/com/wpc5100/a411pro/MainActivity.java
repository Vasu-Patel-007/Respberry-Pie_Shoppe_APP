package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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