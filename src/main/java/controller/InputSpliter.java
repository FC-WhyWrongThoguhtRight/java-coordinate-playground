package controller;

import Coordinate.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputSpliter {

    public static String[] splitDash(String s){
        return s.split("-");
    }


    public static String[] getCoordinateArray(String s) {
        Pattern p = Pattern.compile("(-?\\d+)");
        Matcher matcher = p.matcher(s);

        String[] result = new String[2];
        int index = 0;
        while(matcher.find()){
            result[index++] = matcher.group();
        }

        return result;
    }


    public static Point stringsToPoint(String[] arr){
        return new Point(arr[0], arr[1]);
    }

    public static Point[] getPoints(String s) {
        String[] arr = splitDash(s);
        List<Point> result = new ArrayList<>();
        for(String inputCoordinate : arr){
            String[] coordinate = getCoordinateArray(inputCoordinate);
            result.add(stringsToPoint(coordinate));            
        }
        return result.toArray(new Point[0]);
    }
}
