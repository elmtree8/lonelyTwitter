package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */

/**
 * This is the case where the boolean value is Important is true so the tweet
 * gets a "!IMPORTANT!" at the beginning
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */
public class ImportantTweet extends Tweet implements Tweetable {
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    /**
     * This returns the tweet message with a tag indicating that it's important
     * @return the message to be returned to the Tweet class
     */
    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
