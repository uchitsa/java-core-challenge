package src;

import java.util.Scanner;

public class TaskT01N08Test {

    public static void main(String[] args) {
        testReadNumber12();
        testReadNumber0();
        testReadNumberMinus10();
    }

    public static void testReadNumber12() {
        Assert.assertEquals("testReadNumber1", 12, TaskT01N08.readNumber());
    }

    public static void testReadNumber0() {
        Assert.assertEquals("testReadNumber0", 0, TaskT01N08.readNumber());
    }

    public static void testReadNumberMinus10() {
        Assert.assertEquals("testReadNumber-10", -10, TaskT01N08.readNumber());
    }


}
