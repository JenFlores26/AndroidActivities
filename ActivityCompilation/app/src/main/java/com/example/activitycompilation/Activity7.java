package com.example.activitycompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    public EditText f;
    public EditText s;
    public TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        f= (EditText) findViewById(R.id.first);
        s= (EditText) findViewById(R.id.second);
        r = (TextView) findViewById(R.id.result);
    }

    public void btnAdd(View view){
        int num1 = Integer.parseInt(f.getText().toString());
        int num2 = Integer.parseInt(s.getText().toString());
        int sum = num1 + num2;
        r.setText(String.valueOf(sum));
    }

    public void btnSub(View view){
        int num1 = Integer.parseInt(f.getText().toString());
        int num2 = Integer.parseInt(s.getText().toString());
        int sum = num1 - num2;
        r.setText(String.valueOf(sum));
    }
    public void btnMul(View view){
        int num1 = Integer.parseInt(f.getText().toString());
        int num2 = Integer.parseInt(s.getText().toString());
        int sum = num1 * num2;
        r.setText(String.valueOf(sum));
    }
    public void btnDiv(View view){
        int num1 = Integer.parseInt(f.getText().toString());
        int num2 = Integer.parseInt(s.getText().toString());
        int sum = num1 / num2;
        r.setText(String.valueOf(sum));
    }
}