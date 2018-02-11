package com.imt3673.lab1a.imt3673_lab_01a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Activity 2
 */
public class A2 extends AppCompatActivity {

    /**
     * Initialize text fields with data from A1
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        Intent   intent  = getIntent();
        String   text    = intent.getStringExtra(Constants.ORIGINAL_TEXT);
        String   hashed  = intent.getStringExtra(Constants.HASHED_TEXT);
        String   method  = intent.getStringExtra(Constants.HASH_METHOD);
        TextView t2      = findViewById(R.id.T2);
        TextView t3      = findViewById(R.id.T3);

        if ((t2 == null) || (t3 == null))
            throw new NullPointerException("Failed to find the required TextView items T2 or T3.");

        t2.setText(text);
        t3.setText(method + ": " + hashed);
    }

    /**
     * Close the app
     */
    public void close(View view) {
        finishAffinity();
    }
}
