package view;

import figure.Figure;
import figure.Point;

import java.util.Arrays;

public class CoordinateView {

    private final int X_LIMIT = 25;
    private final int Y_LIMIT = 25;

    String[][] plane;


    public CoordinateView(){
        plane = new String[X_LIMIT][Y_LIMIT];

        for(String[] strings : plane){
            Arrays.fill(strings, " ");
        }
    }

    public void printPlane(Figure figure){
        for(Point p : figure.getPoints()){
            markPlane(p);
        }

        draw();
    }

    private void markPlane(Point p) {
        plane[p.getX()][p.getY()] = "*";
    }

    void draw(){
        for(int i = Y_LIMIT-1 ; i >= 0 ; i--){
            if(i % 2 == 0){
                System.out.printf("%2d|", i);
            }else{
                System.out.print("  |");
            }
            for(int j = 0 ; j < X_LIMIT ; j++){
                System.out.printf("%2s", plane[j][i]);
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
                System.out.print(" ");
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
