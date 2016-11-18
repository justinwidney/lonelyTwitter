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

/**
 * This is a class used for Important Tweets
 * @author jwidney
 *
 */
public class ImportantTweet extends Tweet{

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
