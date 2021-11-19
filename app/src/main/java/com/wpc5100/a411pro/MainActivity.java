package com.wpc5100.a411pro;

import androidx.activity.result.contract.ActivityResultContracts;
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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView desc = (TextView) findViewById(R.id.item);
        ImageView image = (ImageView) findViewById(R.id.image);

        //Breakfast menu
        Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);

        ArrayAdapter<String> breakfastAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.breakfastNames));
        breakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter((breakfastAdapter));

        double [] breakfast_price = {0,3.05,2.50,4.13,1.00,3.40,2.45}; // array for the breakfast's prices

        breakfastSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desc.setText(breakfastSpinner.getSelectedItem().toString());

                switch (i)
                {
                    // this switch statement will have different output depends on what user click on the spinner
                    // for ex. user click on waffles, then it will run case 1 and it will print the price of waffles and set the image of waffles.
                    case 1:
                        image.setImageResource(R.drawable.waffles);
                        int item_price_finder = i;
                        double price = 0;
                        TextView breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.frenchtoast);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.pancake);
                         item_price_finder = i;
                         price = 0;
                         breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.muffin);
                         item_price_finder = i;
                         price = 0;
                         breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 5:
                         image.setImageResource(R.drawable.bagel);
                         item_price_finder = i;
                         price = 0;
                         breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 6:
                         image.setImageResource(R.drawable.croissant);
                         item_price_finder = i;
                         price = 0;
                         breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);
                        break;

                }
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






        //Go to checkout
        Button checkoutBtn = (Button) findViewById(R.id.checkout);
        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activity_payment.class));
            }
        });


    }
}