package com.example.project2spring20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MoreInfoActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_info_layout);
        Intent moreInfoIntent = getIntent();
        int imageId = moreInfoIntent.getIntExtra("imageId", 0);
        Log.i("moreimageid", Integer.toString(imageId));
        Log.i("real", Integer.toString(R.drawable.irishman_small));
        String[] movieInfoArray = DataMap.moreInfoMap.get(imageId);
        TextView name = findViewById(R.id.more_info_name);
        TextView year = findViewById(R.id.more_info_year);
        TextView ratings = findViewById(R.id.more_info_ratings);
        TextView cast = findViewById(R.id.more_info_cast);
        TextView director = findViewById(R.id.more_info_director);
        TextView duration = findViewById(R.id.more_info_duration);

        name.setText("Name:  "+movieInfoArray[0]);
        year.setText("Year:  "+ movieInfoArray[1]);
        duration.setText("Duration:  "+ movieInfoArray[2]);
        director.setText("Director:  "+ movieInfoArray[3]);
        cast.setText("Cast:  "  +movieInfoArray[4]);
        ratings.setText("Ratings:  "+  movieInfoArray[5]);
    }
}
