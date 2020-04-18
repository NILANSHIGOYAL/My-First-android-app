package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv_EN,tv_EN1,tv_EN2,tv_EN3,tv_EN4,tv_EN5,tv_EN6,tv_EN7,tv_EN8,tv_EN9,tv_EN10,tv_EN11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv_EN = (TextView) findViewById(R.id.tv_EN);
        tv_EN1 = (TextView) findViewById(R.id.tv_EN1);
        tv_EN2 = (TextView) findViewById(R.id.tv_EN2);
        tv_EN3 = (TextView) findViewById(R.id.tv_EN3);
        tv_EN4 = (TextView) findViewById(R.id.tv_EN4);
        tv_EN5 = (TextView) findViewById(R.id.tv_EN5);
        tv_EN6= (TextView) findViewById(R.id.tv_EN6);
        tv_EN7 = (TextView) findViewById(R.id.tv_EN7);
        tv_EN8 = (TextView) findViewById(R.id.tv_EN8);
        tv_EN9 = (TextView) findViewById(R.id.tv_EN9);
        tv_EN10 = (TextView) findViewById(R.id.tv_EN10);
        tv_EN11= (TextView) findViewById(R.id.tv_EN11);
    }
}
