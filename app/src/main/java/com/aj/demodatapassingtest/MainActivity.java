package com.aj.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassCharacter;
    TextView textPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.button);
        btnPassCharacter = findViewById(R.id.button2);
        textPassDouble = findViewById(R.id.textView3);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

            }
        });

        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , ThirdActivity.class);
                intent.putExtra("value", 'a');
                startActivity(intent);

            }
        });

        textPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , FourthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);

            }
        });

    }
}