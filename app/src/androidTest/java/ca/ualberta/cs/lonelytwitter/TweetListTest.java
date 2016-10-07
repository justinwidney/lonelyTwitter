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

import android.test.ActivityInstrumentationTestCase2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is file containing our test cases for TweetList
 * It deals with modifying the TweetList and getting parameters of said list
 *
 * @author jwidney
 * @see TweetList
 * @see Tweet
 * @see ActivityInstrumentationTestCase2
 * @see NormalTweet
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /** test case if method hasTweet works
     *
     */
    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));

    }

    /** test case if method Delete removes a passed tweet
     *
     */
    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    /** test case if getTweet method returns a Tweet for a position
     *
     */
    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());


    }

    /** test case if addTweet method add a specified tweet to an TweetList
     *
     */
    public void testaddTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        try {
            list.addTweet(tweet);
            assertTrue(false);

        } catch (IllegalArgumentException e) {

        }

    }

    /** test case if addTweet method adds a specified tweet to an TweetList
     *
     */
    public void testgetTweets() {
        List<Tweet> testlist = new ArrayList<Tweet>();


        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("1");
        Tweet tweet2 = new NormalTweet("2");
        Tweet tweet3 = new NormalTweet("3");
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);
        List<Tweet> chronoList = Arrays.asList(tweet,tweet2,tweet3);

        chronoList = list.getTweets();

        assertEquals(chronoList,testlist);
    }

    /** test case if getCount method returns the size of TweetList
     *
     */
    public void testgetCount() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertEquals(list.getCount(), 1);
    }

    /** test case if getCount method returns the size of TweetList
     *
     */
    public void testhasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }



}
