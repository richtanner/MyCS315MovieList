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

    private static final String movie0Title = "Star Wars: Episode V The Empire Strikes Back";
    private static final String movie0Description = "It's a Star Wars movie made before Disney took over in the 21st century. It is sci-fi in case you didn't know and if you haven' heard of Star Wars then....have you been living under a rock?";
    private static final String movie0Year = "1980";
    private static final String movie0Image = "starWarsEmpireStrikesBack";
    private static final String movie0WebLink = "https://www.starwars.com/films/star-wars-episode-v-the-empire-strikes-back";

    private static final String movie1Title = "Generic Rom Com";
    private static final String movie1Description = "Naturally, focuses on 2 people who really shouldn’t be together. It somehow becomes mutually advantageous for them to be together, or perhaps, they are interested in each other but their romance is based on false pretenses. Because the leads generally have no charisma, they each need a zany best friend who inserts dirty jokes wherever necessary. The two leads will fall in love in an extended music montage set to the music of Sixpence None the Richer. Once they find out about the false pretenses, they will take some time apart but realize how much they care for the other. Then comes “The Chase,” which can either be in an airport (not legal anymore), in traffic or somehow on boats. \n \nYou've seen this before, but not with these two actors!";
    private static final String movie1Year = "2015";
    private static final String movie1Image = "genericromcom";
    private static final String movie1Weblink = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    /*private static final String movie2Title = "Star Wars ":
    private static final String movie2Description = "";
    private static final String movie2Year = "";
    private static final String movie2Image = "";
    private static final String movie2WebLink = "";

    private static final String movie3Title = "Rogue One: A Star Wars Story":
    private static final String movie3Description = "It's a Star Wars movie made by Disney, what else do you want to know? It's a sci-fi movie that is entertaining but certainly not the best out of all the Star Wars movie's.";
    private static final String movie3Year = "2016";
    private static final String movie3Image = "starWarsRogueOne";
    private static final String movie3WebLink = "https://www.starwars.com/films/rogue-one";

    private static final String movie4Title = "":
    private static final String movie4Description = "";
    private static final String movie4Year = "";
    private static final String movie4Image = "";
    private static final String movie4WebLink = "";*/

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
