package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by joshua2 on 9/28/15.
 */
public class TweetList {
    private static TweetList tweetList = null;
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public static TweetList getInstance() {
        if (tweetList == null) {
            tweetList = new TweetList();
        }
        return tweetList;
    }

    protected TweetList() { super(); }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public int size() {
        return tweets.size();
    }

    public Tweet get(int position) {
        return tweets.get(position);
    }

}
