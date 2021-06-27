package com.example.honourproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_page);

    }

    public void getTutorial(View view){

        Intent intent = new Intent(this, tutorial.class);
        startActivity(intent);
    }

    public void getExercise(View view){

        Intent intent = new Intent(this, test.class);
        startActivity(intent);
    }

    public void getSetting(View view){

        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }

    public void getQuiz(View view){

        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }

    public void getInfor(View view){

        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }


}
