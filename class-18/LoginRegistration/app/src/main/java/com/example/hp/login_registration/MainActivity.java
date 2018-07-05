package com.example.hp.login_registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,register;
    EditText eMail,uName,pass,phone;
    final String Pref="Pref";
    android.content.SharedPreferences SharesPreferences=null;
    android.content.SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.LG);
        register = (Button) findViewById(R.id.LG1);
        eMail= (EditText) findViewById(R.id.ed1);
        uName = (EditText) findViewById(R.id.ed2);
        pass = (EditText) findViewById(R.id.ed);
        phone = (EditText) findViewById(R.id.ed4);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Activity_3.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("Pref", MODE_PRIVATE);
                SharedPreferences.Editor edt = sp.edit();
                edt.putString("email", eMail.getText().toString());
                edt.putString("username", uName.getText().toString());
                edt.putString("password", pass.getText().toString());
                edt.putString("phone", phone.getText().toString());
                edt.commit();
                //edt.clear();
                Toast.makeText(getApplicationContext(), "Registered Sucessfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
