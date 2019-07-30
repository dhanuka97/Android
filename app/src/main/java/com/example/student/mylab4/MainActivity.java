package com.example.student.mylab4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Context context = getApplicationContext();
//        CharSequence tostmsg = "Hello world";
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context,tostmsg,duration);
//        toast.setGravity(Gravity.TOP,0,0);
//        toast.show();
        LayoutInflater layoutInflater = getLayoutInflater();
        @SuppressLint("WrongViewCast") View layout = layoutInflater.inflate(R.layout.customtoste,(ViewGroup) findViewById(R.id.custom_toast_container));

        TextView view = layout.findViewById(R.id.custom_toast_container);
        view.setText("This is a Custome Toste");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


    }
    //Im from git hub
}
