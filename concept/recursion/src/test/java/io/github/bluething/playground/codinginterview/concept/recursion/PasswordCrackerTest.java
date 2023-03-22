package io.github.bluething.playground.codinginterview.concept.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/password-cracker/problem
class PasswordCrackerTest {

    @Test
    void case01() {
        Assertions.assertEquals("we do what we must because we can", passwordCracker(List.of("because", "can", "do", "must", "we", "what"), "wedowhatwemustbecausewecan"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("WRONG PASSWORD", passwordCracker(List.of("hello", "planet"), "helloworld"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("ab cd", passwordCracker(List.of("ab", "abcd", "cd"), "abcd"));
    }

    private String passwordCracker(List<String> passwords, String loginAttempt) {
        List<String> results = new ArrayList<>();
        cracker(passwords, loginAttempt, results);

        StringBuilder result = new StringBuilder();
        for (String s : results) {
            result.append(s).append(" ");
        }

        return results.size() == 0 ? "WRONG PASSWORD" : result.toString().trim();
    }

    private List<String> cracker(List<String> passwords, String loginAttempt, List<String> results) {
        if (loginAttempt.length() == 0) {
            return results;
        }

        for (String password : passwords) {
            if (loginAttempt.indexOf(password, 0) == 0) {
                results.add(password);
                return cracker(passwords, loginAttempt.substring(password.length()), results);
            }
        }

        return cracker(passwords, "", results);
    }
}
