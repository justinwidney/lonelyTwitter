package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jwidney on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;
    private List chronoList;

    public TweetList() {

    }

    public Boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {

        }
        else { tweets.add(tweet); }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
    return tweets.get(index);
    }

    public List getTweets() {
        int number = 0;
        while (!tweets.isEmpty()) {
            chronoList.add(tweets.get(number));
            number++;
        }
        return chronoList;

    }

   /* public boolean hasTweet(Tweet tweet) {
        if(tweets.contains(tweet)) {
            return true;
        }
        return false;
    } */

    public int getCount() {
        count = tweets.size();
        return count;
    }

}
