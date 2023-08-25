package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    public static double calculateLineLength(Coordinates coordinates) {
        List<Double> lineLengths = new ArrayList<>(coordinates.calculateLineLength());
        return lineLengths.get(0);
    }

    public static double calculateRectangleArea(Coordinates coordinates) {
        List<Double> lineLengths = new ArrayList<>(coordinates.calculateLineLength());
        Collections.sort(lineLengths);
        return lineLengths.get(0) * lineLengths.get(1);
    }

    public static double calculateTriangleArea(Coordinates coordinates) {
        List<Double> lineLengths = new ArrayList<>(coordinates.calculateLineLength());
        double area = 1;
        double sum = (lineLengths.get(0)+lineLengths.get(1)+lineLengths.get(2))/2.0;
        for(int i = 0; i < lineLengths.size(); i++) {
            area *= (sum - lineLengths.get(i));
        }
        return Math.sqrt(area*sum);
    }
}
