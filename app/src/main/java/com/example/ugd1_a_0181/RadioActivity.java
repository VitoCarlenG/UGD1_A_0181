package com.example.ugd1_a_0181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {
    RadioButton radiobutton1, radiobutton2, radiobutton3;
    Button submit;
    String temp;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radiobutton1 = findViewById(R.id.radiobutton1);
        radiobutton2 = findViewById(R.id.radiobutton2);
        radiobutton3 = findViewById(R.id.radiobutton3);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radiobutton1.isChecked())
                {
                    temp=radiobutton1.getText().toString();
                    intent=new Intent(RadioActivity.this, MainActivity.class);
                    intent.putExtra("teks", temp);
                    startActivity(intent);
                    finish();
                }
                else if(radiobutton2.isChecked())
                {
                    temp=radiobutton2.getText().toString();
                    intent=new Intent(RadioActivity.this, MainActivity.class);
                    intent.putExtra("teks", temp);
                    startActivity(intent);
                    finish();
                }
                else if(radiobutton3.isChecked()) {
                    temp=radiobutton3.getText().toString();
                    intent=new Intent(RadioActivity.this, MainActivity.class);
                    intent.putExtra("teks", temp);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}