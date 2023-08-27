package viewer;

import Coordinate.Point;
import figure.Figure;

import java.util.Arrays;

public class CoordinateViewer {

    String[][] plane;

    public CoordinateViewer() {

        plane = new String[25][25];

        for (String[] strings : plane) {
            Arrays.fill(strings, " ");
        }
    }

    public void printPlane(Figure figure){


        for(Point p : figure.getPoints()){
            dottingPlane(p);
        }

        draw();

    }

    private void dottingPlane(Point p) {
        plane[p.getX()][24 - p.getY()] = "*";
    }

    void draw(){
        for(int i = 0 ; i < plane.length-1 ; i++){
            int y = 24-i;
            if(y % 2 == 0){
                System.out.printf("%2d|", y);
            }else{
                System.out.print("  |");
            }
            for(int j = 0 ; j < plane[i].length ; j++){
                System.out.printf("%2s", plane[i][j]);
            }
            System.out.println();
        }
        System.out.print("  +");
        for(int i = 0 ; i < plane.length ; i++){
            System.out.print("—–");
        }
        System.out.println();
        System.out.print("  0");
        for(int i = 1 ; i < plane.length ; i++){
            if(i % 2 == 0){
                System.out.printf("%2d" ,i);
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

}
