/**
 * copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All rights Reserved.
 * you may use, copy or distribute this code under terms and conditions of University of Alberta
 * and Code of Student Behaviour.
 * Please contact jwidney@ualberta.ca for more details or questions
 *
 *
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is abstract class that contain all parameters of our Tweets.
 * It is an abstract class extended by different types of Tweets.
 * It created from a string message and contains a date
 *
 * @see NormalTweet
 * @see ImportantTweet
 * @author jwidney
 */

public abstract class Tweet {
    private String message;
    private Date date;


    /**
     * Instantiates a new Tweet with a string message.
     * A date is automatically generated
     *
     * @param message the message
     */

    // #4
    // changed constructor to protected for abstract class
    protected Tweet(String message) {
        this.message = message;
        this.date = new Date();


    }



    // #1
    // Removed Constructor that isn't used & needs a date object

    /*public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;


    }*/


    @Override
    public String toString(){
        return message;
    }


    /**
     * Method call to see if a Tweet is important
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();



    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }



}



