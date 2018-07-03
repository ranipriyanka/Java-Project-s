package com.example.hp.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b;
    private EditText ed1,ed2;
    private TextView t1,t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b=(Button)findViewById(R.id.LG );
        ed1=(EditText)findViewById(R.id.editText3);
        ed2=(EditText)findViewById(R.id.editText4);
        t1=(TextView)findViewById(R.id.tv1);
        t2=(TextView)findViewById(R.id.tv2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Activity2.class);
                i.putExtra("User",ed1.getText().toString());
                i.putExtra("Password",ed2.getText().toString());
                startActivity(i);
            }
        }  )  ;
    }
}


