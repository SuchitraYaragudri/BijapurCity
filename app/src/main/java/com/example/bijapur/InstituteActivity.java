package com.example.bijapur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstituteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute);

        TextView bldeaTextView = findViewById(R.id.textView8);
        bldeaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL("https://bldeacet.ac.in/");
            }
        });

        TextView risTextView = findViewById(R.id.textView11);
        risTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL("http://www.risvijayapur.in/");
            }
        });

        TextView mbaTextView = findViewById(R.id.textView12);
        mbaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL("https://mba.bldeaspcc.ac.in/");
            }
        });

        TextView tungalTextView = findViewById(R.id.textView9);
        tungalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openURL("https://www.tungalschools.com/");
            }
        });
    }

    public void openURL(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
