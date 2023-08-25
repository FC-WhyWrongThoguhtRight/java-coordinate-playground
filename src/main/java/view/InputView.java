package view;

import domain.Coordinate;

import java.util.List;
import java.util.Scanner;

import static constant.InputMessage.*;
import static utils.DivisionUtility.*;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public List<Coordinate> receiveCoordinates() {
        System.out.println(RECEIVE_COORDINATES);
        return splitCoordinates(scanner.nextLine());
    }
}
