package com.example.project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class EmployeeDBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Employees";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_EMPLOYEES = "employees";
    public static final String COLUMN_ID = "emp_Id";
    public static final String COLUMN_FIRSTNAME = "first_name";
    public static final String COLUMN_LASTNAME = "last_name";
    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_SALARY = "salary";
    public static final String COLUMN_OCCRATE = "occu_rate";
    public static final String COLUMN_EMPTYPE = "empType";
    public static final String COLUMN_CPB = "cpb";
    public static final String COLUMN_VEHICLE = "vehicle";
    public static final String COLUMN_MODEL= "model";
    public static final String COLUMN_PLATE = "plate";
    public static final String COLUMN_COLOR = "Color";
    public static final String COLUMN_SIDECAR = "sideCar";
    public static final String COLUMN_CARTYPE = "carType";

    public EmployeeDBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
