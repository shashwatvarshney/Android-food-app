package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.food.Databse.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.List;

import Model.User;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    EditText edtPhone,edtPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtPassword = (MaterialEditText) findViewById(R.id.edtPassword);
        edtPhone = (MaterialEditText) findViewById(R.id.edtPhone);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,FoodOrder.class));
//        String pass=edtPassword.getText().toString();
//        Long phone=12345678987654321L;
//        if(edtPhone.getText().toString().length()!=0){
//            phone=Long.parseLong(edtPhone.getText().toString());
//        }
//        if(pass.length()==0 ||phone==12345678987654321L){
//            Toast.makeText(this,"enter all details",Toast.LENGTH_SHORT).show();
//        }else{
//            List<Users> user=MainActivity.useData.myDao().getUser(phone);
//            String upass="";
//            Long uphone=12345678987654321L;
//
//            for(Users u:user){
//                upass=u.getPassword();
//                uphone=u.getPhoneNumber();
//            }
//            if(upass.equals(pass) && uphone.equals(phone)){
//                Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(this,FoodOrder.class));
//            }else
//
//
//            Toast.makeText(this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
//        }


    }
}
