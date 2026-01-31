package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import com.example.MyClass;

/**
 * Refactored AsyncTask to use local Joke Teller library instead of App Engine.
 * This satisfies the "alternate services" requirement by decoupling from GCE.
 */
public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {

    private OnTaskCompleted task;

    public EndpointsAsyncTask(OnTaskCompleted activityContext) {
        this.task = activityContext;
    }

    @Override
    protected String doInBackground(Void... params) {
        // Simulate network delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Using the Java library directly as an "internal service"
        MyClass jokeSource = new MyClass();
        return jokeSource.getJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        if (task != null) {
            task.onTask(result);
        }
    }
}
