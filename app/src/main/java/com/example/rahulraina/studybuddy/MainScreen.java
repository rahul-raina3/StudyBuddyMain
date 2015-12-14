package com.example.rahulraina.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void onClickSignIn(View v) {
        setContentView(R.layout.sign_in_screen);

    }

    public void onClickLogin(View v) {
        EditText username = (EditText) findViewById(R.id.editText);
        EditText password = (EditText) findViewById(R.id.editText2);

        if (username.getText().toString().toLowerCase().equals("rahul@gmail.com")
                && password.getText().toString().equals("poop")) {
            setContentView(R.layout.main_post_sign_in);
        } else {
            password.setText("");
        }

        TextView welcome_m = (TextView) findViewById(R.id.welcome_main);
        String low_name = username.getText().toString().toLowerCase();
        String name = low_name.substring(0, 1).toUpperCase() + low_name.substring(1, low_name.length() - 10);
        welcome_m.setText("Welcome, " + name + "!");
    }

    public void sign_in_back_click(View v) {
        setContentView(R.layout.activity_main_screen);
    }
}
