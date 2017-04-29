package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.udacity.gradle.builditbigger.utils.NetworkUtils;

import mohamedabdelrazek.com.androidjokeslib.JokesActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements OnJokeReceivedListener {
    private Button button;
    private ProgressBar mProgressBar;
    InterstitialAd mInterstitialAd;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        button = (Button) root.findViewById(R.id.tell_joke_btn);
        mProgressBar = (ProgressBar) root.findViewById(R.id.progressBar);

        AdView mAdViewT = (AdView) root.findViewById(R.id.adViewT);
        AdRequest adRequestT = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdViewT.loadAd(adRequestT);
        AdView mAdViewB = (AdView) root.findViewById(R.id.adViewB);
        AdRequest adRequestB = new AdRequest.Builder()
                .build();
        mAdViewB.loadAd(adRequestB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(View.VISIBLE);
                if (NetworkUtils.isNetworkAvailable(getContext())) {


                    if (mInterstitialAd.isLoaded()) {

                        mInterstitialAd.show();
                    }
                    fetchJoke();
                } else {
                    Toast.makeText(getContext(), "Check your Internet connection!", Toast.LENGTH_SHORT).show();
                    mProgressBar.setVisibility(View.INVISIBLE);
                }
            }
        });

        mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        AdRequest adRequestInt = new AdRequest.Builder().build();

        mInterstitialAd.loadAd(adRequestInt);
        mInterstitialAd.setAdListener(new AdListener() {

            @Override
            public void onAdFailedToLoad(int i) {

                Toast.makeText(getContext(), "onAdFailedToLoad", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAdClosed() {
                requestNewInterstitial();                
            }
        });


        return root;
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    public void fetchJoke() {

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
