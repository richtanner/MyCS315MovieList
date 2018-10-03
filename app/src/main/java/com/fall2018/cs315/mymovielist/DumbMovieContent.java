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

    private static final String upTitle = "UP";
    private static final String upDescription = "Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.";
    private static final String upYear = "2009";
    private static final String upImage = "up";
    private static final String upWeblink = "https://www.imdb.com/title/tt1049413/";

    private static final String incrediblesTitle = "Incredibles";
    private static final String incrediblesDescription = "A family of undercover superheroes, while trying to live the quiet suburban life, are forced into action to save the world.";
    private static final String incrediblesYear = "2004";
    private static final String incrediblesImage = "incredibles";
    private static final String incrediblesWeblink = "https://www.imdb.com/title/tt0317705/";

    private static final String findingnemoTitle = "Finding Nemo";
    private static final String findingnemoDescription = "After his son is captured in the Great Barrier Reef and taken to Sydney, a timid clownfish sets out on a journey to bring him home.";
    private static final String findingnemoYear = "2003";
    private static final String findingnemoImage = "finding_nemo";
    private static final String findingnemoWeblink = "https://www.imdb.com/title/tt0266543/";

    private static final String carsTitle = "Cars";
    private static final String carsDescription = "A hot-shot race-car named Lightning McQueen gets waylaid in Radiator Springs, where he finds the true meaning of friendship and family.";
    private static final String carsYear = "2006";
    private static final String carsImage = "cars";
    private static final String carsWeblink = "https://www.imdb.com/title/tt0317219/";

    private static final String bugslifeTitle = "A Bug's Life";
    private static final String bugslifeDescription = "A misfit ant, looking for \"warriors\" to save his colony from greedy grasshoppers, recruits a group of bugs that turn out to be an inept circus troupe.";
    private static final String bugslifeYear = "1998";
    private static final String bugslifeImage = "bugslife";
    private static final String bugslifeWeblink = "https://www.imdb.com/title/tt0120623/";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        //empty array
        ITEM_MAP.clear();
        MOVIES.clear();

        // make those movie objects
        MovieModel up = new MovieModel(upTitle, upDescription, upYear, upImage, upWeblink);
        MovieModel incredibles = new MovieModel(incrediblesTitle, incrediblesDescription, incrediblesYear, incrediblesImage, incrediblesWeblink);
        MovieModel findingnemo = new MovieModel(findingnemoTitle, findingnemoDescription, findingnemoYear, findingnemoImage, findingnemoWeblink);
        MovieModel cars = new MovieModel(carsTitle, carsDescription, carsYear, carsImage, carsWeblink);
        MovieModel bugslife = new MovieModel(bugslifeTitle, bugslifeDescription, bugslifeYear, bugslifeImage, bugslifeWeblink);

        // add EACH movie object to our lists and maps
        addMovieToList(up);
        addMovieToList(incredibles);
        addMovieToList(findingnemo);
        addMovieToList(cars);
        addMovieToList(bugslife);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
