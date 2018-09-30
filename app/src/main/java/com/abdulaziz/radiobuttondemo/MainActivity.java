package com.abdulaziz.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnShow;
    private RadioGroup genderRadioGroup;
    private RadioButton genderButton;
    private TextView txtShow, txtAge;
    private SeekBar ageSeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.btn_show);
        genderRadioGroup = findViewById(R.id.rdgrp_gender);
        txtShow = findViewById(R.id.txt_show);
        txtAge = findViewById(R.id.txt_age);
        ageSeekBar = findViewById(R.id.age_seekbar);



        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioButtonId = genderRadioGroup.getCheckedRadioButtonId();
                genderButton = findViewById(radioButtonId);
                String gender = genderButton.getText().toString();
                txtShow.setText("You are "+gender);
            }
        });




        ageSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtAge.setText("Your age is "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
