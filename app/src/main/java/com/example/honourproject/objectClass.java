package com.example.honourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class objectClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_class);
    }

    public void getBack(View view){
        Intent intent = new Intent(this, Content.class);
        startActivity(intent);
    }
}