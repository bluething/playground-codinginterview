package io.github.bluething.playground.codinginterview.concept.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return "";
    }
}
