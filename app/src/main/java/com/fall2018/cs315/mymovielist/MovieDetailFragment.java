package com.fall2018.cs315.mymovielist;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.net.Uri;
import android.content.Intent;

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

                if (mItem.getMovieImage() == "inception") {
                    thisMovieImageView.setImageResource(R.drawable.inception);
                } else if (mItem.getMovieImage() == "interstellar") {
                    thisMovieImageView.setImageResource(R.drawable.interstellar);
                } else if (mItem.getMovieImage() == "nightcrawler") {
                    thisMovieImageView.setImageResource(R.drawable.nightcrawler);
                } else if (mItem.getMovieImage() == "up") {
                    thisMovieImageView.setImageResource(R.drawable.up);
                } else {
                    thisMovieImageView.setImageResource(R.drawable.whiplash);
                }
            }




            FloatingActionButton fab = (FloatingActionButton) activity.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // CS315: DO THIS
                    // TODO: create loading thing

//                    Intent intent = new Intent(this, WebActivity.class);
//                    startActivity(intent);

                    Uri uri = Uri.parse(mItem.getMovieWeblink());
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movie_detail, container, false);

        // Show the Movie Description as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.movie_detail)).setText(mItem.getMovieDescription());
        }

        return rootView;
    }

//    public void loadWebPage(View v) {
//        Intent intent = new Intent(this, WebActivity.class);
//        startActivity(intent);
//    }
}

