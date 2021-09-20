package com.example.yt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button FriedChicken;
    Button Spaghetti;
    Button BurgerSteak;

    String choice = "";
    double price = 0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FriedChicken = (Button) findViewById(R.id.btnFriedChicken);
        Spaghetti = (Button) findViewById(R.id.btnSpaghetti);
        BurgerSteak = (Button) findViewById(R.id.btnBurgerSteak);
    }

    public void add_to_list (View view){
        if(view == findViewById(R.id.btnSpaghetti)){
            choice = choice + " Spaghetti "+ "\n";
            price = price+100;
            Toast.makeText(getApplicationContext(),"Spaghetti ADD CART", Toast.LENGTH_LONG).show();
        }
        if(view == findViewById(R.id.btnFriedChicken)){
            choice = choice + " Fried Chicken "+ "\n";
            price = price+10;
            Toast.makeText(getApplicationContext(),"Fried Chicken ADD CART", Toast.LENGTH_LONG).show();

        }
        if(view == findViewById(R.id.btnBurgerSteak)){
            choice = choice + " Burger Steak "+ "\n";
            price = price+60;
            Toast.makeText(getApplicationContext(),"burger Steak ADD CART", Toast.LENGTH_LONG).show();
        }
    }

    public void placeOrder(View view){
        Intent i = new Intent(MainActivity.this, AddCart.class);
        Bundle bundle = new Bundle();
        bundle.putString("choice",choice);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
}