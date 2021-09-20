package com.example.tabhostmidtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = (TabHost)findViewById(R.id.tabhost);
        tabhost.setup();
        TabHost.TabSpec sp = tabhost.newTabSpec("");
        sp.setContent(R.id.page1);
        sp.setIndicator("foods");
        tabhost.addTab(sp);
    }
}