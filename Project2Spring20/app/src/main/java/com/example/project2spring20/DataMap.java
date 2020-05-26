package com.example.project2spring20;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataMap {
    public static Map<Integer, String> movieNameMap = new LinkedHashMap<Integer, String>(){{
        put(R.drawable.irishman_small, "Irishman");
        put(R.drawable.joker_small, "Joker");
        put(R.drawable.parasite_small, "Parasite");
        put(R.drawable.ouatih_small , "Once Upon a Time in Hollywood");
        put(R.drawable.twopopes, "Two Popes");
        put(R.drawable.onenineoneseven_small, "1917");
    }};
    public static Map<Integer, String> movieYearMap = new LinkedHashMap<Integer, String>(){{
        put(R.drawable.irishman_small, "2019");
        put(R.drawable.joker_small, "2019");
        put(R.drawable.parasite_small, "2019");
        put(R.drawable.ouatih_small , "2019");
        put(R.drawable.twopopes, "2019");
        put(R.drawable.onenineoneseven_small, "2019");
    }};

    public static Map <Integer, Integer> imageMap = new LinkedHashMap<Integer, Integer>() {{
        put(R.drawable.irishman_small, R.drawable.irishman);
        put(R.drawable.joker_small, R.drawable.joker);
        put(R.drawable.parasite_small, R.drawable.parasite);
        put(R.drawable.ouatih_small, R.drawable.ouatih);
        put(R.drawable.twopopes, R.drawable.twopopes_small);
        put(R.drawable.onenineoneseven_small, R.drawable.onenineoneseven);
    }};

    public static Map <Integer, String> imdbLinkMap = new LinkedHashMap<Integer, String>() {{
        put(R.drawable.irishman, "https://www.imdb.com/title/tt1302006/");
        put(R.drawable.joker, "https://www.imdb.com/title/tt7286456/");
        put(R.drawable.parasite, "https://www.imdb.com/title/tt6751668/");
        put(R.drawable.ouatih, "https://www.imdb.com/title/tt7131622/");
        put(R.drawable.twopopes_small, "https://www.imdb.com/title/tt8404614/");
        put(R.drawable.onenineoneseven, "https://www.imdb.com/title/tt8579674/");
    }};

    public static String[] youtubeArray = new String[]{
            "https://youtu.be/byIKRgihYrU",
            "https://youtu.be/zAGVQLHvwOY",
            "https://youtu.be/5xH0HfJHsaY",
            "https://youtu.be/ELeMaP8EPAA",
            "https://youtu.be/T5OhkFY1PQE",
            "https://youtu.be/gZjQROMAh_s"
    };

    public static String[] directorWikiArray = new String[]{
            "https://en.wikipedia.org/wiki/Martin_Scorsese",
            "https://en.wikipedia.org/wiki/Todd_Phillips",
            "https://en.wikipedia.org/wiki/Bong_Joon-ho",
            "https://en.wikipedia.org/wiki/Quentin_Tarantino",
            "https://en.wikipedia.org/wiki/Fernando_Meirelles",
            "https://en.wikipedia.org/wiki/Sam_Mendes"
    };

    public static Map <Integer, String[]> moreInfoMap = new LinkedHashMap<Integer, String[]>() {{
       put(R.drawable.irishman_small, new String[]{"Irishman", "2019", "3h 30m", "Martin Scorsese", "Robert De Niro, Al Pacino", "Roger Ebert: 3.5/4,  IMDb: 8/10"});
        put(R.drawable.joker_small, new String[]{"Joker", "2019", "2h 2min", "Todd Philips", "Joaquin Phoenix, Robert De Niro", "Roger Ebert: 2/4,  IMDb: 8.6/10"});
        put(R.drawable.parasite_small, new String[]{"Parasite", "2019", "2h 12min", "Bong Joon Ho", "Kang-ho Song, Sun-kyun Lee", "Roger Ebert: 4/4,  IMDb: 8.6/10"});
        put(R.drawable.ouatih_small, new String[]{"Once Upon a Time in Hollywood", "2019", "2h 41m", "Quentin Tarantino", "Leonardo DiCaprio, Brad Pitt", "Roger Ebert: 4/4,  IMDb: 7.7/10"});
        put(R.drawable.twopopes, new String[]{"Two Popes", "2019", "2h 5min", "Fernando Meirelles", "Anthony Hopkins, Jonathan Pryce", "Roger Ebert: 3.5/4,  IMDb: 7.6/10"});
       put(R.drawable.onenineoneseven_small, new String[]{"1917", "2019", "1h 59min", "Sam Mendes", "Dean-Charles Chapman, George MacKay", "Roger Ebert: 2.5/4,  IMDb: 8.4/10"});
    }};


}
