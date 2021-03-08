package io.github.arahmandc.android.limabd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN= 4000;

    Animation topAnim, midAnim, bottomAnim;
    ImageView image;
    TextView logo, slogan;

    MediaPlayer mysongs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        midAnim = AnimationUtils.loadAnimation(this,R.anim.middle_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);


        image.setAnimation(topAnim);
        logo.setAnimation(midAnim);
        slogan.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

        //play songs
        mysongs=MediaPlayer.create(MainActivity.this,R.raw.songs);
        mysongs.start();


    }


    //pause songs
//    @Override
//    protected void onPause(){
//        super.onPause();
//        mysongs.release();
//    }



}
