package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private String message;
    private Activity activity = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Bundle bundle = getIntent().getExtras();
        message = bundle.getString("message");

        TextView textView = (TextView) findViewById(R.id.editActivityText);
        textView.setText(message);

    }

    public String getMessage(){
        return message;
    }

}
