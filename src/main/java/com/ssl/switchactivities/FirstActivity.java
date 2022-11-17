package com.ssl.switchactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {
    Button btnGoToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get Layout
        setContentView(R.layout.activity_first);

        // Get Button
        btnGoToSecondActivity = findViewById(R.id.btnGoToSecondActivity);

        // Set Button Action
        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Execute Activity
                switchActivities();
            }
        });
    }


    private void switchActivities() {
        // Switch to Page "SecondActivity.class"
        Intent switchActivityIntent = new Intent(this, SecondActivity.class);

        // Migrate data to next page
        switchActivityIntent.putExtra("message", "Haha, I Migrated from the previous page!");

        startActivity(switchActivityIntent);
    }

}
