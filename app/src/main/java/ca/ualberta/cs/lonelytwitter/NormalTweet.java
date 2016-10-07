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
 * This our main class for tweets created by user input.
 * Handles normal tweets by extending the Tweet class
 *
 * @author jwidney
 * @see Tweet
 *
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }



}
