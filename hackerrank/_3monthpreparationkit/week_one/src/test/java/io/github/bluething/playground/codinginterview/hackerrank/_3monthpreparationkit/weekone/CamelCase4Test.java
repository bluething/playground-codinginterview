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
        
    }
}