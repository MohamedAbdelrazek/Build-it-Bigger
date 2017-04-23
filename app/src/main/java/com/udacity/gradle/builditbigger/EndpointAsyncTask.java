package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.myApi.MyApi;

import java.io.IOException;

/**
 * Created by Mohamed AbdelraZek on 4/23/2017.
 */

public class EndpointAsyncTask extends AsyncTask<OnJokeReceivedListener, Void, String> {
    private static MyApi myApiService = null;
    private OnJokeReceivedListener listener;

    @Override
    protected String doInBackground(OnJokeReceivedListener... params) {
        if (myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.0.2:8080/_ah/api/");

            myApiService = builder.build();
        }

        listener = params[0];

        try {
            return myApiService.tellJoke().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        listener.onReceived(result);
    }
}