package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/design-an-ordered-stream/
class OrderedStreamTest {

    @Test
    void case01() {
        OrderedStream os = new OrderedStream(5);
        Assertions.assertEquals(Collections.emptyList(), os.insert(3, "ccccc"));
        Assertions.assertEquals(List.of("aaaaa"), os.insert(1, "aaaaa"));
        Assertions.assertEquals(List.of("bbbbb", "ccccc"), os.insert(2, "bbbbb"));
        Assertions.assertEquals(Collections.emptyList(), os.insert(5, "eeeee"));
        Assertions.assertEquals(List.of("ddddd", "eeeee"), os.insert(4, "ddddd"));
    }

    class OrderedStream {

        public OrderedStream(int n) {

        }

        public List<String> insert(int idKey, String value) {
            List<String> result = new ArrayList<>();

            return result;
        }
    }
}
