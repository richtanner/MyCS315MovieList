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

    //something

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String movie1Title = "Backstroke of the West";
    private static final String movie1Description = "The Third Gathers\n" +
            "The Backstroke of the West\n" +
            "The war came!\n" +
            "The republic encountered \n" +
            "Two squares fight the vehemence\n" +
            "The improbity fills the world\n" +
            "\n" +
            "The space general of the alliance is skillful\n" +
            "Kidnap the D the speaker the conduct \n" +
            "The proper abruption alliance troops tries\n" +
            "ratio prosperous drive with the";
    private static final String movie1Year = "2016";
    private static final String movie1Image = "backstrokemenu";
    private static final String movie1Weblink = "http://starwarsfans.wikia.com/wiki/Star_War_The_Third_Gathers:_The_Backstroke_of_the_West";

    private static final String catTitle = "A Talking Cat";
    private static final String catDescription = "A real tear-jerker that uses the comic sans font throughout the movie. The music direction is also stellar as it has one single music track. You both talked to a cat, didn't ya? And the cat talked back, didn't it? That's weird. He's a talking cat but I can only talk to a person once! This is A Talking Cat.";
    private static final String catYear = "2013";
    private static final String catImage = "cat";
    private static final String catWeblink = "https://www.youtube.com/watch?v=Y-h-KpG2tHM";

    private static final String pumaTitle = "The Pumaman";
    private static final String pumaDescription = "Thousands of years ago, an alien spaceship visited the Earth and became a god to the Aztecs. The aliens fathered the Pumaman, a man-god with supernatural powers who would guard the people of Earth and transmit his powers to his descendants. The original Pumaman was entrusted a gold mask with the ability to control people's minds. In the present day, in London, archaeologist Jane Dobson (Sydne Rome) has found the mask and deciphered its instructions: when aimed at someone, it can be used to control their mind, and the control becomes tighter if a replica of the person's head is wired into it. Her employer, the villainous Dr. Kobras (Donald Pleasence), plans to use it to control the minds of world leaders. He begins with Jane, who is the Dutch ambassador's daughter. Kobras somehow learns the Pumaman will be after the mask, and is an American orphan living in London. Reasoning that the Pumaman can survive great falls, like a cat, he orders his henchmen to throw people matching that description from tall places and see if they survive.";
    private static final String pumaYear = "1980";
    private static final String pumaImage = "puma";
    private static final String pumaWeblink = "https://www.youtube.com/watch?v=aMJaSK3Tv3c";

    private static final String garzeyTitle = "Garzey's Wing";
    private static final String garzeyDescription = "Chris exists simultaneously in Byston Well and the real world, and the two can communicate to each other through a necklace they both wear. Real-world Chris feels the bruises and pain Byston Well Chris experiences while fighting soldiers, and training he does in the real world allow him to learn it in Byston Well. While one Chris is in Byston Well surrounded by 12th and 13th century foreigners and being chased by a real army, earth Chris must do Chi exercises to strengthen his mind.";
    private static final String garzeyYear = "1996";
    private static final String garzeyImage = "garzey";
    private static final String garzeyWeblink = "https://www.youtube.com/watch?v=3bQI7W7lAoc";

    private static final String manosTitle = "Manos: The Hands of Fate";
    private static final String manosDescription = "While on vacation near El Paso, Texas, Michael, Margaret, their young daughter Debbie and their dog, Peppy, drive through the desert in search of a hotel called \"Valley Lodge.\" Margaret insists they are lost, and Michael claims they are not. They are then pulled over by a local deputy for a broken taillight, but are let go after Michael asks him for mercy since they are on their \"first vacation.\" After long shots of driving through farmland and the desert, intercut with scenes of two teenagers making out in a car and being caught by the deputies, the family finally reach a house, tended by the bizarre, satyr-like Torgo, who says he takes care of the place \"while The Master is away.\" The house seemed to appear out of nowhere, and Torgo acts very strange. Apprehensive, Michael and Margaret ask Torgo for directions to the Valley Lodge; Torgo denies having knowledge of such a place. Frustrated, Michael asks Torgo to let him and his family stay the night, despite objections from both Torgo and Margaret.";
    private static final String manosYear = "1966";
    private static final String manosImage = "manos";
    private static final String manosWeblink = "https://www.youtube.com/watch?v=LneQo-4qE3I";

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {

        MOVIES.clear();

        // make those movie objects
        MovieModel cat = new MovieModel(catTitle, catDescription, catYear, catImage, catWeblink);
        MovieModel backstroke = new MovieModel(movie1Title, movie1Description, movie1Year, movie1Image, movie1Weblink);
        MovieModel puma = new MovieModel(pumaTitle, pumaDescription, pumaYear, pumaImage, pumaWeblink);
        MovieModel garzey = new MovieModel(garzeyTitle, garzeyDescription, garzeyYear, garzeyImage, garzeyWeblink);
        MovieModel manos = new MovieModel(manosTitle, manosDescription, manosYear, manosImage, manosWeblink);

        // add EACH movie object to our lists and maps
        addMovieToList(cat);
        addMovieToList(backstroke);
        addMovieToList(puma);
        addMovieToList(garzey);
        addMovieToList(manos);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
