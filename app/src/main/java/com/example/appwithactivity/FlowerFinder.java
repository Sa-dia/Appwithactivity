package com.example.appwithactivity;

import java.util.ArrayList;
import java.util.List;


public class FlowerFinder {
    List<String> getFlower(String color) {
        List<String> Flower = new ArrayList<>();
        if (color.equals("yellow")) {
            Flower.add("sunflower");

        }
        else if (color.equals("red")) {
            Flower.add("rose");

        }
        else if (color.equals("pink")) {
            Flower.add("lily");


        }
        else if (color.equals("blue")) {
            Flower.add("orchid");

        }
        else if (color.equals("white")) {
            Flower.add("lotus");

        }

        return Flower;
    }
}
