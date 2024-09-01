package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodelandUsernameValidationTest {
    @Test
    void case01() {
        Assertions.assertEquals("false", CodelandUsernameValidation("aa_"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("true", CodelandUsernameValidation("u__hello_world123"));
    }
    private String CodelandUsernameValidation(String str) {
        if (str == null || str.length() < 4 || str.length() > 25) {
            return "false";
        }
        if (!Character.isLetter(str.charAt(0))) {
            return "false";
        }
        if (str.charAt(str.length() - 1) == '_') {
            return "false";
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                if (c != '_') {
                    return "false";
                }
            }
        }
        return "true";
    }
}
