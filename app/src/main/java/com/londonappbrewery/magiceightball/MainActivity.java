package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link askButton(button) and ballDisplay(img) to java code using findViewById
        final ImageView ballDisplay = findViewById(R.id.ballDisplay);
        Button askButton = findViewById(R.id.askButton);

        TextView banner = findViewById(R.id.textView_banner);
        banner.setShadowLayer(8,0,0, Color.BLACK);

        //int arr to store 8ball images
        final int[] ballArr = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        //onclick listener for ask button
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create rand int to use for ball display
                Random randInt = new Random();
                int num = randInt.nextInt(5);

                //set ballDisplay to be random
                ballDisplay.setImageResource(ballArr[num]);
            }
        });
    }
}
