package controller;

import Coordinate.Point;
import figure.Line;
import viewer.CoordinateViewer;
import viewer.Viewer;

public class CoordinateCalculator {

    Viewer viewer;

    public CoordinateCalculator() {
        viewer = new Viewer();
    }

    public void start() {

        Point[] points = viewer.getCoordinateInput();
        Line line = new Line(points[0], points[1]);

        CoordinateViewer coordinateViewer = new CoordinateViewer();
        coordinateViewer.printPlane(line);

        viewer.printDistance(line.getDistance());


    }
}
