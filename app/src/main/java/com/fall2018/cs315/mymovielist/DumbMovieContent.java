// TODO: BUG FIX: Stop app from CRASHING when DetailActivity is rotated
// TODO: Spinner/Loading Indicator correctly tells user when WebView is loading that HTML

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
     * Create all those movie Strings we will be needing for the models
     */

    private static final String movie1Title = "Nightcrawler";
    private static final String movie1Description = "When Louis Bloom, a con man desperate for work, muscles into the world of L.A. crime journalism, he blurs the line between observer and participant to become the star of his own story.";
    private static final String movie1Year = "2014";
    private static final String movie1Image = "nightcrawler";
    private static final String movie1Weblink = "https://www.imdb.com/title/tt2872718/?ref_=nv_sr_1";

    private static final String movie2Title = "Inception";
    private static final String movie2Description = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.";
    private static final String movie2Year = "2010";
    private static final String movie2Image = "inception";
    private static final String movie2Weblink = "https://www.imdb.com/title/tt1375666/?ref_=adv_li_tt";

    private static final String movie3Title = "Interstellar";
    private static final String movie3Description = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.";
    private static final String movie3Year = "2014";
    private static final String movie3Image = "interstellar";
    private static final String movie3Weblink = "https://www.imdb.com/title/tt0816692/?ref_=adv_li_tt";

    private static final String movie4Title = "Whiplash";
    private static final String movie4Description = "A promising young drummer enrolls at a cut-throat music conservatory where his dreams of greatness are mentored by an instructor who will stop at nothing to realize a student's potential.";
    private static final String movie4Year = "2014";
    private static final String movie4Image = "whiplash";
    private static final String movie4Weblink = "https://www.imdb.com/title/tt2582802/?ref_=adv_li_tt";

    private static final String movie5Title = "Up";
    private static final String movie5Description = "Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.";
    private static final String movie5Year = "2009";
    private static final String movie5Image = "up";
    private static final String movie5Weblink = "https://www.imdb.com/title/tt1049413/?ref_=adv_li_tt";


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
        if (MOVIES.isEmpty()) {
            addMovieToList(movie1);
            addMovieToList(movie2);
            addMovieToList(movie3);
            addMovieToList(movie4);
            addMovieToList(movie5);
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
