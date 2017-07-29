package tw.org.iii.democal;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    int num1;
    String op;

    View.OnClickListener btn0_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("0");
            else
                lblNum.setText(lblNum.getText().toString() + "0");
        }
    };
    View.OnClickListener btn1_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("1");
            else
                lblNum.setText(lblNum.getText().toString() + "1");
        }
    };
    View.OnClickListener btn2_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("2");
            else
                lblNum.setText(lblNum.getText().toString() + "2");
        }
    };
    View.OnClickListener btn3_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("3");
            else
                lblNum.setText(lblNum.getText().toString() + "3");
        }
    };
    View.OnClickListener btn4_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("4");
            else
                lblNum.setText(lblNum.getText().toString() + "4");
        }
    };
    View.OnClickListener btn5_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("5");
            else
                lblNum.setText(lblNum.getText().toString() + "5");
        }
    };
    View.OnClickListener btn6_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("6");
            else
                lblNum.setText(lblNum.getText().toString() + "6");
        }
    };
    View.OnClickListener btn7_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("7");
            else
                lblNum.setText(lblNum.getText().toString() + "7");
        }
    };
    View.OnClickListener btn8_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("8");
            else
                lblNum.setText(lblNum.getText().toString() + "8");
        }
    };
    View.OnClickListener btn9_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int l_int = Integer.parseInt(lblNum.getText().toString());
            if (l_int == 0)
                lblNum.setText("9");
            else
                lblNum.setText(lblNum.getText().toString() + "9");
        }
    };
    View.OnClickListener btnPlus_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(lblNum.getText().toString());
            op = "+";
            lblNum.setText("0");
        }
    };
    View.OnClickListener btnMinus_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(lblNum.getText().toString());
            op = "-";
            lblNum.setText("0");
        }
    };
    View.OnClickListener btnMulti_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(lblNum.getText().toString());
            op = "*";
            lblNum.setText("0");
        }
    };
    View.OnClickListener btnDivi_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Integer.parseInt(lblNum.getText().toString());
            op = "/";
            lblNum.setText("0");
        }
    };
    View.OnClickListener btnEqua_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num2 = Integer.parseInt(lblNum.getText().toString());

            if ("+".equals(op))
                lblNum.setText(String.valueOf(num1 + num2));
            if ("-".equals(op))
                lblNum.setText(String.valueOf(num1 - num2));
            if ("*".equals(op))
                lblNum.setText(String.valueOf(num1 * num2));
            if ("/".equals(op))
                lblNum.setText(String.valueOf(num1 / num2));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("log-demo", "程序啟動");
        super.onCreate(savedInstanceState);
        Log.d("log-demo", "指定XML檔");
        setContentView(R.layout.activity_main);
        Log.d("log-demo", "畫面初始化");
        InitialComponent();//findViewById
        Log.d("log-demo", "就緒");
    }

    private void InitialComponent() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_Click);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_Click);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_Click);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_Click);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_Click);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_Click);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_Click);
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_Click);
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_Click);
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_Click);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(btnPlus_Click);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(btnMinus_Click);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(btnMulti_Click);
        btnDivi = (Button) findViewById(R.id.btnDivi);
        btnDivi.setOnClickListener(btnDivi_Click);
        btnEqua = (Button) findViewById(R.id.btnEqua);
        btnEqua.setOnClickListener(btnEqua_Click);
        lblNum = (TextView) findViewById(R.id.lblNum);
    }

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn0, btnPlus, btnMinus, btnMulti, btnDivi, btnEqua;
    TextView lblNum;
}
