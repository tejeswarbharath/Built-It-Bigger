package com.example;

import java.util.Random;

public class MyClass {
    public MyClass() {
    }
    public String getJoke() {
        String [] Jokes = new String[]{"This is totally a funny joke", "This is Sarcastic joke", "bad joke", "foolish joke"};
        Random random = new Random();
        int randomJokeNumber = random.nextInt(4);
        return(Jokes[randomJokeNumber]);
    }
}
