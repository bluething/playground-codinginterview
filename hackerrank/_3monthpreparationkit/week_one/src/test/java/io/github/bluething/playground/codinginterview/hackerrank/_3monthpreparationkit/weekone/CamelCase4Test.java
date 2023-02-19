package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-camel-case/problem
public class CamelCase4Test extends ParentTest {
    @Test
    public void case01() {
        convertToCamelCase("S;M;plasticCup()");
        Assertions.assertEquals("plastic cup", output.toString());
    }

    @Test
    public void case02() {
        convertToCamelCase("C;V;mobile phone");
        Assertions.assertEquals("mobilePhone", output.toString());
    }

    @Test
    public void case03() {
        convertToCamelCase("C;C;coffee machine");
        Assertions.assertEquals("CoffeeMachine", output.toString());
    }

    @Test
    public void case04() {
        convertToCamelCase("S;C;LargeSoftwareBook");
        Assertions.assertEquals("large software book", output.toString());
    }

    @Test
    public void case05() {
        convertToCamelCase("C;M;white sheet of paper");
        Assertions.assertEquals("whiteSheetOfPaper()", output.toString());
    }

    @Test
    public void case06() {
        convertToCamelCase("S;V;pictureFrame");
        Assertions.assertEquals("picture frame", output.toString());
    }

    private void convertToCamelCase(String input) {
        String[] inputs = input.split("\\;+");
        Operator operator;
        if (inputs[0].equals("S")) {
            operator = new Split();
        } else {
            operator = new Combine();
        }

        System.out.print(operator.operate(inputs[1], inputs[2]));
    }
}



interface Operator {
    String operate(String type, String source);
}

class Split implements Operator {

    @Override
    public String operate(String type, String source) {
        if (type.equals("M")) {
            source = source.substring(0, source.indexOf('('));
        }

        StringBuilder splitted = new StringBuilder();
        String[] sources = source.split("(?=\\p{Upper})");
        for (int i = 0; i < sources.length; i++) {
            splitted.append(sources[i].toLowerCase()).append(" ");
        }

        return splitted.toString().trim();
    }
}
class Combine implements Operator {
    @Override
    public String operate(String type, String source) {
        String[] value = source.split("\\s+");
        StringBuilder combined = new StringBuilder();

        if (type.equals("C")) {
            combined.append(value[0].substring(0,1).toUpperCase()).append(value[0].substring(1));
        } else {
            combined.append(value[0]);
        }

        for (int i = 1; i < value.length; i++) {
            combined.append(value[i].substring(0,1).toUpperCase()).append(value[i].substring(1));
        }

        if (type.equals("M")) {
            combined.append("()");
        }

        return combined.toString();
    }
}