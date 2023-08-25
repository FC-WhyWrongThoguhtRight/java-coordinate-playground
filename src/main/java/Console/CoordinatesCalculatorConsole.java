package Console;

import domain.Coordinates;
import view.InputView;
import view.ResultView;

public class CoordinatesCalculatorConsole {
    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();

    public static void run() {
        try {
            Coordinates coordinates = Coordinates.of(inputView.receiveCoordinates());
            resultView.showCartesianCoordinateSystem(coordinates.toString());
            resultView.showResultsBasedConditions(coordinates);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            run();
        }
    }
}
