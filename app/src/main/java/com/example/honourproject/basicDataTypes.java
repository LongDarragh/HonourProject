package com.example.honourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class basicDataTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_data_types);
    }

    public void getBack(View view){
        Intent intent = new Intent(this, tutorial.class);
        startActivity(intent);
    }
}