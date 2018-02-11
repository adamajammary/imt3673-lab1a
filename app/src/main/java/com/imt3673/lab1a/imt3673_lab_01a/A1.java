package com.imt3673.lab1a.imt3673_lab_01a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import golab1a.Golab1a;

/**
 * Activity 1
 */
public class A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }

    /**
     * Switch over to A2 and pass the inputted text and the hashed result
     */
    public void switchToA2(View view) {
        Intent   intent = new Intent(this, A2.class);
        Spinner  l1     = findViewById(R.id.L1);
        EditText t1     = findViewById(R.id.T1);

        if ((l1 == null) || (t1 == null))
            throw new NullPointerException("Failed to find the required components L1 or T1.");

        String   text   = t1.getText().toString();
        String   method = (String)l1.getSelectedItem();
        String   hashed = Golab1a.hashText(text, method);

        intent.putExtra(Constants.ORIGINAL_TEXT, text);
        intent.putExtra(Constants.HASHED_TEXT,   hashed);
        intent.putExtra(Constants.HASH_METHOD,   method);

        startActivity(intent);
    }
}
