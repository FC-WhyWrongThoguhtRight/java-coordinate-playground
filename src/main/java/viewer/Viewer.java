package viewer;

import controller.InputSpliter;
import Coordinate.Point;

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

    public void printDistance(double d){
        System.out.print("두 점 사이 거리는 ");
        System.out.println(d);
    }







}
