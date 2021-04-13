package com.gs.lab6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button Bt;
    EditText Soluong,Dongia,Khachhang,Tenhang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bt = (Button)findViewById(R.id.BtnIn);
        Soluong = (EditText)findViewById((R.id.EdtSoluong));
        Dongia = (EditText)findViewById(R.id.EdtDongia);
        Khachhang = (EditText)findViewById((R.id.EdtKhachhang));
        Tenhang = (EditText)findViewById(R.id.EdtTenhang);
        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,activity_hoadon.class);

                int SL = Integer.parseInt(Soluong.getText().toString());
                Double DG = Double.parseDouble(Dongia.getText().toString());
                String KH = Khachhang.getText().toString();
                String TH = Tenhang.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("KH1",KH);
                bundle.putString("TH1",TH);
                bundle.putInt("SL1",SL);
                bundle.putDouble("DG1",DG);
                intent.putExtra("MyPackage",bundle);
                startActivity(intent);

            }
        });
    }
}