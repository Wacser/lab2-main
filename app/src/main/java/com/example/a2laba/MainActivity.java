package com.example.a2laba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Phaser phaser;
    private Button btn_gen;
    private TextView tv;
    private TextView tv_resault;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phaser = new Phaser();
        str = phaser.PhraserGen();

        tv = (TextView) findViewById(R.id.tv_resault);
        tv_resault = (TextView) findViewById(R.id.tv_resault);
        btn_gen = findViewById(R.id.btn_gen);



        btn_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = phaser.PhraserGen();
                tv.setText("Все что нам нужно - это " + str+".");
                tv_resault.setText(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() + " - это все что нам нужно.");
            }
        });
        tv.setText("Все что нам нужно - это " + phaser.PhraserGen()+".");
        tv_resault.setText(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() + " - это все что нам нужно.");
    }
}