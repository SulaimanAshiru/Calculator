package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare the view class
        TextView calculatorDisplay;
        calculatorDisplay =findViewById(R.id.calculatorDisplay);

        Button btn_zero, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven,btn_eight, btn_nine;

        btn_zero =findViewById(R.id.zero);
        btn_one =findViewById(R.id.btn_one);
        btn_two =findViewById(R.id.btn_two);
        btn_three =findViewById(R.id.btn_three);
        btn_four =findViewById(R.id.btn_four);
        btn_five =findViewById(R.id.btn_five);
        btn_six =findViewById(R.id.btn_six);
        btn_seven =findViewById(R.id.btn_seven);
        btn_eight =findViewById(R.id.btn_eight);
        btn_nine =findViewById(R.id.btn_nine);
        calculatorDisplay =findViewById(R.id.calculatorDisplay);

        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "zero", Toast.LENGTH_SHORT).show();
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();

            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "two", Toast.LENGTH_SHORT).show();
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "three", Toast.LENGTH_SHORT).show();
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "four", Toast.LENGTH_SHORT).show();
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "five", Toast.LENGTH_SHORT).show();
            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "six", Toast.LENGTH_SHORT).show();
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "seven", Toast.LENGTH_SHORT).show();
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "eight", Toast.LENGTH_SHORT).show();
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "nine", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
