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
    public int count = 0;

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = "How to lose a guy in 10 days";
    private static final String movie1Description = "Benjamin Barry is an advertising executive and ladies' man who, to win a big campaign, bets that he can make a woman fall in love with him in 10 days. Andie Anderson covers the \"How To\" beat for \"Composure\" magazine and is assigned to write an article on \"How to Lose a Guy in 10 days.\" ";
    private static final String movie1Year = "2013";
    private static final String movie1Image = "romcom";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt0251127/";

    private static final String actionTitle = "LOTR";
    private static final String actionDescription = "The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. \n But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. \nA daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged.";
    private static final String actionYear = "2001";
    private static final String actionImage = "Lord";
    private static final String actionWeblink = "https://www.imdb.com/title/tt0120737/";

    private static final String pixarTitle = "Cars 3";
    private static final String pixarDescription = "Cars 3 is a 2017 American 3D computer-animated comedy-adventure film produced by Pixar Animation Studios and released by Walt Disney Pictures. ... \n \n In the film, Lightning McQueen sets out to prove to a new generation of high tech race cars that he is still the best race car in the world.";
    private static final String pixarYear = "2017";
    private static final String pixarImage = "cars";
    private static final String pixarWeblink = "https://www.imdb.com/title/tt3606752/plotsummary";

    private static final String lionTitle = "Lion King";
    private static final String lionDescription = "This Disney animated feature follows the adventures of the young lion Simba (Zoe Leader), the heir of his father, Mufasa (Ernie Sabella). \nSimba's wicked uncle, Scar (Rowan Atkinson), plots to usurp Mufasa's throne by luring father and son into a stampede of wildebeests. But Simba escapes, and only Mufasa is killed. \n Simba returns as an adult (Jeremy Irons) to take back his homeland from Scar with the help of his friends Timon (Jonathan Taylor Thomas) and Pumbaa (Cheech Marin).";
    private static final String lionYear = "1994";
    private static final String lionImage = "lion";
    private static final String lionWebLink = "https://www.imdb.com/title/tt0110357/";

    private static final String spaceTitle = "Interstellar";
    private static final String spaceDescription = "In Earth's future, a global crop blight and second Dust Bowl are slowly rendering the planet uninhabitable.\n Professor Brand (Michael Caine), a brilliant NASA physicist, is working on plans to save mankind by transporting Earth's population to a new home via a wormhole. \nBut first, Brand must send former NASA pilot Cooper (Matthew McConaughey) and a team of researchers through the wormhole and across the galaxy to find out which of three planets could be mankind's new home.";
    private static final String spaceYear = "2014";
    private static final String spaceImage = "space";
    private static final String spaceWeblink = "https://www.imdb.com/title/tt0816692/";




    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel action = new MovieModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MovieModel romcom = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel pixar = new MovieModel(pixarTitle, pixarDescription, pixarYear, pixarImage, pixarWeblink);
        MovieModel space = new MovieModel(spaceTitle, spaceDescription, spaceYear, spaceImage, spaceWeblink);
        MovieModel lion = new MovieModel(lionTitle, lionDescription, lionYear, lionImage, lionWebLink);

        // add EACH movie object to our lists and maps
        if (count <= 0) {
            addMovieToList(action);
            addMovieToList(romcom);
            addMovieToList(pixar);
            addMovieToList(space);
            addMovieToList(lion);
            count++;
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
