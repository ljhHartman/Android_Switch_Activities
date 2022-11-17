package com.ssl.switchactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    Button btnGoToFirstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get Layout
        setContentView(R.layout.activity_second);

        // Get Button
        btnGoToFirstActivity = findViewById(R.id.btnGoToFirstActivity);

        // Set Button Action
        btnGoToFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Execute Activity
                switchActivities();
            }
        });

        // retrieve data from the previous page
        retrieveMessage();
    }


    private void switchActivities() {
        // Switch to Page "FirstActivity.class"
        Intent switchActivityIntent = new Intent(this, FirstActivity.class);
        startActivity(switchActivityIntent);
    }


    private void retrieveMessage() {
        // Get migrated data from the previous page
        System.out.println(getIntent().getStringExtra("message"));
    }

}
