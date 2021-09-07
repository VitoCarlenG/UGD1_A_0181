package com.example.ugd1_a_0181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button clearField, login;
    Intent intent;
    TextView hiddenTv;
    String teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        clearField = findViewById(R.id.clearField);
        login = findViewById(R.id.login);
        hiddenTv = findViewById(R.id.hiddenTv);

        clearField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText().clear();
                password.getText().clear();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("") || password.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Inputan Username Atau Password Masih Ada Yang Kosong", Toast.LENGTH_SHORT).show();
                }
                else if(username.getText().toString().equals(getResources().getString(R.string.usernameCorrect)) && password.getText().toString().equals(getResources().getString(R.string.passwordCorrect))) {
                    Toast.makeText(MainActivity.this, "Username Dan Password Benar", Toast.LENGTH_SHORT).show();
                    intent=new Intent(MainActivity.this, RadioActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(MainActivity.this, "Username Atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
        teks=getIntent().getStringExtra("teks");
        hiddenTv.setText(teks);

        if(hiddenTv.getText().toString().equals(getResources().getString(R.string.mudah))) {
            hiddenTv.setBackgroundResource(R.color.red);
            username.setText(R.string.usernameCorrect);
            password.setText(R.string.passwordCorrect);
        }
        else if(hiddenTv.getText().toString().equals(getResources().getString(R.string.mudahsekali))) {
            hiddenTv.setBackgroundResource(R.color.green);
            username.setText(R.string.usernameCorrect);
            password.setText(R.string.passwordCorrect);
        }
        else if(hiddenTv.getText().toString().equals(getResources().getString(R.string.mudahbanget))) {
            hiddenTv.setBackgroundResource(R.color.blue);
            username.setText(R.string.usernameCorrect);
            password.setText(R.string.passwordCorrect);
        }
    }
}