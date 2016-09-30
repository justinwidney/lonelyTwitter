package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by jwidney on 9/29/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

   /* public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }*/




    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());


    }

    // return true if catches exception
    public void testaddTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);

        try {
            list.addTweet(tweet);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
            assertTrue(true);
        }

    }


    public void testgetTweets() {

        TweetList list = new TweetList();
        ArrayList<Tweet> orderTweets = new ArrayList<Tweet>();


        Tweet tweet = new NormalTweet("1");
        Tweet tweet2 = new NormalTweet("2");
        Tweet tweet3 = new NormalTweet("3");

        tweet.setDate(new Date(15));
        tweet2.setDate(new Date(20));
        tweet3.setDate(new Date(19));

        // add tweets in proper order
        orderTweets.add(tweet);
        orderTweets.add(tweet3);
        orderTweets.add(tweet2);

        // add tweets in other order
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);


        assertEquals(list.getTweets(),orderTweets);

    }
    // test count
    public void testgetCount() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertEquals(list.getCount(), 1);
    }


    // test if contains tweet
    public void testhasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }



}
