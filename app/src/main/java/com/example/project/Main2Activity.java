package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {


       String[] DayofWeek = {"Sunday" "Monday","Tuesday","Wednesday","Thursday","Friday","saturday"};
       Spinner empTypes,color;
       Button choose;
       TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        choose =(Spinner)indViewById(R.id.choose);
        color =(Spinner)findViewByID(R.id.color);


        choose.SetONClickListener(newButton.ClickListener){
            @Override


                    choose.setOnClickListener(new Button.OnClickListener() {


                @Override

                public void onClick(View v) {
                    LayoutInflater layoutInflater =
                            (LayoutInflater)getBaseContext()
                                    .getSystemService(LAYOUT_INFLATER_SERVICE);
                    View popupView = layoutInflater.inflate(R.layout.popup, null);
                    final PopupWindow popupWindow = new PopupWindow(
                            popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    Spinner popupSpinner = (Spinner)popupView.findViewById(R.id.empType);

                    ArrayAdapter<String> adapter =
                            new ArrayAdapter<String>(Main2Activity.this,
                                    android.R.layout.simple_spinner_item, DayOfWeek);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    popupSpinner.setAdapter(adapter);
                    popupWindow.showAsDropDown(choose, 50, -30);

                }

            });

        }

    public void register(View view) {
    }
}
