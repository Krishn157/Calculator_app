package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Android Button
    private Button operatorButton;
    String operator,assign,value="";
    double val,a,res=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operatorButton = findViewById(R.id.button37);
        operatorButton.setOnClickListener(new OnClickListener() {
//           @Override
            public void onClick(View v) {
                value="";
                //To get text of a button when clicked
                assign = ((Button)v).getText().toString();
               System.out.println(assign);
               switch (operator){
                   case "+":{
                       res= val+a;
                       System.out.println(res);
                       break;
                   }
                   case "-":{
                       res= val-a;
                       System.out.println(res);
                       break;
                   }
                   case "*":{
                       res= val*a;
                       System.out.println(res);
                       break;
                   }
                   case "/":{
                       res= val/a;
                       System.out.println(res);
                       break;
                   }
               }
                TextView textView = findViewById(R.id.textView);
                textView.setText(""+String.format("%.2f",res));
                a=res;
            }});
        operatorButton = findViewById(R.id.button30);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                value="";
                //To get text of a button when clicked
                operator = ((Button)v).getText().toString();
                System.out.println(operator);
                val=a;
                TextView textView = findViewById(R.id.textView);
                textView.setText(operator);

            }});
        operatorButton = findViewById(R.id.button31);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                value="";
                //To get text of a button when clicked
                operator = ((Button)v).getText().toString();
                System.out.println(operator);
                val=a;
                TextView textView = findViewById(R.id.textView);
                textView.setText(operator);
            }});
        operatorButton = findViewById(R.id.button32);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                value="";
                //To get text of a button when clicked
                operator = ((Button)v).getText().toString();
                System.out.println(operator);
                val=a;
                TextView textView = findViewById(R.id.textView);
                textView.setText(operator);
            }});
        operatorButton = findViewById(R.id.button33);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                value="";
                //To get text of a button when clicked
                operator = ((Button)v).getText().toString();
                System.out.println(operator);
                val=a;
                TextView textView = findViewById(R.id.textView);
                textView.setText(operator);
            }});
        operatorButton = findViewById(R.id.button0);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);
            }});
        operatorButton = findViewById(R.id.button1);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button2);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button3);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button4);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button5);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button6);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button7);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);

            }});
        operatorButton = findViewById(R.id.button8);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);
            }});
        operatorButton = findViewById(R.id.button9);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);
            }});
        operatorButton = findViewById(R.id.button29);
        operatorButton.setOnClickListener(new OnClickListener() {
            //           @Override
            public void onClick(View v) {
                //To get text of a button when clicked
                value += ((Button)v).getText().toString();
                a=Double.parseDouble(value);
                System.out.println(a);
                TextView textView = findViewById(R.id.textView);
                textView.setText(value);
            }});

    }

    public void clear(View view) {
        value = "";
        a=0;
        res=0;
        val=0;
        TextView textView = findViewById(R.id.textView);
        textView.setText("");
    }
    public void crash(View view){
        throw new RuntimeException("This is a crash");
    }
}
