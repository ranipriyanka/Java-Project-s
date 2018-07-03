



package com.example.hp.intents;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.TextView;


public class Activity2 extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t= (TextView) findViewById(R.id.tex);
            Bundle b = getIntent().getExtras();
            String user = b.getString("User");
            String pass = b.getString("Password");

            if (user.equals("ADMIN") && pass.equals("12345"))
                t.setText("Welcome " + "user" + "\n\n you logged in sucessfully");
            else
                t.setText("wrong username & password");
    }
}