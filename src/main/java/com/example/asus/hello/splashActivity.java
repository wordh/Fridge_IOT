package com.example.asus.hello;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashActivity.this.startActivity(new Intent(splashActivity.this,RealActivity.class));
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                splashActivity.this.finish();
            }
        },2000); // 2500 = 2.5seconds

    }
}
