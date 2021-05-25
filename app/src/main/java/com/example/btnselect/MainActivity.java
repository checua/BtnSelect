package com.example.btnselect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int n1 = (int) (Math.random()*100);
                if (n1 >= 50) {
                    Toast.makeText(getApplicationContext(), "Acertaste", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Fallaste", Toast.LENGTH_SHORT).show();
                }
            }

        });

        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int n1 = (int) (Math.random()*100);
                if (n1 >= 50) {
                    Toast.makeText(getApplicationContext(), "Acertaste", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Fallaste", Toast.LENGTH_SHORT).show();
                }
            }

        });

        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Pop.class);
                startActivity(i);
            }

        });

    }

}