package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by elmacdon on 1/12/16.
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
