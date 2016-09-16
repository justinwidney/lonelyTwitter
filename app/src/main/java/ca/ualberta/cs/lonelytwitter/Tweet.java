package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jwidney on 9/15/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    private ArrayList<Mood> mood_list;


    public Tweet(String message) {
        this.message = message;
        this.date = new Date();


    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;



    }

    public Tweet(String message, Date date, String mood) {
        this.message = message;
        this.date = date;
        this.mood_list = new ArrayList<Mood>();
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Mood> getMood() {
        return mood_list;
    }

    public void setMood(ArrayList<Mood> mood) {
        this.mood_list = mood;



    }
}



