package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by joshua2 on 9/28/15.
 */
public class TweetTest extends ActivityInstrumentationTestCase2 implements MyObserver {
    public boolean iWasNotified = false;

    public TweetTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testGetText() throws Exception {
        assertTrue(true); // should fail!
    }

    public void testSetText() throws Exception {

    }

    public void testGetDate() throws Exception {

    }

    public void testSetDate() throws Exception {

    }

    public void testIsImportant() throws Exception {

    }

    public void testToString() throws Exception {

    }

    public void testObserverNotify() {
        Tweet myTweet = new NormalTweet("Test");
        // We want to modify the tweet text to make sure that the
        // observer is notified.
        myTweet.registerObserver(this);
        assertFalse(iWasNotified);
        myTweet.setText("New string to trigger the observer.");
        assertTrue(iWasNotified);
    }

    public void myNotify() {
        iWasNotified = true;
    }
}