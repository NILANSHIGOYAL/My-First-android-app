package com.example.project;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class EmployeeAdapter extends ArrayAdapter {
    Context mContext;
    int layoutRes;
    List<Employee> Employees;

    EmployeeDBHandler mDatabase;


    public EmployeeAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
