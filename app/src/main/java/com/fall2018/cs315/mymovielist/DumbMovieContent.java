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


    private static final String hitchHickersTitle = "Hitchhiker's";
    private static final String hitchHickersDescription = "Mere seconds before the Earth is to be demolished by an alien construction crew, journeyman Arthur Dent is swept off the planet by his friend Ford Prefect, a researcher penning a new edition of \"The Hitchhiker's Guide to the Galaxy.\"";
    private static final String hitchHickersYear = "2005";
    private static final String hitchHickersImage = "hitchhickers";
    private static final String hitchHickersWeblink = "https://www.imdb.com/title/tt0371724/";

    private static final String treasurePlanetTitle = "Treasure Planet";
    private static final String treasurePlanetDescription = "A Disney animated version of \"Treasure Island\". The only difference is that the film is set in outer space with alien worlds and other galactic wonders.";
    private static final String treasurePlanetYear = "2002";
    private static final String treasurePlanetImage = "treasure";
    private static final String treasurePlanetWeblink = "https://www.imdb.com/title/tt0133240/";

    private static final String piratesTitle = "Pirates of the Caribbean";
    private static final String piratesDescription = "Blacksmith Will Turner teams up with eccentric pirate \"Captain\" Jack Sparrow to save his love, the governor's daughter, from Jack's former pirate allies, who are now undead.";
    private static final String piratesYear = "2003";
    private static final String piratesImage = "pirates";
    private static final String piratesWeblink = "https://www.imdb.com/title/tt0325980/";

    private static final String hobbitTitle = "The Hobbit";
    private static final String hobbitDescription = "A reluctant Hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home, and the gold within it from the dragon Smaug.";
    private static final String hobbitYear = "2012";
    private static final String hobbitImage = "hobbit";
    private static final String hobbitWeblink = "https://www.imdb.com/title/tt0903624/";

    private static final String strangeTitle = "Doctor Strange";
    private static final String strangeDescription = "While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts.";
    private static final String strangeYear = "2016";
    private static final String strangeImage = "strange";
    private static final String strangeWeblink = "https://www.imdb.com/title/tt1211837/";



    //This is something different that was wanted here so I am different, yay.


    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {


        // clear out the array so that we don't duplicate

        ITEM_MAP.clear();
        MOVIES.clear();


        MovieModel hitchHickers = new MovieModel(hitchHickersTitle, hitchHickersDescription, hitchHickersYear, hitchHickersImage, hitchHickersWeblink);
        MovieModel treasurePlanet = new MovieModel(treasurePlanetTitle, treasurePlanetDescription, treasurePlanetYear, treasurePlanetImage, treasurePlanetWeblink);
        MovieModel pirates = new MovieModel(piratesTitle, piratesDescription, piratesYear, piratesImage, piratesWeblink);
        MovieModel hobbit = new MovieModel(hobbitTitle, hobbitDescription, hobbitYear, hobbitImage, hobbitWeblink);
        MovieModel strange = new MovieModel(strangeTitle, strangeDescription, strangeYear, strangeImage, strangeWeblink);


        // add EACH movie object to our lists and maps
        addMovieToList(hitchHickers);
        addMovieToList(treasurePlanet);
        addMovieToList(pirates);
        addMovieToList(hobbit);
        addMovieToList(strange);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
