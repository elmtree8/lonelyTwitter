package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */

/**
 * This is the case where the boolean value isImportant is false. So the tweet
 * wasn't defined as important and doesn't get an "!" at the end.
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public NormalTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
