package com.mxplayer.mxplayerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mx_Music extends AppCompatActivity {

    MediaPlayer mp1, mp2, mp3;
    Button play1, play2, play3, pause1, pause2, pause3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mx_music);

        play1 = findViewById(R.id.play1);
        play2 = findViewById(R.id.play2);
        play3 = findViewById(R.id.play3);
        pause1 = findViewById(R.id.pause1);
        pause2 = findViewById(R.id.pause2);
        pause3 = findViewById(R.id.pause3);

        mp1 = MediaPlayer.create(Mx_Music.this, R.raw.lifeisgood);
        mp2 = MediaPlayer.create(Mx_Music.this, R.raw.whenigrowup);
        mp3 = MediaPlayer.create(Mx_Music.this, R.raw.stressedout);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(mp1 == null) {
                   mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                       @Override
                       public void onCompletion(MediaPlayer mediaPlayer) {

                       }
                   });
               }

               mp1.start();
            }
        });

        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1 != null) {
                    mp1.pause();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2 == null) {
                    mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {

                        }
                    });
                }
                mp1.stop();
                mp2.start();
            }
        });

        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2 != null) {
                    mp2.pause();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3 == null) {
                    mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {

                        }
                    });
                }
                mp2.stop();
                mp3.start();
            }
        });

        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3 != null) {
                    mp3.pause();
                }
            }
        });
    }
}