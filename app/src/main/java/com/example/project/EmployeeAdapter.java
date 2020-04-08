package com.example.project;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

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

    public View getView(){}
}
