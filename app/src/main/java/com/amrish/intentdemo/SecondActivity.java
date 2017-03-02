package com.amrish.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView userName;
    Button show;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userName = (TextView)findViewById(R.id.textView4);
        show = (Button) findViewById(R.id.button2);
        gender = (RadioGroup) findViewById(R.id.radioGroup);

        Bundle bundle = getIntent().getExtras();
        final String username = bundle.getString("username");
        userName.setText(username);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gender.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                Toast.makeText(getApplicationContext(),"Login ID: "+username + " " + "Gender: "+rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
