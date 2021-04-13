package com.gs.lab6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import androidx.annotation.Nullable;
import org.w3c.dom.Text;

public class activity_hoadon extends Activity {
    Button BT1;
    TextView KH, TH, SL, DG, TT;

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_hoadon);

        BT1 = (Button)findViewById(R.id.BtnTrove);
        KH = (TextView)findViewById(R.id.TxtKhachhang1);
        TH = (TextView)findViewById(R.id.TxtTenHang1);
        SL = (TextView)findViewById(R.id.TxtSoluong1);
        DG = (TextView)findViewById(R.id.TxtDongia1);
        TT = (TextView)findViewById(R.id.TxtThanhTien);

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("MyPackage");

        KH.setText("Ten Khach Hang: "+packageFromCaller.getString("KH1"));
        TH.setText("Ten Hang: "+packageFromCaller.getString("TH1"));
        SL.setText("So Luong: "+packageFromCaller.getInt("SL1"));
        DG.setText("Don Gia: "+packageFromCaller.getDouble("DG1"));

        int SL1 = packageFromCaller.getInt("SL1");
        Double DG1 = packageFromCaller.getDouble("DG1");


        Double Tien = SL1 * DG1;
        TT.setText("Thanh Tien: "+Tien);
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
