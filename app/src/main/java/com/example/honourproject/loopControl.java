package com.example.honourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class loopControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_control);
    }


    public void getForLoop(View view) {
        Intent intent = new Intent(this, for_loop.class);
        startActivity(intent);
    }

    public void getWhileLoop(View view){
        Intent intent = new Intent(this, while_loop.class);
        startActivity(intent);
    }

    public void getDoWhile(View view) {
        Intent intent = new Intent(this, doWhile.class);
        startActivity(intent);
    }

    public void getBack(View view){
        Intent intent = new Intent(this, tutorial.class);
        startActivity(intent);
    }
}