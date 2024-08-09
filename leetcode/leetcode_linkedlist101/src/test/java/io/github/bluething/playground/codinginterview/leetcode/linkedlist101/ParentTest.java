package io.github.bluething.playground.codinginterview.leetcode.linkedlist101;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class ParentTest {
    public final ByteArrayOutputStream output = new ByteArrayOutputStream();
    public final PrintStream originalOutput = System.out;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOutput);
    }

    protected void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }
}
