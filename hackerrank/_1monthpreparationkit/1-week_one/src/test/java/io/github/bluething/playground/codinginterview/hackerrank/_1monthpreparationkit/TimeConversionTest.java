package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TimeConversionTest {
    @Test
    public void case01() {
        Assertions.assertEquals("19:05:45", timeConversion("07:05:45PM"));
    }

    private String timeConversion(String s) {
        Map<String, String> morning = new HashMap<>() {{
            put("12", "00");
            put("01", "01");
            put("02", "02");
            put("03", "03");
            put("04", "04");
            put("05", "05");
            put("06", "06");
            put("07", "07");
            put("08", "08");
            put("09", "09");
            put("10", "10");
            put("11", "11");
        }};
        Map<String, String> evening = new HashMap<>(){{
            put("12", "12");
            put("01", "13");
            put("02", "14");
            put("03", "15");
            put("04", "16");
            put("05", "17");
            put("06", "18");
            put("07", "19");
            put("08", "20");
            put("09", "21");
            put("10", "22");
            put("11", "23");
        }};;

        String[] timeComponents = s.split(":");
        String hour = "";
        if (timeComponents[2].endsWith("AM")) {
            hour = morning.get(timeComponents[0]);
        } else {
            hour = evening.get(timeComponents[0]);
        }

        return String.format("%s:%s:%s", hour, timeComponents[1], timeComponents[2].substring(0, 2));
    }
}
