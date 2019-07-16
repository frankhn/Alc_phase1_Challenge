package com.example.alc_phase1_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.about);
        profile = findViewById(R.id.profile);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutActivity();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });
    }

    private void openProfileActivity() {
        Intent intent = new Intent(this, Profile.class);
        startActivityForResult(intent, 0);
    }

    private void openAboutActivity() {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
