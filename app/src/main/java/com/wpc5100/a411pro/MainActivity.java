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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //Global variables
    TextView value;
    TextView value2;
    TextView value3;
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    double newPrice;
    double total1;
    double total2;
    double total3;
    TextView individual_price1;
    TextView individual_price2;
    TextView individual_price3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Views for image and item name
        TextView p = (TextView) findViewById(R.id.NewP);
        ImageView image = (ImageView) findViewById(R.id.image);

        //Values for incrementer button
        value = (TextView) findViewById(R.id.counter1); //Incrementer button
        value2 = (TextView) findViewById(R.id.counter2);
        value3 = (TextView) findViewById(R.id.counter3);

        //Buttons for incrementing quantity
        Button plus1 = (Button) findViewById(R.id.plus1);
        Button plus2 = (Button) findViewById(R.id.plus2);
        Button plus3 = (Button) findViewById(R.id.plus3);

        //Buttons for decrementing quantity
        Button minus1 = (Button) findViewById(R.id.minus1);
        Button minus2 = (Button) findViewById(R.id.minus2);
        Button minus3 = (Button) findViewById(R.id.minus3);

        //Button to calculate order total
        Button total_button = (Button) findViewById(R.id.total);

        //Text for prices of items from each category
        individual_price1 = (TextView) findViewById(R.id.price_for_1);
        individual_price2 = (TextView) findViewById(R.id.price_for_2);
        individual_price3 = (TextView) findViewById(R.id.price_for_3);

        //Breakfast menu spinner
        Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);

        //Breakfast spinner adapter
        ArrayAdapter<String> breakfastAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.breakfastNames));
        breakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter((breakfastAdapter));

        //Array for breakfast prices
        double [] breakfast_price = {0.00,3.99,2.99,4.99,1.99,3.49,2.49}; // array for the breakfast's prices
        p.setText("$0");
        breakfastSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //desc.setText(breakfastSpinner.getSelectedItem().toString());

                //Loop through all breakfasts in a switch
                switch (i)
                {
                    // this switch statement will have different output depends on what user click on the spinner
                    // for ex. user click on waffles, then it will run case 1 and it will print the price of waffles and set the image of waffles.
                    case 0:
                        //Dsiplay image of first item
                        image.setImageResource(R.drawable.raspberry_pie_logo);
                        int item_price_finder = i;
                        double price = 0;
                        //Set individual item price
                        TextView breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<breakfast_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(breakfast_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);
                        //REPEAT ABOVE COMMENTS FOR EACH CASE
                        break;
                    case 1:
                        image.setImageResource(R.drawable.waffles);
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

                        double finalPrice = price;
                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });


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
                        breakfast_price_text_view.setText("  $"+ price);
                        finalPrice = price;

                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

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

                        finalPrice = price;

                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

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

                        finalPrice = price;

                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

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

                        finalPrice = price;

                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

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

                        finalPrice = price;

                        plus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        minus1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement(v);
                                newPrice = finalPrice * count;
                                individual_price1.setText("  $" + newPrice);
                                total1 = newPrice;
                            }
                        });

                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //Do nothing
            }
        });




        //Coffee Menu spinner. Same logic as breakfast stuff above
        Spinner coffeeSpinner = (Spinner) findViewById(R.id.coffee_menu);

        ArrayAdapter<String> coffeeAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.coffeeNames));
        coffeeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coffeeSpinner.setAdapter((coffeeAdapter));

        double [] coffee_price = {0.00,2.99,3.49,2.99,3.49,1.99,4.99}; // array for the coffee's prices

        coffeeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //desc.setText(coffeeSpinner.getSelectedItem().toString());

                switch (i)
                {
                    // this switch statement will have different output depends on what user click on the spinner
                    // for ex. user click on frappe, then it will run case 1 and it will print the price of frappe and set the image of frappe.
                    case 0:
                        image.setImageResource(R.drawable.raspberry_pie_logo);
                        int item_price_finder = i;
                        double price = 0;
                        TextView breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.frappe);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);
                        double finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });
                        break;
                    case 2:
                        image.setImageResource(R.drawable.cappuccino);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        break;
                    case 3:
                        image.setImageResource(R.drawable.latte);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        break;
                    case 4:
                        image.setImageResource(R.drawable.espresso);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        break;
                    case 5:
                        image.setImageResource(R.drawable.doppio);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        break;
                    case 6:
                        image.setImageResource(R.drawable.arabica);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<coffee_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(coffee_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        minus2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement2(v);
                                newPrice = finalPrice * count2;
                                individual_price2.setText("  $" + newPrice);
                                total2 = newPrice;
                            }
                        });

                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Pastries Menu. Same logic as categories above
        Spinner pastriesSpinner = (Spinner) findViewById(R.id.pastries_menu);

        ArrayAdapter<String> pastriesAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pastriesNames));
        pastriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pastriesSpinner.setAdapter((pastriesAdapter));

        double [] pastries_price = {0.00,1.99,2.49,2.99,4.49,5.99}; // array for the pastries prices

        pastriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //desc.setText(pastriesSpinner.getSelectedItem().toString());

                switch (i)
                {
                    // this switch statement will have different output depends on what user click on the spinner
                    // for ex. user click on raspberry pie, then it will run case 1 and it will print the price of raspberry pie and set the image of raspberry pie.
                    case 0:
                        image.setImageResource(R.drawable.raspberry_pie_logo);
                        int item_price_finder = i;
                        double price = 0;
                        TextView breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.raspberrypie);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }

                        breakfast_price_text_view.setText("$"+ price);

                        double finalPrice = price;

                        plus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        minus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        break;
                    case 2:
                        image.setImageResource(R.drawable.danish);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        minus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        break;
                    case 3:
                        image.setImageResource(R.drawable.strudel);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        minus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        break;
                    case 4:
                        image.setImageResource(R.drawable.cannoli);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        minus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        break;
                    case 5:
                        image.setImageResource(R.drawable.bearclaw);
                        item_price_finder = i;
                        price = 0;
                        breakfast_price_text_view = (TextView) findViewById(R.id.breakfast_price);
                        for(int n= 0; n<pastries_price.length;n++)
                        {
                            if(n==i)
                            {
                                price = (double) Array.get(pastries_price,i);
                            }
                        }
                        breakfast_price_text_view.setText("$"+ price);

                        finalPrice = price;

                        plus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                increment3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        minus3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                decrement3(v);
                                newPrice = finalPrice * count3;
                                individual_price3.setText("  $" + newPrice);
                                total3 = newPrice;
                            }
                        });

                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        //Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);
        //breakfastSpinner.setAdapter((breakfastAdapter));
        //Button getItems = findViewById(R.id.minus1);


        //Go to checkout page
        Button checkoutBtn = (Button) findViewById(R.id.checkout);
        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Load checkout activity
                startActivity(new Intent(MainActivity.this, activity_payment.class));
            }
        });

        //Go to budget page
        Button budgetBtn = (Button) findViewById(R.id.budget);
        budgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Load budget activity
                startActivity(new Intent(MainActivity.this, activity_budget.class));
            }
        });

        //Listener for calculating total
        total_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setText("$"+(total1+total2+total3));
            }
        });

    }


    //Increment method
    public int increment(View v)
    {
        count++;
        value.setText("" + count);
        newPrice = newPrice * count;
        return count;
    }
    //Decrement method
    public int decrement(View v)
    {
        if(count <= 0)
        {
            count = 0;
        }
        else
        {
            count--;
            value.setText("" + count);
        }
        return count;
    }


    public int increment2(View v)
    {
        count2++;
        value2.setText("" + count2);
        newPrice = newPrice * count2;
        return count2;
    }

    public int decrement2(View v)
    {
        if(count2 <= 0)
        {
            count2 = 0;
        }
        else
        {
            count2--;
            value2.setText("" + count2);
        }
        return count2;
    }

    public int increment3(View v)
    {
        count3++;
        value3.setText("" + count3);
        newPrice = newPrice * count3;
        return count3;
    }

    public int decrement3(View v)
    {
        if(count3 <= 0)
        {
            count3 = 0;
        }
        else
        {
            count3--;
            value3.setText("" + count3);
        }
        return count3;
    }
}