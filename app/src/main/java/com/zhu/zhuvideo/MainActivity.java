package com.zhu.zhuvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.zhu.videolibrary.widget.media.IjkVideoView;

public class MainActivity extends AppCompatActivity {

    private IjkVideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.ijkplayer);
        findViewById(R.id.btn_init).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //默认的 .so 文件不支持https协议的视频
                Uri uri = Uri.parse("https://vd2.bdstatic.com/mda-ik4wajw52ycrmvxh/mda-ik4wajw52ycrmvxh.mp4");
                videoView.setVideoURI(uri);
            }
        });
        findViewById(R.id.btn_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (videoView.isPlaying()) {
                    videoView.pause();
                } else {
                    videoView.start();
                }
            }
        });
    }
}