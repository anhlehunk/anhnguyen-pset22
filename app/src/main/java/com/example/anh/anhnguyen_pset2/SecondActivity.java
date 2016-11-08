package com.example.anh.anhnguyen_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendMessage (View view){
        Intent startNewActivity = new Intent(this, ThirdActivity.class);
        startActivity(startNewActivity);
    }
}
