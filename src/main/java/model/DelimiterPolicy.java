package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterPolicy {
    private static final Pattern CUSTOM = Pattern.compile("^//(.)\\n(.*)$", Pattern.DOTALL);
    private static final String DEFAULT_REGEX = "[,:]";

    public Result resolve(String raw) {
        String normalized = raw.replace("\\n", "\n"); // 실제 개행이 아닌 경우를 커버
        Matcher m = CUSTOM.matcher(normalized);
        if (m.matches()) {
            String custom = Pattern.quote(m.group(1));
            String body = m.group(2);
            String combined = DEFAULT_REGEX + "|" + custom;
            return new Result(body, combined);
        }
        return new Result(raw, DEFAULT_REGEX);
    }

    public record Result(String body, String regex) {}
}
