package com.example.hp.login_registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_3 extends AppCompatActivity {

    EditText e1,e2;
    Button b;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        e1=(EditText)findViewById(R.id.ed);
        e2=(EditText)findViewById(R.id.ed2);
        b=(Button)findViewById(R.id.LG1);
        sp=getSharedPreferences("Pref",MODE_PRIVATE);
        final String user=sp.getString("username","");
        final String pass=sp.getString("password","");


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String s1=e1.getText().toString();
                final String s2=e2.getText().toString();

                if(s1.equals(user)&&s2.equals(pass)){
                    Toast.makeText(getApplicationContext(), "login Sucessfully", Toast.LENGTH_SHORT).show();

                    Intent i=new Intent(Activity_3.this,Activity_2.class);
                    startActivity(i);
                }
            }
        });
    }}


