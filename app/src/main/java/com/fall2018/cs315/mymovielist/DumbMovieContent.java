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

    private static final String movie1Title = "Generic Rom Com";
    private static final String movie1Description = "Naturally, focuses on 2 people who really shouldn’t be together. It somehow becomes mutually advantageous for them to be together, or perhaps, they are interested in each other but their romance is based on false pretenses. Because the leads generally have no charisma, they each need a zany best friend who inserts dirty jokes wherever necessary. The two leads will fall in love in an extended music montage set to the music of Sixpence None the Richer. Once they find out about the false pretenses, they will take some time apart but realize how much they care for the other. Then comes “The Chase,” which can either be in an airport (not legal anymore), in traffic or somehow on boats. \n \nYou've seen this before, but not with these two actors!";
    private static final String movie1Year = "2015";
    private static final String movie1Image = "genericromcom";
    private static final String movie1Weblink = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    private static final String actionTitle = "Every Action Movie Ever";
    private static final String actionDescription = "The villain has left the hero for dead, or killed the hero’s brother, sister, parents, wife or family pets. Filled with righteous fury, the hero tools up and embarks on a bloody rampage.  \n \nIf the movie does well, we will do it again in the sequel! \n \nMaybe the villain tries to get revenge on the hero for getting revenge on the villain in this movie...";
    private static final String actionYear = "2017";
    private static final String actionImage = "genericaction";
    private static final String actionWeblink = "http://www.denofgeek.com/us/movies/18824/the-5-most-common-action-movie-plots";


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
    //hey its matt
}
