package com.example.activitycompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity6 extends AppCompatActivity {

    public EditText name;
    public EditText password;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        name = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button9);
    }
    public void login(View View){
        if(name.getText().toString().equals("Rodney")&& password.getText().toString().equals("1234")){
            Toast.makeText(getApplicationContext(),"Welcome Rodney!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Activity6.this, Tab.class);
            Bundle bundle = new Bundle();
            i.putExtras(bundle);
            startActivity(i);
        }else if(name.getText().toString().equals("Rodney") && !password.getText().toString().equals("1234")){
            Toast.makeText(getApplicationContext(),"Wrong Password", Toast.LENGTH_SHORT).show();
        }else if(!name.getText().toString().equals("Rodney") && password.getText().toString().equals("1234")){
            Toast.makeText(getApplicationContext(),"Wrong Username", Toast.LENGTH_SHORT).show();
        }else if(!name.getText().toString().equals("Rodney") && !password.getText().toString().equals("1234")){
            Toast.makeText(getApplicationContext(),"Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }else{

        }
    }
}