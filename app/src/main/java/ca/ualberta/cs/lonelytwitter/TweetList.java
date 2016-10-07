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

import java.util.ArrayList;
import java.util.List;

/**
 * This is the controller class
 * Manages our Tweets by containing them in a ArrayList
 * It can call a series of methods on said List to give/relieve parameters
 * C
 * @author jwidney
 * @see Tweet
 * @see ArrayList
 *
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;
    private List chronoList;

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList() {

    }

    /**
     * Check if the tweetList contains a Tweet.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public Boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Adds a new tweet.
     *
     * @param tweet the tweet
     */
    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {

        }
        else { tweets.add(tweet); }
    }

    /**
     * Delete the passed tweet from the ArrayList.
     *
     * @param tweet the tweet
     */
    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    /**
     * Gets tweet at a certain index.
     *
     * @param index the index
     * @return the tweet
     */
    public Tweet getTweet(int index) {
    return tweets.get(index);
    }

    /**
     * Gets tweets in a chronological order
     *
     * @return the tweets
     */
    public List getTweets() {
        int number = 0;
        while (!tweets.isEmpty()) {
            chronoList.add(tweets.get(number));
            number++;
        }
        return chronoList;

    }


    /**
     * Gets the size of the List.
     *
     * @return the count
     */
    public int getCount() {
        count = tweets.size();
        return count;
    }

}
