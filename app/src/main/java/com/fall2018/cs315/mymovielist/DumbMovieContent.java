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
    // mercantilism


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final string 1movieTitle ="Lord of the rings 1";
    private static final String 1movieDescription = "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.";
    private static final String 1movieYear = "2001";
    private static final String 1movieImage = "Frodo";
    private static final String 1movieWeblink = "https://www.imdb.com/title/tt0120737/?ref_=nv_sr_1";

    private static final String 1actionTitle = "Lord of the rings 2";
    private static final String 1actionDescription = "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.";
    private static final String 1actionYear = "2002";
    private static final String 1actionImage = "Legolas";
    private static final String 1actionWeblink = "https://www.imdb.com/title/tt0167261/?ref_=nv_sr_3";

    private static final String 2actionTitle = "Lord of the rings 3";
    private static final String 2actionDescription = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.";
    private static final String 2actionYear = "2003";
    private static final String 2actionImage = "Gandalf";
    private static final String 2actionWeblink = "https://www.imdb.com/title/tt0167260/?ref_=nv_sr_1";

    private static final String 3actionTitle = "Cars 1";
    private static final String 3actionDescription = "A hot-shot race-car named Lightning McQueen gets waylaid in Radiator Springs, where he finds the true meaning of friendship and family.";
    private static final String 3actionYear = "2006";
    private static final String 3actionImage = "McQueen";
    private static final String 3actionWeblink = "https://www.imdb.com/title/tt0317219/?ref_=fn_al_tt_1";

    private static final String 4actionTitle = "Cars 2";
    private static final String 4actionDescription = "Star race car Lightning McQueen and his pal Mater head overseas to compete in the World Grand Prix race. But the road to the championship becomes rocky as Mater gets caught up in an intriguing adventure of his own: international espionage.";
    private static final String 4actionYear = "2011";
    private static final String 4actionImage = "Mator";
    private static final String 4actionWeblink = "https://www.imdb.com/title/tt1216475/?ref_=fn_al_tt_1";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel LOTR1 = new MovieModel(1movieTitle, 1movieDescription, 1movieYear, 1movieImage, 1movieWeblink);
        MovieModel LOTR2 = new MovieModel(1actionTitle, 1actionDescription, 1actionYear,1actionImage, 1actionWeblink);
        MovieModel LOTR3 = new MovieModel(2actionTitle, 2actionDescription, 2actionYear,2actionImage, 2actionWeblink);
        MovieModel Cars1 = new MovieModel(3actionTitle, 3actionDescription, 3actionYear,3actionImage, 3actionWeblink);
        MovieModel Cars1 = new MovieModel(4actionTitle, 4actionDescription, 4actionYear,4actionImage, 4actionWeblink);

        // add EACH movie object to our lists and maps
        addMovieToList(LOTR1);
        addMovieToList(LOTR2);
        addMovieToList(LOTR3);
        addMovieToList(Cars1);
        addMovieToList(Cars2);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
