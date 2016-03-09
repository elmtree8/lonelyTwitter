package ca.ualberta.cs.lonelytwitter;

/**
 * Created by elmacdon on 3/8/16.
 */
public interface MyObservable {

    public void registerObserver(Object o);

    public void myNotifyAll();
}
