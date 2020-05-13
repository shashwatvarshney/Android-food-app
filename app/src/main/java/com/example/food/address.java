package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.rengwuxian.materialedittext.MaterialEditText;

public class address extends AppCompatActivity {
    EditText edtHouseNo,edtArea,edtCity,edtPincode;
    Button btnAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        edtHouseNo=(MaterialEditText) findViewById(R.id.edtHouseNo);
        edtArea=(MaterialEditText) findViewById(R.id.edtArea);
        edtCity=(MaterialEditText) findViewById(R.id.edtCity);
        edtPincode=(MaterialEditText) findViewById(R.id.edtPincode);

        btnAddress=(Button) findViewById(R.id.btnAddress);
    }
}
