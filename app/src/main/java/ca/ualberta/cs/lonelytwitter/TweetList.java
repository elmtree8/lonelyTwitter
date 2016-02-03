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

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    //public boolean isEmpty(TweetList tweets) {
    //  if (tweets.getCount() == 0) {
    //        return Boolean.TRUE;
    //  }
    //  return Boolean.FALSE;
    //}

    // lab exercise

    // for loop from http://stackoverflow.com/questions/14696584/java-loop-through-array
    //public void addTweet(Tweet tweet) throws IllegalArgumentException {
    //    for (int i = 0; i < tweets.size(); i++) {
    //      Tweet returnedTweet = tweets.get(i);
    //      if (tweet.getMessage().equals(returnedTweet.getMessage())) {
    //          throw new IllegalArgumentException();
    //      }
    //  }
    //  tweets.add(tweet);
    //}

    //public Tweet getTweets() {

    //}

    //public boolean hasTweet() {
    //  for (int i = 0; i < tweets.size(); i++) {
    //      Tweet tweet1 = tweets.get(i);
    //      for (int j = 0; j < tweets.size(); j++) {
    //          Tweet tweet2 = tweets.get(j);
    //          if (tweet1.getMessage().equals(tweet2.getMessage())) {
    //              return Boolean.TRUE;
    //          }
    //      }
    //    }
    //  return Boolean.FALSE;
    //}

    //public void removeTweet(Tweet tweet) {
    //    tweets.remove(tweet);
    //}

    public int getCount() {
        return 5;
    }

    //public int getCount() {
    //  return tweets.size();
    //}
}
