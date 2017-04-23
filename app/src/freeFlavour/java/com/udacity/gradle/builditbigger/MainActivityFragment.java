package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import mohamedabdelrazek.com.androidjokeslib.JokesActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements OnJokeReceivedListener {
    private Button button;
    private ProgressBar mProgressBar;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        button = (Button) root.findViewById(R.id.tell_joke_btn);
        mProgressBar= (ProgressBar) root.findViewById(R.id.progressBar);

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(View.VISIBLE);
                fetchJoke();
            }
        });
        return root;
    }
    public void fetchJoke(){

        new EndpointAsyncTask().execute(this);
    }

    @Override
    public void onReceived(String joke) {
        startJokeActivity(joke);
    }
    private void startJokeActivity(String joke) {
        mProgressBar.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(getActivity(), JokesActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, joke);
        startActivity(intent);
    }
}
