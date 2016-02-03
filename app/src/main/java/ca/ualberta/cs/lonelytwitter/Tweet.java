package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by romansky on 1/12/16.
 */

/**
 * Tweet class used to configure a tweet with a message and date stamp.
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */

public abstract class Tweet {
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    //ArrayList<Mood> mood = new ArrayList<Mood>();

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    //public void addMood(Mood currMood) {
        //mood.add(currMood);
    //}

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Checks that the message is no longer than 140 characters
     * @param message
     * @throws TweetTooLongException Throws this if the message is too long
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns the format of all the tweets which separates the message from the date.
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
