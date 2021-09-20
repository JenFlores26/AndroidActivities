package com.example.activitysix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    public EditText name;
    public EditText password;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.login);
    }
    public void Login(View view){

        if(name.getText().toString().equals("jennifer")&& password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Welcome Jennifer!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Tab.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
        }else if(name.getText().toString().equals("jennifer") && !password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Wrong Password", Toast.LENGTH_SHORT).show();
        }else if(!name.getText().toString().equals("jennifer") && password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Wrong Username", Toast.LENGTH_SHORT).show();
        }else if(!name.getText().toString().equals("jennifer") && !password.getText().toString().equals("flores")){
            Toast.makeText(getApplicationContext(),"Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }else{

        }
    }
}