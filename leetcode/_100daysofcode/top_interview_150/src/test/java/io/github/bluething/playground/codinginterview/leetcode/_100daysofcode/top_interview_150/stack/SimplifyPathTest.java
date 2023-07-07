package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/simplify-path/?envType=study-plan-v2&envId=top-interview-150
class SimplifyPathTest {

    @Test
    void case01() {
        Assertions.assertEquals("/home/", simplifyPath("/home/"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("/", simplifyPath("/../"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("/home/foo", simplifyPath("/home//foo/"));
    }

    private String simplifyPath(String path) {
        return "";
    }
}
