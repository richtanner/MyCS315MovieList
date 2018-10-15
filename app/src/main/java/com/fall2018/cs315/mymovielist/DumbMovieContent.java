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

    private static final String movie1Title = "What we do in the Shadows";
    private static final String movie1Description = "A mockumentary following the lives of ancient vampires living in modern-day New Zealand as housemates. It's like the Lost Boys, but with a fun twist.";
    private static final String movie1Year = "2014";
    private static final String movie1Image = "poster1.jpg";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt3416742/";

    private static final String movie2Title = "Monty Python and the Holy Grail";
    private static final String movie2Description = "Do I even need to describe this movie? But just in case your annoying friends haven't already quoted the entire script to you, the movie follows King Arthur of the Britons on his quest to find the Holy Grail, but told from the same people who taught self defense against fruit.";
    private static final String movie2Year = "1975";
    private static final String movie2Image = "poster2.jpg";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0071853/";

    private static final String movie3Title = "Hot Fuzz";
    private static final String movie3Description = "From the director of Shawn of the Dead comes the second Cornetto movie in the trilogy: Hot Fuzz. A cop who takes everything seriously must be reassigned to a village where almost nothing happens, except for the occasional underage drinker, runaway swan, and shadowy killer. So should you see this movie? 'Yarp'";
    private static final String movie3Year = "2007";
    private static final String movie3Image = "poster3.jpg";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0425112/";

    private static final String movie4Title = "Top Secret!";
    private static final String movie4Description = "From the makers of 'Airplane!' comes a movie defined by similar charms and hijinks, only this time an American rock star named Nick Rivers is caught up the members of the resistaunce (french resistance) against East Germany. From cow disguises to chocolate mouse, this film has it all!";
    private static final String movie4Year = "1984";
    private static final String movie4Image = "poster4.jpg";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt0088286/";

    private static final String movie5Title = "Princess Bride";
    private static final String movie5Description = "A timeless story with love, swordfights, clever lines, battles of wits, revenge, this movie has everything. Seriously, if you haven't seen this movie at all, you're likely dead inside.";
    private static final String movie5Year = "1987";
    private static final String movie5Image = "poster5.jpg";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt0093779/";
    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        ITEM_MAP.clear();
        MOVIES.clear();

        // make those movie objects
        MovieModel movie1 = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel movie2 = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
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
