import domain.Figure;
import domain.FigureCreator;
import domain.FigureCreatorImpl;
import domain.Point;
import validator.GlobalValidator;
import viewer.InputView;
import viewer.ResultView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Dispatcher {
    private final FigureCreator figureCreator = new FigureCreatorImpl();

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

        Figure figure = figureCreator.create(points);
        ResultView.outputString(figure.toString());
    }
}
