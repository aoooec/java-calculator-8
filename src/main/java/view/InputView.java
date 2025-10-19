package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readLineWithPrompt(String prompt) {
        System.out.println(prompt);
        String input = Console.readLine();
        if (input == null) {
            throw new IllegalArgumentException("입력값을 읽지 못했습니다.");
        }
        return input.trim();
    }
}
