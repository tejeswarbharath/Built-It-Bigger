package com.udacity.gradle.builditbigger;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest
{
    @Test
    public void AsyncTaskTest() throws Exception
    {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(new OnTaskCompleted() {
            @Override
            public void onTask(String response) {
                // Task completed
            }
        });

        // Execute task and wait for result
        String result = asyncTask.execute().get(30, TimeUnit.SECONDS);

        assertNotNull("Result should not be null", result);
        assertTrue("Joke should not be empty", result.length() > 0);
    }
}
