package com.example.lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Runnable mGoNext = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        super.onResume();
        gotoNextPage();
    }

    private void gotoNextPage() {
        TextView textView = findViewById(R.id.tv_main);
        textView.setText("3秒后进入下一个页面");
        new Handler().postDelayed(mGoNext, 3000);
    }
}