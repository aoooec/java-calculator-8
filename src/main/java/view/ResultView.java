package view;

public class ResultView {
    public void printResult(int sum) {
        System.out.println("결과 : " + sum);
    }
    public void printError(String message) {
        System.out.println("[Error] " + message);
    }
}
