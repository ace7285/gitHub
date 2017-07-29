package tw.org.iii.demo_activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act4 extends Activity {
    View.OnClickListener btnYes_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SetChoice("會");
        }
    };

    View.OnClickListener btnNo_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            SetChoice("不會");
        }
    };

private void SetChoice(String p){
    Bundle bund= new Bundle();
    bund.putString("name",p);
    Intent intent=new Intent();
    intent.putExtras(bund);
    setResult(0,intent);
    finish();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act4);
        InitialComponent();
    }

    private void InitialComponent(){
        btnYes=(Button)findViewById(R.id.btnYes);
        btnYes.setOnClickListener(btnYes_Click);
        btnNo=(Button)findViewById(R.id.btnNo);
        btnNo.setOnClickListener(btnNo_Click);

    }
    Button btnYes;
    Button btnNo;

}
