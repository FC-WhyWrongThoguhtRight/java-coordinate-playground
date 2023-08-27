package controller;

import figure.Point;

import java.util.ArrayList;
import java.util.List;

public class InputSpliter {

    public static String[] splitDash(String s){
        return s.split("-");
    }

    public static String getCoordinate(String s){
         return s.replaceAll("[()]", "");
    }

    public static List<Point> getPointList(String input){
        List<Point> result = new ArrayList<>();

        for(String s : splitDash(input)){
            result.add(Point.ofCommaSeparator(getCoordinate(s)));
        }

        return result;
    }

}
