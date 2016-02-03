package ca.ualberta.cs.lonelytwitter;

/**
 * Created by elmacdon on 1/12/16.
 */

/**
 * This is called when a mood is declared as sad
 * @since 1.2.1
 * @see LonelyTwitterActivity for more information
 * @Author Erin
 * @version 2.3
 * @deprecated
 */
public class sad extends Mood {
    String MoodString;
    public String ReturnMood() {
        return MoodString = new String("I'm feeling sad");
    }
}
