package com.example.activitycompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnTwo;
    public Button btnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTwo = (Button) findViewById(R.id.button2);
        btnThree = (Button) findViewById(R.id.button3);
    }
    public void actTwo(View view){
        Intent i = new Intent(MainActivity.this, Activity2.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
    public void actThree(View view){
        Intent i = new Intent(MainActivity.this, Activity3.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
    public void actFour(View view){
        Intent i = new Intent(MainActivity.this, Activity4.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
    public void actFive(View view){
        Intent i = new Intent(MainActivity.this, Activity5.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
    public void actSix(View view){
        Intent i = new Intent(MainActivity.this, Activity6.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
    public void actSeven(View view){
        Intent i = new Intent(MainActivity.this, Activity7.class);
        Bundle bundle = new Bundle();
        i.putExtras(bundle);
        startActivity(i);
    }
}