package com.example.honourproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView point, question;

    private Question mQuestion = new Question();

    private String mAnswer;
    private int mPoint = 0;
    private int mQuestionLength = mQuestion.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        point = (TextView) findViewById(R.id.point);
        question = (TextView) findViewById(R.id.question);

        point.setText("Point: " + mPoint);


        updateQuestion(r.nextInt(mQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer){
                    mPoint++;
                    point.setText("Point " + mPoint);
                    updateQuestion((r.nextInt(mQuestionLength)));
                } else {
                    End();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mPoint++;
                    point.setText("Point " + mPoint);
                    updateQuestion((r.nextInt(mQuestionLength)));
                } else {
                    End();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mPoint++;
                    point.setText("Point " + mPoint);
                    updateQuestion((r.nextInt(mQuestionLength)));
                } else {
                    End();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer){
                    mPoint++;
                    point.setText("Point " + mPoint);
                    updateQuestion((r.nextInt(mQuestionLength)));
                } else {
                    End();
                }

            }
        });
    }

    private void updateQuestion(int num) {
        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoice1(num));
        answer2.setText(mQuestion.getChoice2(num));
        answer3.setText(mQuestion.getChoice3(num));
        answer4.setText(mQuestion.getChoice4(num));


        mAnswer = mQuestion.getCorrectAnswer(num);

    }


    private void End(){
        AlertDialog.Builder alterDialogBuilder = new AlertDialog.Builder(Quiz.this);
        alterDialogBuilder
                .setMessage("End! Your point is " + mPoint + " points.")
                .setCancelable(false)
                .setPositiveButton("New Quiz",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), Quiz.class));

                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), Content.class));
                            }
                        });
        AlertDialog alertDialog = alterDialogBuilder.create();
        alertDialog.show();
    }
}