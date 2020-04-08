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
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    Spinner empTypes, color;
    Button choose;
    EditText e1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        empTypes = (Spinner) findViewById(R.id.emp_Type);
        t1 = (TextView)findViewById(R.id.textView8);
        e1 = (EditText)findViewById(R.id.editText);
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
    }
}
