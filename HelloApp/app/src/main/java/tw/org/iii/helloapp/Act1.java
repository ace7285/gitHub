package tw.org.iii.helloapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Act1 extends Activity {
    int[] lotteryRs;

    View.OnClickListener btnOk_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView lblNum = (TextView) findViewById(R.id.lblNum);
            lblNum.setText(new CLotto().GetNumbers(6, 1, 49));
        }
    };


    View.OnClickListener btnList_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder build = new AlertDialog.Builder(Act1.this);
            build.setTitle("this result");
            build.setItems();
            Dialog msg=build.create();
            msg.show();
        }
    };

    public void InitialComponent() {
        t = (TextView) findViewById(R.id.lblA);
        t.setText("hello world");

        lblTitle = (TextView) findViewById(R.id.lblTitle);
        lblTitle.setText("樂透號碼產生器");

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(btnOk_Click);
        btnList = (Button) findViewById(R.id.btnlist);
        btnList.setOnClickListener(btnList_click);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act1);
        InitialComponent();
    }

    TextView t, lblTitle;
    Button btnOk, btnList;
}

