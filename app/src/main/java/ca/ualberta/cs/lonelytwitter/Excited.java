package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jwidney on 9/15/16.
 */
public class Excited extends Mood{

    public Excited(Date date) {
        super(date);
    }

    @Override
    public String format() {
        return "Excited!!";
    }
}
