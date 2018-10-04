package com.fall2018.cs315.mymovielist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumbMovieContent {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MovieModel> ITEM_MAP = new HashMap<String, MovieModel>();

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie0Title = "Star Wars: Episode V";
    private static final String movie0Description = "It's a Star Wars movie made before Disney took over in the 21st century. It is sci-fi in case you didn't know and if you haven' heard of Star Wars then....have you been living under a rock?";
    private static final String movie0Year = "1980";
    private static final String movie0Image = "star_wars_v";
    private static final String movie0WebLink = "https://www.starwars.com/films/star-wars-episode-v-the-empire-strikes-back";

    private static final String movie1Title = "Star Wars: Episode VI";
    private static final String movie1Description = "It's another Star Wars movie made before Disney took over in the 21st century. It is sci-fi in case you didn't know and if you haven' heard of Star Wars then....have you been living under a rock?";
    private static final String movie1Year = "1983";
    private static final String movie1Image = "star_wars_vi";
    private static final String movie1WebLink = "https://www.starwars.com/films/star-wars-episode-vi-return-of-the-jedi/";

    private static final String movie2Title = "Star Wars: Episode VII";
    private static final String movie2Description = "This Star Wars release was the first under Disney and thus there was a lot of controversy over it. It's an alright movie, but I thought the ending was a bit disappointing, but I do think it helped their number for the next movie that they released.";
    private static final String movie2Year = "2015";
    private static final String movie2Image = "star_wars_vii";
    private static final String movie2WebLink = "https://www.starwars.com/films/star-wars-episode-vii-the-force-awakens";

    private static final String movie3Title = "Rogue One: A Star Wars Story";
    private static final String movie3Description = "A Star Wars movie that doesn't have \"Episode __\" in the title...innovation! This movie isn't sci-fi despite what you may think. I lied, it is sci-fi and if you thought different then, sorry.";
    private static final String movie3Year = "2016";
    private static final String movie3Image = "star_wars_rogue_one";
    private static final String movie3WebLink = "https://www.starwars.com/films/rogue-one";

    private static final String movie4Title = "Star Wars: Epsiode VIII";
    private static final String movie4Description = "The latest and more recent Star Wars movie that has \"Episode __\" in the title. It's the newest, which makes it the best, right? We'll just go along with that logic and not question it. Oh, it's also sci-fi just like all the others.";
    private static final String movie4Year = "2017";
    private static final String movie4Image = "star_wars_viii";
    private static final String movie4WebLink = "https://www.starwars.com/films/star-wars-episode-viii-the-last-jedi";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel romcom0 = new MovieModel(movie0Title, movie0Description, movie0Year, movie0Image, movie0WebLink);
        MovieModel romcom1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1WebLink);

        // add EACH movie object to our lists and maps
        addMovieToList(romcom0);
        addMovieToList(romcom1);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
