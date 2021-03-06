package com.brillicaservices.gurjas.linearlayoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
 * @Author: Gurjas Singh,
 * Brillica Services, Dehradun
 * Dated - 2, June, 2018*/

public class MainActivity extends AppCompatActivity {
    
    /*
     * Creating a Global variable of TextView.
     * So that we can use it's reference in other functions as well.
     * */
    TextView obj;

    /*
    * Create a new Button object*/
    Button btn;

    /*
     * onCreate is default function that we need for every activity.
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Use this function to tell the activity which view is to be loaded.
         * R - automatically generated file. This file will be generated only after successful gradle build*/
        setContentView(R.layout.activity_main);
        
        /*
         * Casting TextView object with it's ID.
         * R.id.hello_world has been declared in the activity_main.xml file.
         * */
        obj = (TextView) findViewById(R.id.hello_world);

        /*
        * assign button reference to the button object*/
        btn = (Button) findViewById(R.id.next_activity_button);
        
        /*
         * Using predefined function .setText() to set text to the text view
         * */
        obj.setText("Gurjas");

        /*
        * Performing button @onClickListener()
        * when you start writing 'new View.OnClickListener(), compiler will give you suggestion
        * select it and it will automatically complete the whole code for you.'*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                * Use Intent class to class another activity
                * inside Intent constructor, pass the current Activity and second activity*/
                Intent intent = new Intent(MainActivity.this, NewActivity.class);

                /*
                * Use this method to call other activity*/
                startActivity(intent);
            }
        });
    }
}
