package view;

import domain.figure.Figure;
import domain.figure.FigureCreator;
import domain.figure.FigureCreatorImpl;

public class Console {
    public static void run() {
        InputView inputView = new InputView();
        FigureCreator figureCreator = new FigureCreatorImpl();
        Figure figure = figureCreator.create(inputView.receiveInputs());
        figure.calculate();
    }
}
