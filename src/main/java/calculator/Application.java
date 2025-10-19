package calculator;

import controller.CalculatorController;
import model.StringAddCalculator;
import view.InputView;
import view.ResultView;

public class Application {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController(
                new InputView(),
                new ResultView(),
                new StringAddCalculator()
        );
        controller.runOnce();
    }
}
