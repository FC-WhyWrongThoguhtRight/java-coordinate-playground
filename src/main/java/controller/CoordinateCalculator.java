package controller;


import figure.Figure;
import figure.FigureFactory;
import figure.Point;
import view.CoordinateView;
import view.View;

import java.util.List;

public class CoordinateCalculator {

    View view;
    CoordinateView cView;

    public CoordinateCalculator() {
        view = new View();
        cView = new CoordinateView();
    }

    public void start(){

        List<Point> points = view.inputCoordinate();

        Figure figure = FigureFactory.getInstance(points);
        cView.printPlane(figure);

        view.printArea(figure);



    }

}
