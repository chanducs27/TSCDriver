package com.fantasik.tscdriver.tscdriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                }
            }
        };
        timerThread.start();
    }
}
