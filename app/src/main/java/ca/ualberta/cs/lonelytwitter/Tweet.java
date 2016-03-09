package ca.ualberta.cs.lonelytwitter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import io.searchbox.annotations.JestId;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    @JestId
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected Date date;
    protected String message;

    protected transient Bitmap thumbnail;
    protected String thumbnailBase64;

    public void addThumbnail(Bitmap newThumbnail) {
        thumbnail = newThumbnail;

        // TODO: Convert to Base64 and store in thumbnailBase64
        // FROM: http://mobile.cs.fsu.edu/converting-images-to-json-objects/
        final int COMPRESSION_QUALITY = 100;
        ByteArrayOutputStream byteArrayBitmapStream = new ByteArrayOutputStream();
        newThumbnail.compress(Bitmap.CompressFormat.PNG, COMPRESSION_QUALITY,
                byteArrayBitmapStream);
        byte[] b = byteArrayBitmapStream.toByteArray();
        thumbnailBase64 = Base64.encodeToString(b, Base64.DEFAULT);
    }

    public boolean verifyThumbnail() {
        // If there's a base64string, but not thumbnail, create it.
        if(thumbnail == null && thumbnailBase64 != null) {
            byte[] decodedString = Base64.decode(thumbnailBase64, Base64.DEFAULT);
            thumbnail = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            return true;
        }
        return false;
    }

    public Tweet(Date date, String message, Bitmap thumbnail) {
        this.date = date;
        this.message = message;
        this.thumbnail = thumbnail;
    }

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    @Override
    public String toString() {
        // Some people thought they would be funny and add tweets without dates...
        if(date == null) {
            if(message == null) {
                return "";
            } else {
                return message;
            }
        }
        return date.toString() + " | " + message;
    }
}
