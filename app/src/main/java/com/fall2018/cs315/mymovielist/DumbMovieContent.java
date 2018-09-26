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

    private static String movies[][] = new String[5][5];
    static {
        movies[0][0] = "Sweeney Todd: The Demon Barber of Fleet Street";
        movies[0][1] = "Evil Judge Turpin (Alan Rickman) lusts for the beautiful wife of a London barber (Johnny Depp) and transports him to Australia for a crime he did not commit. Returning after 15 years and calling himself Sweeney Todd, the now-mad man vows revenge, applying his razor to unlucky customers and shuttling the bodies down to Mrs. Lovett (Helena Bonham Carter), who uses them in her meat-pie shop. Though many fall to his blade, he will not be satisfied until he slits Turpin's throat.";
        movies[0][2] = "2007";
        movies[0][3] = "sweenytoddposter";
        movies[0][4] = "https://en.wikipedia.org/wiki/Sweeney_Todd:_The_Demon_Barber_of_Fleet_Street_(2007_film)";

        movies[1][0] = "Serenity";
        movies[1][1] = "In this continuation of the television series \"Firefly,\" a group of rebels travels the outskirts of space aboard their ship, Serenity, outside the reach of the Alliance, a sinister regime that controls most of the universe. After the crew takes in Simon (Sean Maher) and his psychic sister, River (Summer Glau), whom he has just rescued from Alliance forces, they find themselves being pursued by the Operative (Chiwetel Ejiofor), an Alliance agent who will stop at nothing to find them.";
        movies[1][2] = "2005";
        movies[1][3] = "serenityposter";
        movies[1][4] = "https://en.wikipedia.org/wiki/Serenity_(2005_film)";

        movies[2][0] = "The Sixth Sense";
        movies[2][1] = "Young Cole Sear (Haley Joel Osment) is haunted by a dark secret: he is visited by ghosts. Cole is frightened by visitations from those with unresolved problems who appear from the shadows. He is too afraid to tell anyone about his anguish, except child psychologist Dr. Malcolm Crowe (Bruce Willis). As Dr. Crowe tries to uncover the truth about Cole's supernatural abilities, the consequences for client and therapist are a jolt that awakens them both to something unexplainable.";
        movies[2][2] = "1999";
        movies[2][3] = "thesixthsenseposter";
        movies[2][4] = "https://en.wikipedia.org/wiki/The_Sixth_Sense";

        movies[3][0] = "Moonlight";
        movies[3][1] = "A look at three defining chapters in the life of Chiron, a young black man growing up in Miami. His epic journey to manhood is guided by the kindness, support and love of the community that helps raise him.";
        movies[3][2] = "2016";
        movies[3][3] = "moonlightposter";
        movies[3][4] = "https://en.wikipedia.org/wiki/Moonlight_(2016_film)";

        movies[4][0] = "The Incredibles";
        movies[4][1] = "In this lauded Pixar animated film, married superheroes Mr. Incredible (Craig T. Nelson) and Elastigirl (Holly Hunter) are forced to assume mundane lives as Bob and Helen Parr after all super-powered activities have been banned by the government. While Mr. Incredible loves his wife and kids, he longs to return to a life of adventure, and he gets a chance when summoned to an island to battle an out-of-control robot. Soon, Mr. Incredible is in trouble, and it's up to his family to save him.";
        movies[4][2] = "2004";
        movies[4][3] = "theincrediblesposter";
        movies[4][4] = "https://en.wikipedia.org/wiki/The_Incredibles";
    }

    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic () {
        MOVIES.clear();

        for(int i = 0; i < movies.length; i++){
            MovieModel newMovie = new MovieModel(movies[i][0],movies[i][1],movies[i][2],movies[i][3],movies[i][4]);
            addMovieToList(newMovie);
        }

        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
