package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView2;
    Button backButton;
    private Intent b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get data from Intent i, originally from MainActivity
        Intent i = getIntent();
        String s = i.getExtras().getString( "testString");

        textView2 = findViewById(R.id.textView2);
        textView2.setText(s);
        backButton = findViewById(R.id.goBackButton);

        //Create Intent to go back to MainActivity
        b = new Intent(this, MainActivity.class);

        //When button is clicked Intent b will activate
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(b);
            }
        });
    }
}
