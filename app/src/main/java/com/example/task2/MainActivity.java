package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rb1, rb2, rb3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.rbTiger);
        rb2 = findViewById(R.id.rbSnake);
        rb3 = findViewById(R.id.rbBird);
        imageView = findViewById(R.id.imgView);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.rbTiger:
                imageView.setImageResource(R.drawable.one);
                break;
            case R.id.rbSnake:
                imageView.setImageResource(R.drawable.two);
                break;
            case R.id.rbBird:
                imageView.setImageResource(R.drawable.three);
                break;

        }
    }
}

