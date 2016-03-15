package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by joshua2 on 9/16/15.
 */
public class ImportantTweet extends Tweet implements MyObservable {
    public ImportantTweet(String tweet, Date date) {
        super(tweet, date);
        this.setText(tweet);
        this.date = date;
    }

    public ImportantTweet(String tweet) {
        super(tweet);
    }

=======
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    @Override
>>>>>>> 7ae5b9297c83a493b7a60a1f81a0990aa4958572
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

<<<<<<< HEAD
    @Override
    public String getText() {
        return "!!!" + super.getText();
    }

    public ImportantTweet(Parcel in) { super(in); }

    //http://stackoverflow.com/questions/7181526/how-can-i-make-my-custom-objects-be-parcelable codelogic 06-03-2016
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ImportantTweet createFromParcel(Parcel in) {
            return new ImportantTweet(in);
        }

        public ImportantTweet[] newArray(int size) {
            return new ImportantTweet[0];
        }
    };

    public void registerObserver(Object o) {

    }

    public void myNotifyAll() {

=======
    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return "!IMPORTANT! " + this.message;
>>>>>>> 7ae5b9297c83a493b7a60a1f81a0990aa4958572
    }
}
