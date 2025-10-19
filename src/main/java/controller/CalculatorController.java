package controller;

import model.StringAddCalculator;
import view.InputView;
import view.ResultView;

public class CalculatorController {
    private final InputView inputView;
    private final ResultView resultView;
    private final StringAddCalculator calculator;

    public CalculatorController(InputView inputView, ResultView resultView, StringAddCalculator calculator) {
        this.inputView = inputView;
        this.resultView = resultView;
        this.calculator = calculator;
    }

    public void runOnce() {
        try {
            String input = inputView.readLineWithPrompt("덧셈할 문자열을 입력해 주세요.");
            int sum = calculator.add(input);
            resultView.printResult(sum);
        } catch (IllegalArgumentException e) {
            resultView.printError(e.getMessage());
            throw e;
        }
    }
}
