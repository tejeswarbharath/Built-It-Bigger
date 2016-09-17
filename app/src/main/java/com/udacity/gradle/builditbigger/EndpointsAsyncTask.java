package com.udacity.gradle.builditbigger;

import java.io.IOException;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.example.tejeswar.telljokes.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

/**
 * Created by tejeswar on 9/1/2016.
 */
public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String>
{

        private MyApi myApiService = null;
        private Context context;
        private OnTaskCompleted task;

      //  public EndpointsAsyncTask(){}

        public EndpointsAsyncTask(OnTaskCompleted activityContext){
            this.task = activityContext;
        }


        @Override
        protected String doInBackground(Pair<Context, String>... params) {
            if(myApiService == null) {
                // Only do this once
                MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                        .setRootUrl("https://built-it-bigger-141817.appspot.com/_ah/api/").setGoogleClientRequestInitializer(new GoogleClientRequestInitializer(){
                    @Override
                    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                        abstractGoogleClientRequest.setDisableGZipContent(true);
                    }
                });
                // end options for devappserver
                myApiService = builder.build();
            }
            //context = params[0].first;
            try
            {
                return myApiService.getJoke().execute().getData();
            } catch (IOException e) {
                return e.getMessage();
            }
        }

    @Override
    protected void onPostExecute(String result)
    {
        task.onTask(result);
    }
}
