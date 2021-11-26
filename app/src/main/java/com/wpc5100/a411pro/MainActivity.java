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

    TextView value;
    int count = 0;
    double newPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView p = (TextView) findViewById(R.id.NewP);
        TextView desc = (TextView) findViewById(R.id.item);
        ImageView image = (ImageView) findViewById(R.id.image);

        value = (TextView) findViewById(R.id.counter1); //Incrementer button

        //Breakfast menu
        Spinner breakfastSpinner = (Spinner) findViewById(R.id.breakfast_menu);

        ArrayAdapter<String> breakfastAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.breakfastNames));
        breakfastAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter((breakfastAdapter));

        double [] breakfast_price = {0.00,3.99,2.99,4.99,1.99,3.49,2.49}; // array for the breakfast's prices

        breakfastSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desc.setText(breakfastSpinner.getSelectedItem().toString());

                switch (i)
                {
                    // this switch statement will have different output depends on what user click on the spinner
                    // for ex. user click on waffles, then it will run case 1 and it will print the price of waffles and set the image of waffles.
                    case 0:
                        image.setImageResource(R.drawable.raspberry_pie_logo);
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
                                newPrice = price * count;
                            }

                        }
                        breakfast_price_text_view.setText("$"+ price);
                        p.setText("$" + newPrice);
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
                desc.setText(" ");
            }
        });




        //Coffee Menu
        Spinner coffeeSpinner = (Spinner) findViewById(R.id.coffee_menu);

        ArrayAdapter<String> coffeeAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.coffeeNames));
        coffeeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coffeeSpinner.setAdapter((coffeeAdapter));

        double [] coffee_price = {0.00,2.99,3.49,2.99,3.49,1.99,4.99}; // array for the coffee's prices

        coffeeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desc.setText(coffeeSpinner.getSelectedItem().toString());

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
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //Pastries Menu
        Spinner pastriesSpinner = (Spinner) findViewById(R.id.pastries_menu);

        ArrayAdapter<String> pastriesAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pastriesNames));
        pastriesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pastriesSpinner.setAdapter((pastriesAdapter));

        double [] pastries_price = {0.00,1.99,2.49,2.99,4.49,5.99}; // array for the pastries prices

        pastriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desc.setText(pastriesSpinner.getSelectedItem().toString());

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
        //Go to checkout
        Button checkoutBtn = (Button) findViewById(R.id.checkout);
        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, activity_payment.class));
                //int state = breakfastSpinner.getMeasuredState();
                //Toast.makeText(getApplicationContext(),state,Toast.LENGTH_SHORT);
            }
        });

    }

    
    public int increment(View v)
    {
        count++;
        value.setText("" + count);
        newPrice = newPrice * count;
        return count;
    }
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
}