package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.food.Databse.Order;

import java.util.List;

public class orderdetails extends AppCompatActivity {
    TextView foodView,priceView,textView;
SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);

        foodView=(TextView) findViewById(R.id.food);

        priceView=(TextView) findViewById(R.id.price);
        List<Order> o=MainActivity.useData.myDao().getOrders(123l);
        String name="";
        Double price=0.0;
        for(Order order:o){
         name+=order.getItemName();
         price+=order.getPrice();
        }
        foodView.setText(name);
//        priceView.setText(price);

//        textView=(TextView) findViewById(R.id.priceView);

    }
}
