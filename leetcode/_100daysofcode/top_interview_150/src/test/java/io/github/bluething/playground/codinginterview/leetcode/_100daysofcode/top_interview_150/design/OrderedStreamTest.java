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

        private int ptr;
        private final String[] streams;

        public OrderedStream(int n) {
            streams = new String[n];
            ptr = 0;
        }

        public List<String> insert(int idKey, String value) {
            List<String> result = new ArrayList<>();
            streams[idKey-1] = value;
            // minor optimization when we can eliminate ptr < streams.length from the condition
            // we can use a dummy element that mark end of list
            // instead of using n array, we can use n+1 array
            // so the element in index n will always be null
            while (ptr < streams.length && streams[ptr] != null) {
                result.add(streams[ptr]);
                ptr++;
            }

            return result;
        }
    }
}
