package com.itbank.fragment01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveActivity(View view){
        Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
        startActivity(intent);
    }
}
