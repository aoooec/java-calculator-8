package model;

import validator.InputValidator;

import java.util.List;

public class StringAddCalculator {
    private final DelimiterPolicy delimiterPolicy = new DelimiterPolicy();
    private final Tokenizer tokenizer = new Tokenizer();
    private final InputValidator validator = new InputValidator();

    public int add(String raw) {
        if (raw == null || raw.trim().isEmpty()) {
            return 0;
        }
        DelimiterPolicy.Result policy = delimiterPolicy.resolve(raw);
        List<String> tokens = tokenizer.split(policy.body(), policy.regex());
        int sum = 0;
        for (String token : tokens) {
            int value = validator.parsePositiveInt(token);
            sum += value;
        }
        return sum;
    }
}
