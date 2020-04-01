package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

                    public void onlick(View v){
                LayoutInflater layoutInflater=(LayoutInflater)
                        getBaseontext()
                        .getSystemSystemService(LAYOUT_INFLATER_SERVICE);
                                        View popupView=
                                                LayoutInflater.Inflater(R.layout.popup,null);
                                                           final PopupWindow  popupWindow=new(popupView(popupView,
                        ViewGroup.LayoutParams.Wrap_Content,
                        ViewGroup.LayoutParams.Wrap_Content);
            )
            spinner popupSpinner=(Spinner)popupView.findViewById(R.id.empType);
                                                       ArrayAdapter<String> adapter= new ArrayAdapter<String>(Main2Activity.this,
                                                               android.R>layout.simple_spinner_item,dayofWeek);
                                                               adapter.setDropDown_item);
                      popupSpinner.setAdapter(adapter);
                            popupWindow.showAsDropDown(choose,50,-30);}
        }
                                                               )
        }
    }

    public void register(View view) {
    }
}
