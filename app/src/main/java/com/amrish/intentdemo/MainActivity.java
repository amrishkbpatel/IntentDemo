package com.amrish.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText login;
    EditText pwd;
    Button submit, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.EditTextlogin);
        pwd = (EditText) findViewById(R.id.EditTextPassword);
        submit = (Button) findViewById(R.id.SubmitBtn);
        cancel = (Button) findViewById(R.id.CancelBtn);

        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==submit){
            String data = login.getText().toString();
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra("username", data);
            startActivity(intent);
        }else if(v==cancel) {
            finish();
        }
    }
}
