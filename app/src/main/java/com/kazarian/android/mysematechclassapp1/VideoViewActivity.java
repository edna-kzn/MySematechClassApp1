package com.kazarian.android.mysematechclassapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        String urlAddress = "https://hajifirouz2.cdn.asset.aparat.com/aparat-video/54123100b4216de584a3b2ec3b45910f29166708-144p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6IjVmMzZmNTZlY2Y4MGZkY2JhNzAwYTVlMWI0OWRiMjdmIiwiZXhwIjoxNjExMjI5NjQyLCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.bvtQyzI8hhQpoaUhIkYWafNec8wLoJYsZkDN9W00x6U";
        VideoView vvfilm = findViewById(R.id.vvfilm);
        vvfilm.setVideoURI(Uri.parse(urlAddress));
        vvfilm.setMediaController(new MediaController(VideoViewActivity.this));
        vvfilm.start();




    }
}