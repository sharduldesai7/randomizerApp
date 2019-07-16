package com.example.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final TextView resultsTextView = findViewById(R.id.resultsTextView);
        final SeekBar seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = new Random().nextInt(seekBar.getProgress());
                String r = String.valueOf(random);
                resultsTextView.setText(r);
            }
        });
    }
}
