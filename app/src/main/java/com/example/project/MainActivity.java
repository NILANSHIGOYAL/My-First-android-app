package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btn;
EmployeeDBHandler mDatabase;
List<Employee> employeeList;
ListView lv;
TextView tv_EmpName, tv_EmpId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        tv_EmpName= (TextView)findViewById(R.id.tv_EmpName);
        tv_EmpId = (TextView)findViewById(R.id.tv_EmpId);
        employeeList = new ArrayList<>();
        lv = (ListView)findViewById(R.id.lv);

        mDatabase = new EmployeeDBHandler(this);
        loadEmployees();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });

    }

    private void loadEmployees() {
        Cursor cursor = mDatabase.getAllEmployees();

        if(cursor.moveToFirst()){
            do {
                employeeList.add(new Employee(
                        cursor.getLong(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getInt(3),
                        cursor.getDouble(4),
                        cursor.getInt(5),
                        cursor.getString(6),
                        cursor.getInt(7),
                        cursor.getString(8),
                        cursor.getString(9),
                        cursor.getString(10),
                        cursor.getString(11),
                        cursor.getString(12),
                        cursor.getString(13)
                ));
            } while (cursor.moveToNext());
            cursor.close();
        }
    }

    public void addNewEmployee(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
