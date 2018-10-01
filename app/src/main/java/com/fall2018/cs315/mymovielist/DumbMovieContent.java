package com.fall2018.cs315.mymovielist;

import android.graphics.drawable.Drawable;

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

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        // add EACH movie object to our lists and maps
        addMovieToList(new MovieModel(
                "The Shawshank Redemption",
                "Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man's unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red.",
                "1994",
                "shawshank",
                "https://www.imdb.com/title/tt0111161"));

        addMovieToList(new MovieModel(
                "The Lion King",
                "A young lion prince is cast out of his pride by his cruel uncle, who claims he killed his father. While the uncle rules with an iron paw, the prince grows up beyond the Savannah, living by a philosophy: No worries for the rest of your days. But when his past comes to haunt him, the young prince must decide his fate: Will he remain an outcast or face his demons and become what he needs to be?",
                "1994",
                "lionking",
                "https://www.imdb.com/title/tt0110357"));

        addMovieToList(new MovieModel(
                "WALL·E",
                "WALL-E, short for Waste Allocation Load Lifter Earth-class, is the last robot left on Earth. He spends his days tidying up the planet, one piece of garbage at a time. But during 700 years, WALL-E has developed a personality, and he's more than a little lonely. Then he spots EVE, a sleek and shapely probe sent back to Earth on a scanning mission. Smitten WALL-E embarks on his greatest adventure yet when he follows EVE across the galaxy.",
                "2008",
                "walle",
                "https://www.imdb.com/title/tt0910970"));

        addMovieToList(new MovieModel(
                "The Princess Bride",
                "A kindly grandfather sits down with his ill grandson and reads him a story. The story is one that has been passed down from father to son for generations. As the grandfather reads the story, the action comes alive. The story is a classic tale of love and adventure as the beautiful Buttercup, engaged to the odious Prince Humperdinck, is kidnapped and held against her will in order to start a war, It is up to Westley (her childhood beau, now returned as the Dread Pirate Roberts) to save her. On the way he meets a thief and his hired helpers, an accomplished swordsman and a huge, super strong giant, both of whom become Westley's companions in his quest.",
                "1987",
                "princessbride",
                "https://www.imdb.com/title/tt0093779"));

        addMovieToList(new MovieModel(
                "Groundhog Day",
                "A weather man is reluctantly sent to cover a story about a weather forecasting \"rat\" (as he calls it). This is his fourth year on the story, and he makes no effort to hide his frustration. On awaking the 'following' day he discovers that it's Groundhog Day again, and again, and again. First he uses this to his advantage, then comes the realisation that he is doomed to spend the rest of eternity in the same place, seeing the same people do the same thing EVERY day.",
                "1993",
                "groundhogday",
                "https://www.imdb.com/title/tt0107048"));

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
