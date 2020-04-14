package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

    private static final String TABLE_CREATE ="CREATE TABLE " + TABLE_EMPLOYEES + "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_FIRSTNAME + " varchar(200) NOT NULL, " +
            COLUMN_LASTNAME + " varchar(200) NOT NULL, " +
            COLUMN_AGE + " integer NOT NULL, " +
            COLUMN_SALARY + " double NOT NULL, " +
            COLUMN_OCCRATE + " integer NOT NULL, " +
            COLUMN_EMPTYPE + " varchar(200) NOT NULL, " +
            COLUMN_CPB + " integer NOT NULL, " +
            COLUMN_VEHICLE + " varchar(200) NOT NULL, " +
            COLUMN_MODEL + " varchar(200) NOT NULL, " +
            COLUMN_PLATE + " varchar(200) NOT NULL, " +
            COLUMN_COLOR + " varchar(200) NOT NULL, " +
            COLUMN_SIDECAR + " varchar(200) NOT NULL " +
            ");";

    public EmployeeDBHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEES);
        db.execSQL(TABLE_CREATE);
        onCreate(db);
    }

    boolean addEmployee(String firstName, String lastName, int age,
                        double salary, int occRate,
                        String employeeType, int cpb,
                        String vehicle, String model, String plate,
                        String Color, String sidecar){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_FIRSTNAME,firstName);
        cv.put(COLUMN_LASTNAME,lastName);
        cv.put(COLUMN_AGE,String.valueOf(age));
        cv.put(COLUMN_SALARY,String.valueOf(salary));
        cv.put(COLUMN_OCCRATE,String.valueOf(occRate));
        cv.put(COLUMN_EMPTYPE,employeeType);
        cv.put(COLUMN_CPB,String.valueOf(cpb));
        cv.put(COLUMN_VEHICLE,vehicle);
        cv.put(COLUMN_MODEL,model);
        cv.put(COLUMN_PLATE,plate);
        cv.put(COLUMN_COLOR,Color);
        cv.put(COLUMN_SIDECAR,sidecar);

        return sqLiteDatabase.insert(TABLE_EMPLOYEES,null, cv) != -1;
    }

        Cursor getAllEmployees(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_EMPLOYEES, null);
        }
        public Employee getEmployee(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM employees WHERE emp_id = ?",new String[]{""+id});
        Employee employee = null;
        while (!cursor.isAfterLast()){
            employee = employeeMapper(cursor);
            cursor.moveToNext();
        }
        return employee;
        }
        private Employee employeeMapper(Cursor cursor){

        }
}
