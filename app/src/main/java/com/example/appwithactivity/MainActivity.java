package com.example.appwithactivity;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;



public class MainActivity extends AppCompatActivity {

    private FlowerFinder expert = new FlowerFinder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindFlower(View view) {
        Spinner color = (Spinner) findViewById(R.id.color);
        String SelectedFlower = String.valueOf(color.getSelectedItem());

        List<String> flowerList = expert.getFlower(SelectedFlower);

        StringBuilder flowerFormatted = new StringBuilder();
        for (String flower : flowerList) {
            flowerFormatted.append(flower).append('\n');
        }

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(flowerFormatted);
    }
}