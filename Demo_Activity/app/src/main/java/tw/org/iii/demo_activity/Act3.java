package tw.org.iii.demo_activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act3);

        TextView lblSend = (TextView) findViewById(R.id.lblSend);

        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        String name = bund.getString("name");

        lblSend.setText("Hello " + name);
    }
}
