package com.example.hp.login_registration;



import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class Activity_2 extends AppCompatActivity {
    TextView t1,t2,t3,t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);
        t3=(TextView)findViewById(R.id.tv3);
        t4=(TextView)findViewById(R.id.tv4);

        SharedPreferences sp=getSharedPreferences("Pref",MODE_PRIVATE);
        final String s1=sp.getString("email","");
        final String s2=sp.getString("password","");
        final String s3=sp.getString("username","");
        final String s4=sp.getString("phone","");

        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);
    }
}
