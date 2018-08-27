package com.example.justine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, R.string.main_bienvenue, Toast.LENGTH_LONG).show();

    }

    public void top(View view){

        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.scrollTo(0, 0);

        Toast.makeText(this, R.string.button_text, Toast.LENGTH_LONG).show();
    }
}
