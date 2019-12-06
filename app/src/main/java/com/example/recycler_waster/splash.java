package com.example.recycler_waster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {
    Handler handler =new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


    inicio();

    }


    public void inicio (){
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent=new Intent( splash.this, com.example.recycler_waster.MainActivity.class);
            startActivity(intent);
            finish();
        }
    }, 2000);
}
}
