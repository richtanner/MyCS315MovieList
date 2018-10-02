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

    private static final String movie1Title = "La La Land";
    private static final String movie1Description = "It stars Ryan Gosling as a jazz pianist and Emma Stone as an aspiring actress, both of whom meet and fall in love in Los Angeles while pursuing their dreams.";
    private static final String movie1Year = "2016";
    private static final String movie1Image = "LaLALandCoverArt";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt3783958/";

    private static final String actionTitle = "The Room";
    private static final String actionDescription = "In San Francisco, we follow Johnny, a man who has a girlfriend, Lisa, and also his best friend, Mark. Lisa has been cheating on Johnny with Mark and Johnny doesn't know! Will Johnny ever find out? Will Mark still be Johnny's best friend?";
    private static final String actionYear = "2003";
    private static final String actionImage = "theroom";
    private static final String actionWeblink = "https://www.imdb.com/title/tt0368226/";

    private static final String InceptionTitle = "Inception";
    private static final String InceptionDescription = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.";
    private static final String InceptionYear = "2010";
    private static final String InceptionImage = "inceptionposter";
    private static final String InceptionWeblink = "https://www.imdb.com/title/tt1375666/";

    private static final String BebopTitle = "Cowboy Bebop: The Movie";
    private static final String BebopDescription = "A terrorist explosion releases a deadly virus on the masses, and it's up the bounty-hunting Bebop crew to catch the cold-blooded culprit.";
    private static final String BebopYear = "2001";
    private static final String BebopImage = "bebop";
    private static final String BebopWeblink = "https://www.imdb.com/title/tt0275277/";

    private static final String CloverfieldTitle = "Cloverfield";
    private static final String CloverfieldDescription = "A group of friends venture deep into the streets of New York on a rescue mission during a rampaging monster attack.";
    private static final String CloverfieldYear = "2008";
    private static final String CloverfieldImage = "cloverfield";
    private static final String CloverfieldWeblink = "https://www.imdb.com/title/tt1060277/";


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
