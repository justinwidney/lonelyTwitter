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

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;


/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {


    private Solo solo;


    /**
     * Instantiates a new Lonely twitter activity test.
     */
    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Test the Activity Starts
     */


    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void setUp() throws Exception{
        Log.d("TAG1", "setUp()");
        solo = new Solo(getInstrumentation(),getActivity());
    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.clearEditText((EditText)solo.getView(R.id.body));



        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");
        assertFalse(solo.waitForText("Test Tweet!"));
    }


    public void testClickTweetList(){
        LonelyTwitterActivity activity = (LonelyTwitterActivity)solo.getCurrentActivity();
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        final ListView oldTweetList = activity.getOldTweetsList();
        Tweet tweet = (Tweet) oldTweetList.getItemAtPosition(0);
        assertEquals("Test Tweet!", tweet.getMessage());

        solo.clickInList(0);

        solo.assertCurrentActivity("Wrong Activity!", EditTweetActivity.class);

        assertTrue(solo.waitForText("New Activity!"));


        solo.goBack();
        solo.assertCurrentActivity("Wrong Activity!", LonelyTwitterActivity.class);

    }

    // Add A tweet to list, click the tweet and start new Activity and check message = tweet

    public void testClickEditTweetActivity(){
        LonelyTwitterActivity activity = (LonelyTwitterActivity)solo.getCurrentActivity();

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");


        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.waitForText("Test Tweet!");

        final ListView oldTweetList = activity.getOldTweetsList();
        Tweet tweet = (Tweet) oldTweetList.getItemAtPosition(0);
        assertEquals("Test Tweet!", tweet.getMessage());

        solo.clickInList(0);

        solo.assertCurrentActivity("Wrong Activity!", EditTweetActivity.class);
        EditTweetActivity activity1 = (EditTweetActivity)solo.getCurrentActivity();

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.waitForText("Test Tweet!");
        assertEquals("Test Tweet!", activity1.getMessage());

    }


    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}