import domain.Line;
import domain.Point;
import domain.Square;
import domain.Triangle;
import validator.GlobalValidator;
import viewer.InputView;
import viewer.ResultView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Dispatcher {


    private static Dispatcher instance;

    private Dispatcher() {
    }

    public static Dispatcher getInstance() {
        if (instance == null) {
            instance = new Dispatcher();
        }
        return instance;
    }

    public void service() {
        String input;
        do {
            input = InputView.inputPosition();
        } while (!GlobalValidator.isValidPattern(input));

        List<Point> points = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(input, "-");
        while (st.hasMoreTokens()) {
            String[] split = st.nextToken().split("[(,)]");
            points.add(new Point(Integer.parseInt(split[1]), Integer.parseInt(split[2])));
        }

        if (points.size() == 2) {
            Line line = Line.create(points);
            ResultView.outputBetween(line.getBetween());
        }
        if (points.size() == 3) {
            Triangle triangle = Triangle.create(points);
            ResultView.outputAreaTriangle(triangle.getArea());
        }
        if (points.size() == 4) {
            Square square = Square.create(points);
            ResultView.outputAreaSquare(square.getArea());
        }
    }
}
