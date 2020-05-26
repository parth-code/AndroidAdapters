package com.example.project2spring20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CustomAdapter extends BaseAdapter {

    public static int height = 600;
    public static int width = 500;
    public static int padding = 10;



    private Context context;
    private List<Integer> imageIds;
    private Map<Integer, String> movieNames;
    private Map<Integer, String> movieYears;

    //    Constructor
    public CustomAdapter(Context c, Map<Integer, String> movieNameMap, Map<Integer, String> movieYearMap){
        context = c;

        Object[] objArray = movieNameMap.keySet().toArray();

        imageIds = Arrays.asList(
                Arrays.copyOf(objArray, objArray.length, Integer[].class)
        );
        movieNames = movieNameMap;
        movieYears = movieYearMap;

    }

    @Override
    public int getCount() {
        return imageIds.size();
    }

    @Override
    public Object getItem(int position) {
        return imageIds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return imageIds.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//      For regenerating layout after recycling
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.movie_item_layout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.small_poster);
        TextView textView1 = convertView.findViewById(R.id.movieTitle);
        TextView textView2 = convertView.findViewById(R.id.movieYear);
        textView1.setText(movieNames.get(imageIds.get(position)));
        textView2.setText(movieYears.get(imageIds.get(position)));
        imageView.setImageResource(imageIds.get(position));

        return convertView;
    }

}
