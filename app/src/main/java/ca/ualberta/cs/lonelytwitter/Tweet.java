package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    ArrayList<Mood> mood = new ArrayList<Mood>();

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public void addMood(Mood currMood) {
        mood.add(currMood);
    }

    public Tweet(String message) {
        this.message = message;
    }


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
