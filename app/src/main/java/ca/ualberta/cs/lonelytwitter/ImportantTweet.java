package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by elmacdon on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
