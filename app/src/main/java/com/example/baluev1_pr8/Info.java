package com.example.baluev1_pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity implements View.OnClickListener {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button3){
            startActivity(new Intent(Info.this, Phone.class));
        }

    }
}