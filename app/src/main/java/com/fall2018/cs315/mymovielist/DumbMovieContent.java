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

    private static final string 1movieTitle ="Epic Gamer Movie";
    private static final String 1movieDescription = " Okay so two gamers unite to create the most epic game off in all of time. But who will be the most epic gamer. \n";
    private static final String 1movieYear = "2012";
    private static final String 1movieImage = "EpicGamerNerdPose";
    private static final String 1movieWeblink = "https://www.eventcinemas.com.au/Movies/NowShowing";

    private static final String 1actionTitle = "Epic Fail Movie";
    private static final String 1actionDescription = "So two guys from Minnesota stumble upon a forbidden pack of cigarretes, which they accidently smoke, and epic fail. \n just say no to drugs!";
    private static final String 1actionYear = "2012";
    private static final String 1actionImage = "EpicFailImage";
    private static final String 1actionWeblink = "https://www.moonlight.com.au/";

    private static final String 2actionTitle = "Epic Love Movie";
    private static final String 2actionDescription = "So two lovers are in love, but have an epic story to go along with it!";
    private static final String 2actionYear = "2012";
    private static final String 2actionImage = "EpicHeartImage";
    private static final String 2actionWeblink = "https://www.imdb.com/";

    private static final String 3actionTitle = "Epic Moves Movie";
    private static final String 3actionDescription = "So two dudes are riding a skateboard and make some Seriously epic moves.";
    private static final String 3actionYear = "2012";
    private static final String 3actionImage = "EpicMoveImage";
    private static final String 3actionWeblink = "http://www.pccmovies.com/location/3906/Abilene-PREMIERE-LUX-Cine-10-Abilene-Mall";

    private static final String 3actionTitle = "Epic Wow Movie";
    private static final String 3actionDescription = "So two dudes are really saying Wow in response to an epic plot that unfolds before them.";
    private static final String 3actionYear = "2012";
    private static final String 3actionImage = "EpicWowImage";
    private static final String 3actionWeblink = "http://www.pccmovies.com/location/3906/Abilene-PREMIERE-LUX-Cine-10-Abilene-Mall";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel action = new MovieModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MovieModel romcom = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);

        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(romcom);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
