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
 * This is a Interface that can be used to allow a class to be Tweetable.
 * Allows said class to contain a String message and Date
 * @author jwidney
 */

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
