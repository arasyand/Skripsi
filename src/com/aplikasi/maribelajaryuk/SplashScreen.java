package com.aplikasi.maribelajaryuk;

import com.aplikasi.maribelajaryuk.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class SplashScreen extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashsreen);
 
        Thread myThread = new Thread(){
            public void run(){
                try {
                    // splash screen will show for 2 seconds
                    sleep(2000);
                    finish();
                    /* after showing the splash screen,
                     *  the MainActivity will be started through an intent */
                    Intent main = new Intent(SplashScreen.this, HomeActivity.class);
                    startActivity(main);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
 
}
