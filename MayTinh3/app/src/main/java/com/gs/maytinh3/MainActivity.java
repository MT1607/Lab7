package com.gs.maytinh3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText EdtKQ;
    double Sotruoc = 0, Sosau = 0, Kq = 0;
    String Toantu="",Toanhang="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtKQ = (EditText)findViewById(R.id.EdtKQ);
        int [] arr={R.id.Btn0, R.id.Btn1, R.id.Btn2, R.id.Btn3, R.id.Btn4, R.id.Btn5, R.id.Btn6, R.id.Btn7, R.id.Btn8, R.id.Btn9, R.id.BtnBang,
                R.id.BtnCham, R.id.BtnChia, R.id.BtnCong, R.id.BtnNhan, R.id.BtnDel, R.id.BtnNull, R.id.BtnTru};

        for (int id:arr){
            View v=(View) findViewById(id);
            v.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnCong:
                Toantu = "+";
                Sotruoc = Double.parseDouble(Toanhang);
                Toanhang = "0";
                break;

            case R.id.BtnTru:
                Toantu = "-";
                Sotruoc = Double.parseDouble(Toanhang);
                Toanhang = "0";
                break;

            case R.id.BtnNhan:
                Toantu = "*";
                Sotruoc = Double.parseDouble(Toanhang);
                Toanhang = "0";
                break;

            case R.id.BtnChia:
                Toantu = "/";
                Sotruoc = Double.parseDouble(Toanhang);
                Toanhang = "0";
                break;
            case R.id.BtnBang:
                Sosau = Double.parseDouble(Toanhang);
                if(Toantu == "+")
                    Kq = Sotruoc + Sosau;
                if(Toantu == "-")
                    Kq = Sotruoc - Sosau;
                if(Toantu == "*")
                    Kq = Sotruoc * Sosau;
                if(Toantu == "/")
                    if (Sosau == 0)
                        Kq = 0;
                    else
                        Kq = Sotruoc / Sosau;

                Toanhang = Double.toString(Kq);
                EdtKQ.setText(Toanhang);
                break;
            case  R.id.BtnDel:
                EdtKQ.setText("");
                Toanhang = "0";
                Sotruoc = Sosau = Kq = 0;
                break;

            default:
                if(Toanhang.equals("0"))
                        Toanhang = "";
                Toanhang +=((Button)v).getText().toString();
                EdtKQ.setText(Toanhang);
        }
    }
}