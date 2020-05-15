package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food.Databse.Order;
import com.example.food.Databse.userAddress;

import java.util.List;


public class orderdetails extends AppCompatActivity implements View.OnClickListener {
    TextView foodView,priceView,textView,viewAddress;
SharedPreferences sp;
Button add,order;
boolean hasAddress=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);

        add=(Button)findViewById(R.id.address);
        add.setOnClickListener(this);
        order=findViewById(R.id.order);
        order.setOnClickListener(this);
        viewAddress=findViewById(R.id.viewAddress);
        foodView=(TextView) findViewById(R.id.food);
        sp=getSharedPreferences("User",0);
        Long phone=sp.getLong("Phone",0);
        priceView=(TextView) findViewById(R.id.price);
        List<Order> o=MainActivity.useData.myDao().getOrders(phone);
        String name="";
        Double price=0.0;
        for(Order order:o){
         name=name+"\n"+order.getItemName();
         price+=order.getPrice();
        }
        foodView.setText(name);
        priceView.setText(price+"");
        hasAddress=MainActivity.useData.myDao().hasAddress(phone);
        if(hasAddress){
            List<userAddress> ad=MainActivity.useData.myDao().getAddress(phone);
            String area="";
            String city="";
            String house="";
            int pin=0;
            for(userAddress address: ad){
                area+=address.getArea();
                city+=address.getCity();
                house=address.getPhone().toString();
                pin=address.getPinCode();
            }
            viewAddress.setText("Address is\n"+"#"+house+","+area+","+city+","+pin);
            add.setText(" Change Address");
        }



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.address:
                if(hasAddress){
                    Intent i=new Intent(this,ChangeAddress.class);
                    startActivity(i);
                }else{
                    Intent i=new Intent(this,address.class);
                    startActivity(i);
                }
                break;
            case R.id.order:
                Toast.makeText(this,"Ordered successfuly",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,FoodOrder.class));
        }


    }
}
