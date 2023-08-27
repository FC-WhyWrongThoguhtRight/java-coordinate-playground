package controller;

import Coordinate.Point;
import figure.Figure;
import figure.FigureFactroy;
import viewer.CoordinateViewer;
import viewer.Viewer;

public class CoordinateCalculator {

    Viewer viewer;

    public CoordinateCalculator() {
        viewer = new Viewer();
    }

    public void start() {

        Point[] points = viewer.getCoordinateInput();
        Figure figure = FigureFactroy.create(points);

        CoordinateViewer coordinateViewer = new CoordinateViewer();
        coordinateViewer.printPlane(figure);

        viewer.printArea(figure);


    }
}
