package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by joshua2 on 9/16/15.
 */
public class NormalTweet extends Tweet{
    private ArrayList<MyObserver> myWatchers = new ArrayList<MyObserver>();
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public NormalTweet(String tweet) {
        super(tweet);
    }

    @Override
    public void setText(String text) throws TweetTooLongException {
        super.setText(text);
        myNotifyAll();
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    public NormalTweet(Parcel in) { super(in); }

    //http://stackoverflow.com/questions/7181526/how-can-i-make-my-custom-objects-be-parcelable codelogic 06-03-2016
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public NormalTweet createFromParcel(Parcel in) {
            return new NormalTweet(in);
        }

        public NormalTweet[] newArray(int size) {
            return new NormalTweet[0];
        }
    };

    public void registerObserver(Object observer) {
        myWatchers.add(observer);
    }

    public void myNotifyAll() {
        for (MyObserver o : myWatchers) {
            o.myNotify();
        }
=======
import java.util.Date;

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
>>>>>>> 7ae5b9297c83a493b7a60a1f81a0990aa4958572
    }
}
