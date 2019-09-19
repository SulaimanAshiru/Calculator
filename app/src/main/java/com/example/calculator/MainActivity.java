package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Declare the view class
        final TextView calculatorDisplay;
        calculatorDisplay =findViewById(R.id.calculatorDisplay);

        Button btn_zero, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven,btn_eight, btn_nine,
                btn_clear, btn_math, btn_percent, btn_divide, btn_multiply, btn_minus, btn_plus, btn_equals, btn_decimal;


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
        btn_clear =findViewById(R.id.btn_clear);
        btn_math =findViewById(R.id.btn_math);
        btn_divide =findViewById(R.id.btn_divide);
        btn_multiply =findViewById(R.id.btn_multiply);
        btn_minus =findViewById(R.id.btn_minus);
        btn_plus =findViewById(R.id.plus);
        btn_equals =findViewById(R.id.equals);
        btn_decimal =findViewById(R.id.decimal);
        btn_percent =findViewById(R.id.btn_percent);


        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "zero", Toast.LENGTH_SHORT).show();
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();

            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "two", Toast.LENGTH_SHORT).show();
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "three", Toast.LENGTH_SHORT).show();
            }

        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "four", Toast.LENGTH_SHORT).show();
            }

        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "five", Toast.LENGTH_SHORT).show();
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "six", Toast.LENGTH_SHORT).show();
            }

        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "seven", Toast.LENGTH_SHORT).show();
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "eight", Toast.LENGTH_SHORT).show();
            }

        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button clicked= (Button) view;

                String buttontext= clicked.getText().toString();
                calculatorDisplay.append(buttontext);

                Toast.makeText(MainActivity.this, "nine", Toast.LENGTH_SHORT).show();
            }

        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "clear", Toast.LENGTH_SHORT).show();
            }
        });
        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "math", Toast.LENGTH_SHORT).show();
            }
        });
        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "percent", Toast.LENGTH_SHORT).show();
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "divide", Toast.LENGTH_SHORT).show();
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "multiply", Toast.LENGTH_SHORT).show();
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "minus", Toast.LENGTH_SHORT).show();
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "plus", Toast.LENGTH_SHORT).show();
            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "equals", Toast.LENGTH_SHORT).show();
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "decimal", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
