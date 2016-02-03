package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by elmacdon on 1/26/16.
 */

/**
 * Defines the arraylist of tweets that are then saved to the file and defines
 * a couple of functions to edit them (add, get etc)
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Adds
     * @param tweet
     */
    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    //public boolean hasTweet(Tweet tweet) {
        //return tweets.contains(tweet);
    //}

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    // lab exercise
    public void addTweet(Tweet tweet) {

    }

    //public Tweet getTweets() {
        // whaaaat?
    //}

    public boolean hasTweet(Tweet tweet) {
        return Boolean.TRUE;
    }

    public void removeTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public int getCount() {
        return 5;
    }
}
