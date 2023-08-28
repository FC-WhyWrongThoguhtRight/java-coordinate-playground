package view;

import domain.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.DividedUtility.*;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    public List<Point> receiveInputs() {
        List<Point> points = new ArrayList<>();

        System.out.println("좌표를 입력하세요.");
        String input = sc.nextLine();

        for(String in : divideHyphenAndDeleteBracket(input)) {
            points.add(Point.ofCommaSeparator(in));
        }

        return points;
    }
}
