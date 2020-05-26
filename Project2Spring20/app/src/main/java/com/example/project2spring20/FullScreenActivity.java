package com.example.project2spring20;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class FullScreenActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_screen_image);
//        Log.i("FullScreenActivity" , "Entered Activity");

        Intent showFullScreenImage = getIntent();
        final ImageView fullScreenView = findViewById(R.id.fullscreen);


        final int imageId = DataMap.imageMap.get(showFullScreenImage.getIntExtra("imageId", 0));

//        Log.i("FullScreenActivity", Integer.toString(imageId));
        fullScreenView.setImageResource(imageId);
        fullScreenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              Removed reference to image to save RAM
                fullScreenView.setImageResource(0);
                Uri url = Uri.parse(DataMap.imdbLinkMap.get(imageId));
                Intent imdbIntent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(imdbIntent);
            }
        });
//        fullScreenView.setImageResource();
//        showFullScreenImage.getIntExtra("imageId", 0);
    }
}
