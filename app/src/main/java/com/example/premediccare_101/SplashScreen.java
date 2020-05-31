package com.example.premediccare_101;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Explode;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
public static int n=2000;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
            setContentView(R.layout.activity_splash_screen);
            final ImageView im= findViewById(R.id.splashlogo);
            im.setAlpha(0f);
            im.animate().alpha(1f).setDuration(2000);
            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                @Override
                public void run() {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this);
                    Explode explodeAnimation = new Explode();
                    explodeAnimation.setDuration(1000);
                    getWindow().setEnterTransition(explodeAnimation);
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent, options.toBundle());
                    finish();
                }
            },n);
        }
        catch (NullPointerException e){
            Log.d("No", "not a success");
        }
    }
}