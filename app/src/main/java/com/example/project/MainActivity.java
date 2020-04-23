package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btn;
EmployeeDBHandler mDatabase;
List<Employee> employeeList = new ArrayList<>();
ListView lv;
EditText search;
EmployeeAdapter employeeAda;
TextView tv_EmpName, tv_EmpId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (EditText)findViewById(R.id.search);
        btn = (Button)findViewById(R.id.button);
        tv_EmpName= (TextView)findViewById(R.id.tv_EmpName);
        tv_EmpId = (TextView)findViewById(R.id.tv_EmpId);

        lv = (ListView)findViewById(R.id.lv);

        mDatabase = new EmployeeDBHandler(this);
        employeeList = loadEmployees(mDatabase, employeeList);
        employeeAda = new EmployeeAdapter(this, R.layout.activity_list_view,employeeList,mDatabase);
        lv.setAdapter(employeeAda);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                Employee employee = (Employee) employeeAda.getItem(position);
                intent.putExtra("employee", position);
                intent.putExtra("data", employee.getFirstName());
                intent.putExtra("data1", employee.getLastName());
                intent.putExtra("data2", employee.getAge());
                intent.putExtra("data3", employee.getSalary());
                intent.putExtra("data4", employee.getOccRate());
                intent.putExtra("data5", employee.getEmployeeType());
                intent.putExtra("data6", employee.getCpb());
                intent.putExtra("data7", employee.getVehicle());
                intent.putExtra("data8", employee.getModel());
                intent.putExtra("data9", employee.getPlate());
                intent.putExtra("data10", employee.getColor());
                intent.putExtra("data11", employee.getSidecar());
                startActivity(intent);

                startActivity(intent);
                
            }
        });
            search.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    employeeAda.getFilter().filter(s.toString());

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
    }

    private List<Employee> loadEmployees(EmployeeDBHandler mDatabase, List<Employee> employeeList) {
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
                        cursor.getString(12)
                ));
            } while (cursor.moveToNext());
            cursor.close();


        }
        return employeeList;
    }

    public void addNewEmployee(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
