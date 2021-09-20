package com.example.yt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddCart extends AppCompatActivity {

    TextView listView, priceView;
    String list_choice;
    Double price_bd,price_usd;
    Button checkOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        //getting the datas passed from MainActivity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choice");
        price_bd = bundle.getDouble("price");

        listView.setText(list_choice);
        priceView.setText(price_bd.toString());

    }

    public void check_out (View view){
        findViewById(R.id.btnCheckOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Check Out SUCCESSFULLY!", Toast.LENGTH_LONG).show();
            }
        });
    }

}