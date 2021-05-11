package com.example.explitcitintent23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArray,mBtnParcelableFood,mBtnSerializableAnimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnParcelableFood = findViewById(R.id.buttonParcelableFood);
        mBtnSerializableAnimal = findViewById(R.id.buttonSerializableAnimal);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("string","Xin chào");
                startActivity(intent);
            }
        });
        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] arrNumbers = {1,2,3,4,5,6,7,8,9,10};
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("array",arrNumbers);
                startActivity(intent);
            }
        });

        mBtnParcelableFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Food food = new Food("Sushi",30000);

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("food",food);
                startActivity(intent);
            }
        });

        mBtnSerializableAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}