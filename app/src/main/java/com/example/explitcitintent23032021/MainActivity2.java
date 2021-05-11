package com.example.explitcitintent23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Nhận dữ liệu dạng string
//        Intent intent = getIntent();
//        String chuoi = intent.getStringExtra("string");
//        Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();

        // 2 : Nhận dữ liệu dạng array
        Intent intent = getIntent();
        int[] arrNumbers = intent.getIntArrayExtra("array");
        Toast.makeText(this, arrNumbers.length + "", Toast.LENGTH_SHORT).show();
    }
}