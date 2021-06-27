package com.example.honourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class basicOperator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_operator);
    }

    public void getBack(View view){
        Intent intent = new Intent(this, tutorial.class);
        startActivity(intent);
    }
}