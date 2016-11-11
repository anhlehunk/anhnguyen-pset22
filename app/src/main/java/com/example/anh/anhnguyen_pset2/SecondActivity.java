
package com.example.anh.anhnguyen_pset2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;
import java.util.*;

import static com.example.anh.anhnguyen_pset2.R.id.okbutton;


public class SecondActivity extends AppCompatActivity {

Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button okbutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




       ;

        try {
            inputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("TESTT", "hallo");

        userInput();

    }

    public void inputStream()
            throws IOException {
        InputStream targetStream = getResources().openRawResource(R.raw.madlib1_tarzan);
        story = new Story(targetStream);
        Log.d("Hoi", String.valueOf(story.getPlaceholderCount()));

    }

  public void userInput(){
        int placecount = story.getPlaceholderCount();
        String typeofword = story.getNextPlaceholder();
        String hint = story.getNextPlaceholder();
        ((EditText) findViewById(R.id.editText)).setHint(hint);
        ((TextView) findViewById(R.id.typetext)).setText("Please fill in a/an " + typeofword );
        ((TextView) findViewById(R.id.placeCount)).setText(placecount + " word / words left" );
        }

    public void addWord(View view){
        String replaced=story.getNextPlaceholder();
        int placecount = story.getPlaceholderRemainingCount();
        String typeofword = story.getNextPlaceholder();
        String hint = story.getNextPlaceholder();
        Toast.makeText(getBaseContext(),"hey",Toast.LENGTH_LONG).show();
        ((EditText) findViewById(R.id.editText)).setHint(hint);
        ((TextView) findViewById(R.id.typetext)).setText("Please fill in a/an " + typeofword );

        story.getNextPlaceholder();
        story.fillInPlaceholder(replaced);

        ((TextView) findViewById(R.id.editText)).setText("");
        ((TextView) findViewById(R.id.placeCount)).setText(placecount + " word / words left" );






            if (story.isFilledIn() == true){
                Log.d("jamal", story.toString());
                Intent i = new Intent(this, ThirdActivity.class);

                startActivity(i);;
            }
        }



    



}







