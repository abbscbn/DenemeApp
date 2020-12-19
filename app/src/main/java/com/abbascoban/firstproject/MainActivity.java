package com.abbascoban.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

main
public class MainActivity extends AppCompatActivity {

    TextView mTextView = (TextView) findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeImage(View view){
        ImageView imageView = findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.bodrum);
        mTextView.setText("Dalga Dalga Dalga Dalgalanıyor");
    }
}