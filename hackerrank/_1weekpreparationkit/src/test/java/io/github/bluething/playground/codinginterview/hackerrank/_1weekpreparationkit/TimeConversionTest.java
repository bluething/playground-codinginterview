package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

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
        Map<String, String> am = new HashMap<>();
        am.put("01", "01");
        am.put("02", "02");
        am.put("03", "03");
        am.put("04", "04");
        am.put("05", "05");
        am.put("06", "06");
        am.put("07", "07");
        am.put("08", "08");
        am.put("09", "09");
        am.put("10", "10");
        am.put("11", "11");
        am.put("12", "00");

        Map<String, String> pm = new HashMap<>();
        pm.put("01", "13");
        pm.put("02", "14");
        pm.put("03", "15");
        pm.put("04", "16");
        pm.put("05", "17");
        pm.put("06", "18");
        pm.put("07", "19");
        pm.put("08", "20");
        pm.put("09", "21");
        pm.put("10", "22");
        pm.put("11", "23");
        pm.put("12", "12");

        String[] times = s.split(":");
        if (times[2].contains("PM")) {
            times[0] = pm.get(times[0]);
        } else {
            times[0] = am.get(times[0]);
        }

        return times[0] + ":" + times[1] + ":" + times[2].substring(0, 2);
    }
}
