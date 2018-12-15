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

    private static final String movie1Title = "Avengers: Infinity War";
    private static final String movie1Description = "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe. ";
    private static final String movie1Year = "2018";
    private static final String movie1Image = "avengers.jpg";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt4154756/";

    private static final String movie2Title = "Shaun of the Dead";
    private static final String movie2Description = "A man decides to turn his moribund life around by winning back his ex-girlfriend, reconciling his relationship with his mother and dealing with an entire community that has returned from the dead to eat the living.";
    private static final String movie2Year = "2004";
    private static final String movie2Image = "shaun.jpg";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0365748/";

    private static final String movie3Title = "Spider-man: Homecoming";
    private static final String movie3Description = "Peter Parker balances his life as an ordinary high school student in Queens with his superhero alter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New York City.";
    private static final String movie3Year = "2017";
    private static final String movie3Image = "spiderman.jpg";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt2250912/";

    private static final String movie4Title = "Starship Troopers";
    private static final String movie4Description = "Humans in a fascist, militaristic future wage war with giant alien bugs in a satire of modern world politics.";
    private static final String movie4Year = "1997";
    private static final String movie4Image = "starshiptroopers.jpg";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt0120201/";

    private static final String movie5Title = "Avatar";
    private static final String movie5Description = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.";
    private static final String movie5Year = "2009";
    private static final String movie5Image = "avatar.jpg";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0499549/";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel movie2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
        MovieModel movie1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel movie3 = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
        MovieModel movie4 = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
        MovieModel movie5 = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(movie1);
        addMovieToList(movie2);
        addMovieToList(movie3);
        addMovieToList(movie4);
        addMovieToList(movie5);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
