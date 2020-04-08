package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmployeeAdapter extends ArrayAdapter {
    Context mContext;
    int layoutRes;
    List<Employee> Employees;

    EmployeeDBHandler mDatabase;


    public EmployeeAdapter(@NonNull Context mContext, int layoutRes, List<Employee> Employees, EmployeeDBHandler mDatabase) {
        super(mContext, layoutRes, Employees);
        this.mContext =mContext;
        this.layoutRes=layoutRes;
        this.Employees=Employees;
        this.mDatabase=mDatabase;
    }

    public View getView(int position, @Nullable View convertView,@Nullable ViewGroup parent ){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v  =  inflater.inflate(layoutRes, null);
        TextView tv_EmpName = v.findViewById(R.id.tv_EmpName);
        TextView tv_EmpId = v.findViewById(R.id.tv_EmpId);
        final Employee employee = Employees.get(position);
        tv_EmpId.setText("Id: "+ employee.getEmpId());
        tv_EmpName.setText("Name: "+employee.getFirstName()+" "+employee.getLastName());
        return v;
    }
}
