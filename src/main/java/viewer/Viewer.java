package viewer;

import controller.InputSpliter;
import Coordinate.Point;
import figure.Figure;

import java.util.Scanner;

public class Viewer {

    Scanner sc;

    public Viewer() {
        sc = new Scanner(System.in);
    }

    final String coordinateInput = "좌표를 입력하세요.";

    public Point[] getCoordinateInput(){
        System.out.println(coordinateInput);
        String s = sc.nextLine();
        return InputSpliter.getPoints(s);
    }

    public void printArea(Figure f){
        System.out.print(f.toString());
    }







}
