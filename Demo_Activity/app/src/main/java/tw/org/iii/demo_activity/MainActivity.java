package tw.org.iii.demo_activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    View.OnClickListener btn_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Act2.class);
            startActivity(intent);
        }
    };

    View.OnClickListener btnSend_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Bundle bund = new Bundle();
            bund.putString("name","kk");

            Intent intent = new Intent(MainActivity.this, Act3.class);
            intent.putExtras(bund);
            startActivity(intent);
        }
    };

    View.OnClickListener btnList_click=new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent intent=new  Intent(MainActivity.this,ActList.class);
            startActivity(intent);

        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==9487){
            if(data==null){
                lblMsg.setText("沒有設定管理員");
                return;
            }
            if(data.getExtras()==null){
                lblMsg.setText("沒有設定包裹");
                return;
            }
            String result=data.getExtras().getString("name");
            lblMsg.setText("投票結果："+result);
        }
    }

    View.OnClickListener btnReceive_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this, Act4.class);
            startActivityForResult(intent,9487);
        }
    };

    private void InitialComponent() {
        btnAct2 = (Button) findViewById(R.id.btnAct2);
        btnAct2.setOnClickListener(btn_Click);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(btnSend_Click);
        btnReceive = (Button) findViewById(R.id.btnReceive);
        btnReceive.setOnClickListener(btnReceive_Click);
        btnList =(Button)findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        lblMsg = (TextView) findViewById(R.id.lblMsg);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("act_demo", "onCreate()被執行");
        InitialComponent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("act_demo", "onStart()被執行");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("act_demo", "onResume()被執行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("act_demo", "onPause()被執行");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("act_demo", "onStop()被執行");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("act_demo", "onDestroy()被執行");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("act_demo", "onRestart()被執行");
    }

    Button btnAct2;
    Button btnSend;
    Button btnReceive;
    Button btnList;
    TextView lblMsg;
}
