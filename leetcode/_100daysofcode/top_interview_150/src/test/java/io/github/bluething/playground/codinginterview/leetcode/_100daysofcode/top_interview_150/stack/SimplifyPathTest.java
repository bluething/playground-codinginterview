package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// https://leetcode.com/problems/simplify-path/?envType=study-plan-v2&envId=top-interview-150
class SimplifyPathTest {

    @Test
    void case01() {
        Assertions.assertEquals("/home", simplifyPath("/home/"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("/", simplifyPath("/../"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("/home/foo", simplifyPath("/home//foo/"));
    }

    @Test
    void case04() {
        Assertions.assertEquals("/home", simplifyPath2("/home/"));
    }

    @Test
    void case05() {
        Assertions.assertEquals("/", simplifyPath2("/../"));
    }

    @Test
    void case06() {
        Assertions.assertEquals("/home/foo", simplifyPath2("/home//foo/"));
    }

    // split the path by /
    //  we only need to take care . or .. or empty (double slash)
    private String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }

            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack);
    }

    // use ArrayDeque if we want to add/remove items to both ends
    // use LinkedLists if we're doing lots of add/remove in the middle.
    private String simplifyPath2(String path) {
        Deque<String> deque = new ArrayDeque<>();
        for (String dir : path.split("/")) {
            if (dir.equals(".") || dir.isEmpty()) {
                continue;
            }

            if (dir.equals("..")) {
                deque.pollLast();
            } else {
                deque.add(dir);
            }
        }
        return "/" + String.join("/", deque);
    }
}
