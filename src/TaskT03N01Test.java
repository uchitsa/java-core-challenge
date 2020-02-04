public class TaskT03N01Test {

    public static void main(String[] args) {
        testGetNthSymbol1();
        testGetNthSymbol2();
        testGetNthSymbol3();
    }

    private static void testGetNthSymbol1() {
        src.Assert.assertEquals("testGetNthSymbol1", 'J', src.TaskT03N01.getNthSymbol("Java", 0));
    }

    private static void testGetNthSymbol2() {
        src.Assert.assertEquals("testGetNthSymbol2", 'a', src.TaskT03N01.getNthSymbol("Java", 3));
    }

    private static void testGetNthSymbol3() {
        src.Assert.assertEquals("testGetNthSymbol3", 'i', src.TaskT03N01.getNthSymbol("Kotlin", 4));
    }

}
