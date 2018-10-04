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

    private static final String movie1Title = "August Rush";
    private static final String movie1Description = "A drama with fairy tale elements, where an orphaned musical prodigy uses his gift as a clue to finding his birth parents.";
    private static final String movie1Year = "2007";
    private static final String movie1Image = "august_rush";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0426931/";

    private static final String movie2Title = "Cat Ballou";
    private static final String movie2Description = "A woman seeking revenge for her murdered father hires a famous gunman, but he's very different from what she expects.";
    private static final String movie2Year = "1965";
    private static final String movie2Image = "cat_ballou";
    private static final String movie2WebLink = "https://www.imdb.com/title/tt0059017/?ref_=fn_al_tt_1";

    private static final String movie3Title = "Gravity";
    private static final String movie3Description = "Dr. Ryan Stone, a brilliant medical engineer on her first Shuttle mission, with veteran astronaut Matt Kowalsky in command of his last flight before retiring. /nBut on a seemingly routine spacewalk, disaster strikes. The Shuttle is destroyed, leaving Stone and Kowalsky completely alone-tethered to nothing but each other and spiraling out into the blackness of space. /nThe deafening silence tells them they have lost any link to Earth and any chance for rescue. As fear turns to panic, every gulp of air eats away at what little oxygen is left. /nBut the only way home may be to go further out into the terrifying expanse of space.";
    private static final String movie3Year = "2013";
    private static final String movie3Image = "gravity";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt1454468/?ref_=nv_sr_2";

    private static final String movie4Title = "Megan Leavey";
    private static final String movie4Description = "The true story of Marine Corporal Megan Leavey, who forms a powerful bond with an aggressive combat dog, Rex. /nWhile deployed in Iraq, the two complete more than 100 missions and save countless lives, until an IED explosion puts their faithfulness to the test.";
    private static final String movie4Year = "2017";
    private static final String movie4Image = "megan_leavey";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt4899370/?ref_=nv_sr_1";

    private static final String movie5Title = "V for Vendetta";
    private static final String movie5Description = "In a world in which Great Britain has become a fascist state, a masked vigilante known only as 'V' conducts guerrilla warfare against the oppressive British government. /nWhen 'V' rescues a young woman from the secret police, he finds in her an ally with whom he can continue his fight to free the people of Britain.";
    private static final String movie5Year = "2006";
    private static final String movie5Image = "v";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0434409/?ref_=nv_sr_1";



    /*comment to make a change*/


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel movie1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel movie2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2WebLink);
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
