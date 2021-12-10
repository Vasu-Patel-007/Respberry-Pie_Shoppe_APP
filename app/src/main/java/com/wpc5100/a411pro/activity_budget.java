package com.wpc5100.a411pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_budget extends AppCompatActivity {

    EditText enterBudget;
    TextView budgetOutput;
    String budget;
    double budgetFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        Button getBudget = (Button) findViewById(R.id.budget_btn);


        enterBudget = (EditText) findViewById(R.id.enter_budget);
        //budget = enterBudget.getText().toString();

        budgetOutput = (TextView) findViewById(R.id.budget_items);

        String breakfasts[] = {
                "Waffle", "Toast", "Pancake", "Muffin", "Bagel", "Croissant"
        };

        double [] breakfast_price = {3.99,2.99,4.99,1.99,3.49,2.49};

        getBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                budgetFinal = Double.parseDouble(enterBudget.getText().toString()); //Problem child
                if (!enterBudget.getText().toString().isEmpty()) {
                    for (int i = 0; i < breakfasts.length; i++) {
                        if (breakfast_price[i] <= budgetFinal) {
                            budgetOutput.append(breakfasts[i] + " ");
                        }
                    }
                }
                else {

                }
            }
        });
    }
}