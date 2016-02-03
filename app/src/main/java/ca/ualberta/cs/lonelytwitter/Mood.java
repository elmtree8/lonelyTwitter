package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by elmacdon on 1/12/16.
 */

/**
 * Function that (is supposed to) give a mood to a given tweet
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */
public class Mood {
    protected Date date;

    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }

    public Mood(Date date) {
        this.date = date;
    }

    protected Date getDate() {
        return date;
    }

    protected void setDate(Date date) {
        this.date = date;
    }
}
