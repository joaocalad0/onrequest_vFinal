package com.example.onrequest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    public void submit(View view) {
        Intent submit = new Intent(this, TablesActivity.class);
        startActivity(submit);

        Toast.makeText(this,"Login successful!", Toast.LENGTH_SHORT).show();
    }

    public void forgot(View view) {
        Intent forgot = new Intent(this, CreateAccount.class);
        startActivity(forgot);
    }
}