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

    private static final String movie1Title = "Generic Rom Com";
    private static final String movie1Description = "Naturally, focuses on 2 people who really shouldn’t be together. It somehow becomes mutually advantageous for them to be together, or perhaps, they are interested in each other but their romance is based on false pretenses. Because the leads generally have no charisma, they each need a zany best friend who inserts dirty jokes wherever necessary. The two leads will fall in love in an extended music montage set to the music of Sixpence None the Richer. Once they find out about the false pretenses, they will take some time apart but realize how much they care for the other. Then comes “The Chase,” which can either be in an airport (not legal anymore), in traffic or somehow on boats. \n \nYou've seen this before, but not with these two actors!";
    private static final String movie1Year = "2015";
    private static final String movie1Image = "genericromcom";
    private static final String movie1Weblink = "http://showtimeshowdown.com/5-cliche-formulas-of-movie-genres/";

    private static final String actionTitle = "Every Action Movie Ever";
    private static final String actionDescription = "The villain has left the hero for dead, or killed the hero’s brother, sister, parents, wife or family pets. Filled with righteous fury, the hero tools up and embarks on a bloody rampage.  \n \nIf the movie does well, we will do it again in the sequel! \n \nMaybe the villain tries to get revenge on the hero for getting revenge on the villain in this movie...";
    private static final String actionYear = "2017";
    private static final String actionImage = "genericaction";
    private static final String actionWeblink = "http://www.denofgeek.com/us/movies/18824/the-5-most-common-action-movie-plots";

    private static final String horrorTitle = "Every Horror Flick Ever";
    private static final String horrorDescription = "starts off with any group of friends whom are expressively different in the beginning but in reality share one thing in common..stupidity. They go to some spooky place where some event happened that is still present in the place.  \n \nThe movie is a one hit generic series of pictures youll see again only with a different monster!";
    private static final String horrorYear = "2018";
    private static final String horrorImage = "genericaction";
    private static final String horrorWeblink ="https://www.quora.com/Why-are-horror-movies-so-predictable";

    private static final String sitcomTitle = "Every Sitcom Ever";
    private static final String sitcomDescription = "starring at least one celebrity that cant get another movie to act in, this is the daily ups and downs of a group of friends or family enclosed around a single location that are laughed at for something subjectively funny.";
    private static final String sitcomYear = "1989";
    private static final String sitcomImage = "genericaction";
    private static final String sitcomWeblink ="https://www.quora.com/Why-are-sitcoms-so-unfunny";

    private static final String animeTitle = "Every Anime Ever";
    private static final String animeDescription = "the story begins with the main character as a rookie amongst the vast amount of characters that are stronger and unique at first but from the first fight to the end of the story will proceed to all admire the main character's clout. Some episodes contain nothing but powering up and the main character evolves again, and again, and again. \n \nWill our hero defeat whatever villian it is that has some sort of maniacal reputation? find out a few episodes later on every anime ever!";
    private static final String animeYear = "1984";
    private static final String animeImage = "genericaction";
    private static final String animeWeblink ="https://www.animenewsnetwork.com/bbs/phpBB2/viewtopic.php?t=41317";

    private static final String scifiTitle = "Every Sci-Fi Ever";
    private static final String scifiDescription = "we start with the military or scientist organization discovering signs of life beyond our own beings. A group of senseless humans that are about as alien as the aliens themselves make dumb decisions leading this expedition to a complete disaster. With an us vs them mentality, the organization also makes really dumb decisions which cost countless lives to the outside forces, But you will still watch it cause you can look at the cool things and is a step up from horror movies!";
    private static final String scifiYear = "1902";
    private static final String scifiImage = "genericaction";
    private static final String scifiWeblink ="https://us.blastingnews.com/opinion/2017/08/sci-fi-movies-predictable-and-superficial-001923681.html";

    private static final String superheroTitle = "Every Super Hero Movie Ever";
    private static final String superheroDescription = "featuring uniconic orchestra music or unoriginal songs used in the movie, our hero is pretty extrordinary and seems to be at their best only to get sacked by some opponent, only then will he/she pander to becoming more people like so that he/she can be more relatable to the audience as they give it a secondtry against the opposition only to win but leave the city in complete disarray.";
    private static final String superheroYear = "2008";
    private static final String superheroImage = "genericaction";
    private static final String superheroWeblink ="https://www.quora.com/Why-are-superhero-movies-so-predictable";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        // make those movie objects
        MovieModel action = new MovieModel(actionTitle, actionDescription, actionYear, actionImage, actionWeblink);
        MovieModel romcom = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel horror = new MovieModel(horrorTitle, horrorDescription, horrorYear, horrorImage, horrorWeblink);
        MovieModel sitcom = new MovieModel(sitcomTitle, sitcomDescription, sitcomYear, sitcomImage, sitcomWeblink);
        MovieModel anime = new MovieModel(animeTitle, animeDescription, animeYear, animeImage, animeWeblink);
        MovieModel scifi = new MovieModel(scifiTitle, scifiDescription, scifiYear, scifiImage, scifiWeblink);
        MovieModel superhero = new MovieModel(superheroTitle, superheroDescription, superheroYear, superheroImage, superheroWeblink);

        // add EACH movie object to our lists and maps
        addMovieToList(action);
        addMovieToList(romcom);
        addMovieToList(horror);
        addMovieToList(sitcom);
        addMovieToList(anime);
        addMovieToList(scifi);
        addMovieToList(superhero);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
