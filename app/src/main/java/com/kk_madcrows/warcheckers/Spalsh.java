package com.kk_madcrows.warcheckers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class Spalsh extends Activity {
    VideoView videoView;TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_spalsh);
        videoView=(VideoView) findViewById(R.id.videoView);
      skip=findViewById(R.id.skip);
        Context context = this;
        PackageManager pm = context.getPackageManager();
        Uri video1 = Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.splash); //do not add any extension
        videoView.setMediaController(null);
        videoView.setVideoURI(video1);
        videoView.requestFocus();
        videoView.start();
        videoView.setZOrderOnTop(true);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
               /* if (music_was_playing) {
                    Intent i = new Intent("com.android.music.musicservicecommand");
                    i.putExtra("command", "play");
                    sendBroadcast(i);
                }*/

                Intent i=new Intent(Spalsh.this,MainActivityP.class);
                i.putExtra("second",getIntent().getStringExtra("second"));
                i.putExtra("first",getIntent().getStringExtra("first"));
                startActivity(i);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                Intent i=new Intent(Spalsh.this,MainActivityP.class);
                i.putExtra("second",getIntent().getStringExtra("second"));
                i.putExtra("first",getIntent().getStringExtra("first"));
                startActivity(i);
            }
        });
    }
}
