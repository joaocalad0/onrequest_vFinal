package com.example.onrequest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void create(View view) {
        Intent create = new Intent(this, LoginActivity.class);
        startActivity(create);

        Toast.makeText(this,"Account Create!", Toast.LENGTH_SHORT).show();
    }
}