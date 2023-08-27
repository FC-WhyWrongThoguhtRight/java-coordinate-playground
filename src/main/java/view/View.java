package view;

import controller.InputSpliter;
import figure.Figure;
import figure.Point;

import java.util.List;
import java.util.Scanner;

public class View {

    Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public List<Point> inputCoordinate(){
        System.out.println("좌표를 입력 하세요.");
        String input = sc.nextLine();

        List<Point> result;

        try{
            result = InputSpliter.getPointList(input);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
            result = inputCoordinate();
        }
        return result;
    }


    public void printArea(Figure figure) {
        System.out.println(figure.toString());
    }
}
