package com.example.honourproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;


public class tutorial extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        listView = findViewById(R.id.listview);

        String[] values = new String[]{
                "Basic Syntax", "Object & Class", "Basic Datatypes",
                "Basic Operator", "Numbers", "Loop Control"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), basicSyntax.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), objectClass.class);
                    startActivity(intent);
                }

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), basicDataTypes.class);
                    startActivity(intent);
                }

                if (position == 3){
                    Intent intent = new Intent(view.getContext(), basicOperator.class);
                    startActivity(intent);
                }

                if (position == 4){
                    Intent intent = new Intent(view.getContext(), numbers.class);
                    startActivity(intent);
                }

                if (position == 5){
                    Intent intent = new Intent(view.getContext(), loopControl.class);
                    startActivity(intent);
                }

            }
        });

    }

    public void getBack(View view){
        Intent intent = new Intent(this, Content.class);
        startActivity(intent);
    }
}
