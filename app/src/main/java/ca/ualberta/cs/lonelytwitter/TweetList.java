package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwidney on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;
    private Tweet tempTweet;
    private int length;

    public TweetList() {

    }

    public Boolean hasTweet(Tweet tweet) {

        return tweets.contains(tweet);
    }

    public void addTweet(Tweet tweet) {

        if (tweets.contains(tweet))
            {
                throw new IllegalArgumentException();
            }
            else {
                tweets.add(tweet);
            }


        }



    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
    return tweets.get(index);
    }

    // rearranges order
    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> sOrder = new ArrayList<Tweet>(tweets);
        ArrayList<Tweet> fOrder = new ArrayList<Tweet>();

        while (length < sOrder.size()) {
            tempTweet = sOrder.get(0);
            for(Tweet tweets: sOrder) {
                if(tweets.getDate().getTime() < tempTweet.getDate().getTime()) {
                    tempTweet = tweets;
                }
            }

            fOrder.add(tempTweet);
            sOrder.remove(tempTweet);
        }


        return fOrder;

    }


    public int getCount() {
        count = tweets.size();
        return count;
    }

}
