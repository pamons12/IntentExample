package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Intent i;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.plain_text_input);

        button = findViewById(R.id.button);

        //Create new intent
        i = new Intent(this, SecondActivity.class);

        //When button is clicked activate intent and go to SecondActivity.class
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get text from input box and store it in the intent
                String s = editText.getText().toString();
                i.putExtra("testString", s);

                //Activate the intent
                startActivity(i);
            }
        });
    }
}