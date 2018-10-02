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

    //TROY ADAMS

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = "Finding Nemo";
    private static final String movie1Description = "What does a clown fish father do when his son is captured by divers? Find him! Experience a film so good that the animators had to tone down the ocean surface effect because it was too realistic!";
    private static final String movie1Year = "2003";
    private static final String movie1Image = "findingnemo";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0266543/";

    private static final String movie2Title = "Cars";
    private static final String movie2Description = "In a world... where everyone is a car... one racer has a chance to win the prestigious \"Piston Cup\"... but is thwarted... by an action figure of himself. THIS SUMMER... Watch if he can escape from hillbilly hell in time to compete!";
    private static final String movie2Year = "2006";
    private static final String movie2Image = "cars";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt0317219/";

    private static final String movie3Title = "Star Wars: A new hope";
    private static final String movie3Description = "Watch the most epic version of the hero's quest of the last century. Follow Luke Skywalker as he uncovers the mysteries of the force, and fights against the galactic federation.";
    private static final String movie3Year = "1977";
    private static final String movie3Image = "starwars";
    private static final String movie3Weblink = "//https://www.imdb.com/title/tt0076759/";

    private static final String movie4Title = "A Charlie Brown Christmas";
    private static final String movie4Description = "It's Christmas time, and Charlie Brown forgot what that really means. A wholesome family movie straight out of a comic strip!";
    private static final String movie4Year = "1965";
    private static final String movie4Image = "charliebrownchristmas";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt0059026/";

    private static final String movie5Title = "The Lego Movie";
    private static final String movie5Description = "The world of legos has been endangered by president business, and a chosen hero has risen up to find the piece of resistance and thwart his plans! Unfortunately, the chosen hero is nothing more than a normal lego civilian. Will he succeed and get the girl? Probably, but it'll be hilarious!";
    private static final String movie5Year = "2014";
    private static final String movie5Image = "legomovie";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt1490017/";

    private boolean haveIBeenCreated = false;

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        if(!haveIBeenCreated) {

            // make those movie objects
            MovieModel nemo = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
            MovieModel cars = new MovieModel(movie2Title, movie2Description, movie2Year, movie2Image, movie2Weblink);
            MovieModel starWars = new MovieModel(movie3Title, movie3Description, movie3Year, movie3Image, movie3Weblink);
            MovieModel charlieBrown = new MovieModel(movie4Title, movie4Description, movie4Year, movie4Image, movie4Weblink);
            MovieModel legoMovie = new MovieModel(movie5Title, movie5Description, movie5Year, movie5Image, movie5Weblink);

            // add EACH movie object to our lists and maps
            addMovieToList(nemo);
            addMovieToList(cars);
            addMovieToList(starWars);
            addMovieToList(charlieBrown);
            addMovieToList(legoMovie);

            haveIBeenCreated = true;
        }
        // no more movies to add?  Okay... return our list
        return MOVIES;

    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
