package com.gs.maytinh1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText N1, N2;
    TextView Kq;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N1 = (EditText)findViewById(R.id.EdtN1);
        N2 = (EditText)findViewById(R.id.EdtN2);
        Kq = (TextView)findViewById(R.id.TxTKq);
        bt = (Button)findViewById(R.id.BtnKQ);
        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Double A = Double.parseDouble(N1.getText().toString());
                Double B = Double.parseDouble(N2.getText().toString());
                Kq.setText(""+(A+B));
            }
        });
    }


}