package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
<<<<<<< HEAD
 * Created by elmacdon on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAdd() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);

         assertTrue(tweets.hasTweet(tweet));

    }

    public void testHasTweet() {
      TweetList tweets = new TweetList();
      Tweet tweet = new NormalTweet("Hello");

      assertFalse(tweets.hasTweet(tweet));

      tweets.add(tweet);
      tweets.hasTweet(tweet);

      assertTrue(tweets.hasTweet(tweet));

    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        tweets.deleteTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    //lab exercise
    //public void testAddTweet() {
    //  TweetList tweets = new TweetList();
    //  Tweet tweet = new NormalTweet("Test tweet");

    //  tweets.add(tweet);
    //  tweets.addTweet(tweet);
    //  tweets.removeTweet(tweet);

    //    assertTrue(tweets.isEmpty(tweets));

    //}

    //public void testGetTweets() {
    //  TweetList tweets = new TweetList();
    //  Tweet tweet = new NormalTweet("Test tweet");

    //}

    //public void testHasTweet() {
    //  TweetList tweets = new TweetList();
    //  Tweet tweet = new NormalTweet("Test tweet");

    //  tweets.add(tweet);
    //  assertFalse(tweets.hasTweet());

    //  tweets.add(tweet);
    //  assertTrue(tweets.hasTweet());
    //}

    //public void testRemoveTweet() {
    //  TweetList tweets = new TweetList();
    //  Tweet tweet = new NormalTweet("Test tweet");

    //  tweets.add(tweet);
    //  tweets.removeTweet(tweet);

    //  assertFalse(tweets.isEmpty(tweets));
    //}

    //public void testGetCount() {
    //    TweetList tweets = new TweetList();
    //  Tweet tweet = new NormalTweet("Test tweet");

    //    tweets.add(tweet);

    //  assertTrue(tweets.getCount() == 1);

    //}
}
