package com.example.swipevideo1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        final ViewPager2 videoViewPager = findViewById(R.id.videosViewPager);

        //these are the videos for the app

        List<VideoItem> videoItemsList = new ArrayList<>();
        VideoItem videoCelebration = new VideoItem();
        videoCelebration.videoURL = "https://firebasestorage.googleapis.com/v0/b/fir-connection-2079f.appspot.com/o/RPReplay_Final1729218731.mov?alt=media&token=12427cd3-1425-400f-854c-a80330eafd9d";
        videoCelebration.videoTitle = "Cool Birds!";
        videoCelebration.videoDescription = "Can your dance better than these birds? lol";
        videoItemsList.add(videoCelebration);

        VideoItem videoMotivation = new VideoItem();
        videoMotivation.videoURL = "https://firebasestorage.googleapis.com/v0/b/fir-connection-2079f.appspot.com/o/RPReplay_Final1729218906.mov?alt=media&token=2352c163-6c64-4527-83d7-e046c994dcdf";
        videoMotivation.videoTitle = "Soccer Skills";
        videoMotivation.videoDescription = "Future soccer player, with a lot of practice you can do this trick too!";
        videoItemsList.add(videoMotivation);

        VideoItem videoMotivation2 = new VideoItem();
        videoMotivation2.videoURL = "https://firebasestorage.googleapis.com/v0/b/fir-connection-2079f.appspot.com/o/RPReplay_Final1729219382.mov?alt=media&token=392e4de4-c161-48ba-a58b-f896c21094be ";
        videoMotivation2.videoTitle = "Who does it better? ";
        videoMotivation2.videoDescription = "Some of the world best football players, who do you think is better? ";
        videoItemsList.add(videoMotivation2);

        videoViewPager.setAdapter(new VideoAdapter(videoItemsList));

    }

}