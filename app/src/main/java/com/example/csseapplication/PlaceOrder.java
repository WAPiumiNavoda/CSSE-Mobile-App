package com.example.csseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class PlaceOrder extends AppCompatActivity {

    Button BacktoHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);

        BacktoHomeButton =  findViewById(R.id.BacktoHomeButton);

        BacktoHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlaceOrder.this, ListView.class));
            }
        });
    }
}