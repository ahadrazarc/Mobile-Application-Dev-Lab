package com.example.lab02;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int ch=1;
    float font=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.textview);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font + 5;
                if(font == 50)
                    font = 30;
            }
        });
         Button b2 = (Button) findViewById(R.id.button2);
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 switch (ch)
                 {
                     case 1:
                         t.setTextColor(Color.RED);
                         break;
                     case 2:
                         t.setTextColor(Color.GREEN);
                         break;
                     case 3:
                         t.setTextColor(Color.BLUE);
                         break;
                 }
                 ch++;
                 if(ch==7)
                     ch =1;
             }
         });
    }
}