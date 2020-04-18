package com.example.project;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends ArrayAdapter implements Filterable {
    Context mContext;
    int layoutRes;
    List<Employee> Employees;
private ArrayList<Employee> mOriginal;
    EmployeeDBHandler mDatabase;


    public EmployeeAdapter(@NonNull Context mContext, int layoutRes, List<Employee> Employees, EmployeeDBHandler mDatabase) {
        super(mContext, layoutRes, Employees);
        this.mContext = mContext;
        this.layoutRes = layoutRes;
        this.Employees = Employees;
        this.mDatabase = mDatabase;
    }

    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(layoutRes, null);
        TextView tv_EmpName = v.findViewById(R.id.tv_EmpName);
        TextView tv_EmpId = v.findViewById(R.id.tv_EmpId);
        final Employee employee = Employees.get(position);
        tv_EmpId.setText("Id: " + employee.getEmpId());
        tv_EmpName.setText("Name: " + employee.getFirstName() + " " + employee.getLastName());
        return v;
    }

    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                return null;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                Employees = (ArrayList<Employee>) results.values;
                notifyDataSetChanged();
                clear();
                for (int i = 0; i < Employees.size(); i++) {
                    add(Employees.get(i));
                    notifyDataSetInvalidated();
                }
            }
        }
    }

        private void loadEmployees () {
            Cursor cursor = mDatabase.getAllEmployees();
            Employees.clear();

            if (cursor.moveToFirst()) {
                do {
                    Employees.add(new Employee(
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
            notifyDataSetChanged();
        }
    }