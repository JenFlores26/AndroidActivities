package com.example.activitycompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    EditText name;
    EditText password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
    public void login (View view){
        String text=name.getText().toString();
        String pass=password.getText().toString();

        if(name.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(),"Login Success!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }
    }
}