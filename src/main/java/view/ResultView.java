package view;

import domain.Coordinates;

import java.text.DecimalFormat;

import static constant.CoordinateNumber.*;
import static constant.ResultMessage.*;
import static domain.Calculator.*;

public class ResultView {
    public void showCartesianCoordinateSystem(String coordinatesInfo) {
        String cartesianCoordinateSystem = coordinatesInfo +
                " 0      2     4     6     8    10    12    14    16    18    20    22    24";
        System.out.println(cartesianCoordinateSystem);
    }

    public void showResultsBasedConditions(Coordinates coordinates) {
        DecimalFormat df = new DecimalFormat("0.########");
        if (coordinates.size() == RECTANGULAR) {
            System.out.printf(RECTANGULAR_AREA, df.format(calculateRectangleArea(coordinates)));
            return;
        } else if (coordinates.size() == TRIANGLE) {
            System.out.printf(TRIANGLE_AREA, df.format(calculateTriangleArea(coordinates)));
            return;
        }
        System.out.printf(DISTANCE_TWO_POINTS, df.format(calculateLineLength(coordinates)));
    }
}
