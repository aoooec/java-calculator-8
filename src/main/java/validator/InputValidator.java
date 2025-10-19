package validator;

public class InputValidator {
    public int parsePositiveInt(String token) {
        if (token == null) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        String t = token.trim();
        if (t.isEmpty()) {
            return 0;
        }
        if (!t.matches("\\d+|-[0-9]+")) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다 : " + t);
        }
        int value = Integer.parseInt(t);
        if (value <= 0) {
            throw new IllegalArgumentException("양의 정수만 입력할 수 있습니다 : " + value);
        }
        return value;
    }
}
