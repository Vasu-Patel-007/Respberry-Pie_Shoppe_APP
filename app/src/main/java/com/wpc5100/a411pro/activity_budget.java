package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_budget extends AppCompatActivity {

    //Global variables
    EditText enterBudget;
    TextView budgetOutput;
    String budget;
    double budgetFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        //Link to budget button
        Button getBudget = (Button) findViewById(R.id.budget_btn);

        //Views for input and output
        enterBudget = (EditText) findViewById(R.id.enter_budget);
        budgetOutput = (TextView) findViewById(R.id.budget_items);

        //List of menu items
        String items[] = {
                "Waffle", "Toast", "Pancake", "Muffin", "Bagel", "Croissant" , "Frappe", "Cappuccino", "Latte",
                "Espresso", "Doppio", "Arabica", "Raspberry Pie", "Cannoli", "Strudel", "Bear Claw"
        };

        //List of menu prices
        double [] prices = {3.99,2.99,4.99,1.99,3.49,2.49,2.99,3.49,2.99,3.49,1.99,4.99,1.99,2.49,2.99,4.49,5.99};

        //Budget button onclick listener
        getBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Convert input to double
                budgetFinal = Double.parseDouble(enterBudget.getText().toString()); //Problem child
                if (!enterBudget.getText().toString().isEmpty()) {
                    //Loop through items and output items that are less than or equal to entered budget
                    for (int i = 0; i < items.length; i++) {
                        if (prices[i] <= budgetFinal) {
                            budgetOutput.append(items[i] + " ");
                        }
                    }
                }
                else {
                    //Do nothing
                }
            }
        });
    }
}