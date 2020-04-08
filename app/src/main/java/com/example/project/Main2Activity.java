package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    Spinner empTypes, color;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    TextView t1,t2;
    RadioButton rb1, rb2;
    RadioGroup r1, r2;
    int year = Calendar.getInstance().get(Calendar.YEAR);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        empTypes = (Spinner) findViewById(R.id.emp_Type);
        t1 = (TextView)findViewById(R.id.textView8);
        t2 = (TextView)findViewById(R.id.textView10);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.e3);
        e4 = (EditText)findViewById(R.id.editText4);
        e5 = (EditText)findViewById(R.id.editText3);
        e6 = (EditText)findViewById(R.id.editText);
        e7 = (EditText)findViewById(R.id.editText7);
        e8 = (EditText)findViewById(R.id.editText5);
        e9 = (EditText)findViewById(R.id.e9);
        e10 = (EditText)findViewById(R.id.editText2);
        r1 = (RadioGroup)findViewById(R.id.radioGroup1);
        r2 = (RadioGroup)findViewById(R.id.radioGroup);
        rb1 = (RadioButton)findViewById(R.id.radioButton3);
        rb2 = (RadioButton)findViewById(R.id.radioButton4);
        color = (Spinner) findViewById(R.id.color);
        List<String> emp = new ArrayList<>();


        emp.add("Manager");
        emp.add("Tester ");
        emp.add("Programmer");
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, emp);
        empTypes.setAdapter(adapter);
        empTypes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (empTypes.getSelectedItem().toString().equals("Manager")){
                    t1.setText("#clients");
                    t1.setVisibility(View.VISIBLE);
                    e1.setVisibility(View.VISIBLE);
                }
                 if (empTypes.getSelectedItem().toString().equals("Tester")){
                     t1.setText("#bugs");
                     t1.setVisibility(View.VISIBLE);
                     e1.setVisibility(View.VISIBLE);
                 }
                 if(empTypes.getSelectedItem().toString().equals("Programmer")){
                     t1.setText("#projects");
                     t1.setVisibility(View.VISIBLE);
                     e1.setVisibility(View.VISIBLE);
                 }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("Brown");
        colors.add("White");
        colors.add("Black");
        colors.add("Beige");

        //creating adapter for spinner
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, colors);
        color.setAdapter(adapter1);
    }

    public void register(View view) {
        if(e4.getText().toString().length() ==0)
            e4.setError("First name is required!");
        if(e3.getText().toString().length() ==0)
            e3.setError("Last name is required!");
        //validating value for birth year between 1950 to current year
        int currentYear = Integer.parseInt(e5.getText().toString());
        if(!(currentYear >=1950 ||
                currentYear <= year) ||
                currentYear == 0){
            e5.setError("Birth Year is required and should be between 1950 to current year!!!");
        }

    }
}
