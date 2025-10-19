package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tokenizer {
    public List<String> split(String body, String delimiterRegex) {
        String[] parts = body.split(delimiterRegex, -1);
        if (parts.length == 0) {
            return Collections.emptyList();
        }
        List<String> tokens = new ArrayList<>(parts.length);
        tokens.addAll(Arrays.asList(parts));
        return tokens;
    }
}
