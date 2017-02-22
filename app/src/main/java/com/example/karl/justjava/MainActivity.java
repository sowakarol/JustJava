package com.example.karl.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void submitOrder(View view) {
        int price = calculatePrice(5);
        //String message = "Total: $" + price + "\n" + "Danke!";
        displayMessage(createOrderSummary(price));
    }

    private String createOrderSummary(int price){
        return "Name: Kaptain Kunal" + "\nQuantity: " + quantity + "\nTotal: " + price + "\nThank you!";
    }


    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }


    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private int calculatePrice(int price){
        return quantity * price;
    }
    public void decrement(View view) {
        quantity--;
        displayQuantity(quantity);
    }

    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }
}
