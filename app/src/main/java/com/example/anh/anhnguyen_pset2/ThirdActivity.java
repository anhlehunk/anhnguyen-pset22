package com.example.anh.anhnguyen_pset2;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ThirdActivity extends AppCompatActivity {

   //Button b_read;
   TextView parsetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        parsetext = (TextView) findViewById(R.id.parsetext);
        String text = "";
        try{
            InputStream is = getAssets().open("madlib1_tarzan.txt");
            int size =  is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text= new String(buffer);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        parsetext.setText(text);

    }

        /*b_read = (Button) findViewById(R.id.b_read);

        parsetext = (TextView) findViewById(R.id.parsetext);

        b_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = "";
                try{
                    InputStream is = getAssets().open("madlib0_simple.txt");
                    int size =  is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text= new String(buffer);
                    }
                catch (IOException ex){
                    ex.printStackTrace();
                }
                parsetext.setText(text);

            }
        });*/
    }



