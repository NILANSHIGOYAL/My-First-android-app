package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView tv_EN,tv_EN1,tv_EN2,tv_EN3,tv_EN4,tv_EN5,tv_EN6,tv_EN7,tv_EN8,tv_EN9,tv_EN10,tv_EN11;
    EmployeeDBHandler db = new EmployeeDBHandler(this);

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


        String empName = getIntent().getStringExtra("data");
        String emp1 =getIntent().getStringExtra("data1");
        int emp2 =getIntent().getIntExtra("data2",0);
        double emp3 =getIntent().getDoubleExtra("data3",0);
        int emp4 =getIntent().getIntExtra("data4",0);
        String emp5 =getIntent().getStringExtra("data5");
        String emp7 =getIntent().getStringExtra("data7");
        String emp8 =getIntent().getStringExtra("data8");
        String emp9 =getIntent().getStringExtra("data9");
        String emp10 =getIntent().getStringExtra("data10");
        String emp11=getIntent().getStringExtra("data11");
        int emp6 =getIntent().getIntExtra("data6",0);
        int employeeId = getIntent().getIntExtra("employee", 0);



        tv_EN.setText("First Name: "+empName);
        tv_EN1.setText("Last Name: "+emp1);
        tv_EN2.setText("Age: "+emp2);
        tv_EN3.setText("Salary: "+emp3);
        tv_EN4.setText("Occupation Rate: "+emp4);
        tv_EN5.setText("Employee Type: "+emp5);
        tv_EN6.setText("Numbers: "+emp6);
        tv_EN7.setText("Vehicle: "+emp7);
        tv_EN8.setText("Model: "+emp8);
        tv_EN9.setText("Plate: "+emp9);
        tv_EN10.setText("Side Car: "+emp10);
        tv_EN11.setText("Color: "+emp11);
    }
}
