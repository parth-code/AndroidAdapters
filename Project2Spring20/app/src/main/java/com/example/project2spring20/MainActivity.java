package com.example.project2spring20;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.movieList);
        CustomAdapter customAdapter = new CustomAdapter(this, DataMap.movieNameMap, DataMap.movieYearMap);
        listView.setAdapter(customAdapter);

        registerForContextMenu(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent fullScreenIntent = new Intent(MainActivity.this, FullScreenActivity.class);
//                Log.i("id", Integer.toString(id));

                fullScreenIntent.putExtra("imageId", (int)id);
                startActivity(fullScreenIntent);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int position = adapterContextMenuInfo.position;
        Uri uri;
        switch (item.getItemId()){
            case R.id.more_info:
                Intent moreInfoIntent = new Intent(MainActivity.this, MoreInfoActivity.class);
                moreInfoIntent.putExtra("imageId", Integer.parseInt(DataMap.movieNameMap.keySet().toArray()[position].toString()));
                startActivity(moreInfoIntent);
                break;
            case R.id.trailer:
                uri = Uri.parse(DataMap.youtubeArray[position]);
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(youtubeIntent);
                break;
            case R.id.dir_wiki:
                uri = Uri.parse(DataMap.directorWikiArray[position]);
                Intent directorWikiIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(directorWikiIntent);
                break;
            case R.id.imdb:
                uri = Uri.parse(DataMap.imdbLinkMap.values().toArray()[position].toString());
                Intent imdbIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(imdbIntent);
                break;
        }

        return super.onContextItemSelected(item);
    }
}
