package com.fall2018.cs315.mymovielist;

// hey i changed something

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

    private static final String movie1Title = "Spider-Man Homecoming";
    private static final String movie1Description = "Peter Parker balances his life as an ordinary high school student in Queens with his superhero\nalter-ego Spider-Man, and finds himself on the trail of a new menace prowling the skies of New\nYork City.";
    private static final String movie1Year = "2017";
    private static final String movie1Image = "spider-man";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt2250912/";

    private static final String movie2Title = "Avengers: Infinity War";
    private static final String movie2Description = "The Avengers and their allies must be willing to sacrifice all in an\nattempt to defeat the powerful Thanos before his blitz of\ndevastation and ruin puts an end to the universe.";
    private static final String movie2Year = "2018";
    private static final String movie2Image = "infinity-war";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt4154756/";

    private static final String movie3Title = "Captain America: Civil War";
    private static final String movie3Description = "Political involvement in the Avengers' activities causes a rift between Captain America and\nIron Man.";
    private static final String movie3Year = "2016";
    private static final String movie3Image = "civil-war";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt3498820/";

    private static final String movie4Title = "Guardians of the Galaxy";
    private static final String movie4Description = "A group of intergalactic criminals are forced to work together to stop a fanatical warrior from\ntaking control of the universe.";
    private static final String movie4Year = "2014";
    private static final String movie4Image = "gotg";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt2015381/";

    private static final String movie5Title = "Thor: Ragnarok";
    private static final String movie5Description = "Thor is imprisoned on the planet Sakaar, and must race against time to return to Asgard and\nstop Ragnarök, the destruction of his world, at the hands of the powerful and ruthless\nvillain Hela.";
    private static final String movie5Year = "2017";
    private static final String movie5Image = "thor-ragnarok";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt3501632/";


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

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
