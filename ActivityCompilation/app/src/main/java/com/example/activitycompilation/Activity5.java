package com.example.activitycompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity {

    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
    public void login (View view){
        String text=name.getText().toString();
        String pass=password.getText().toString();

        if(name.getText().toString().equals("jennifer")&& password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Welcome Jennifer!", Toast.LENGTH_SHORT).show();
        }else if(name.getText().toString().equals("jennifer")&& !password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Wrong Password", Toast.LENGTH_SHORT).show();
        }else if(!name.getText().toString().equals("jennifer")&& password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Wrong Username", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }
    }
}