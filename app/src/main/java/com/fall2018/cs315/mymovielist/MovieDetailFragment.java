package com.fall2018.cs315.mymovielist;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A fragment representing a single Movie detail screen.
 * This fragment is either contained in a {@link MovieListActivity}
 * in two-pane mode (on tablets) or a {@link MovieDetailActivity}
 * on handsets.
 */
public class MovieDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The Movie content this fragment is presenting.
     */
    private MovieModel mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MovieDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // CS315: DO THIS
        // TODO: BUG FIX - Figure out why the App CRASHES when we rotate this Activity...

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the Movie content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.

            mItem = DumbMovieContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getMovieTitle());
            }

            ImageView thisMovieImageView = activity.findViewById(R.id.movieImageView);
            if (thisMovieImageView != null) {


                if(mItem.getMovieImage() == "hitchhickers")
                {
                    thisMovieImageView.setImageResource(R.drawable.hitchhickers);
                }
                if(mItem.getMovieImage() == "treasure")
                {
                    thisMovieImageView.setImageResource(R.drawable.treasure);
                }
                if(mItem.getMovieImage() == "pirates")
                {
                    thisMovieImageView.setImageResource(R.drawable.pirates);
                }
                if(mItem.getMovieImage() == "hobbit")
                {
                    thisMovieImageView.setImageResource(R.drawable.hobbit);
                }
                if(mItem.getMovieImage() == "strange")
                {
                    thisMovieImageView.setImageResource(R.drawable.strange);
                }



            }

            FloatingActionButton fab = (FloatingActionButton) activity.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // CS315: DO THIS
                    // TODO: launch the webpage with the URL we gots back from the model... also lose the snackbar stuff

                    //TODO: hint - you need to establish a new intent and launch a new Activity

                    

//                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movie_detail, container, false);

        // Show the Movie Description as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.movie_detail)).setText(mItem.getMovieDescription());
        }

        return rootView;
    }
}

