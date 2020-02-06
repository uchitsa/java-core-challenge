public class TaskT03N03Test {

    public static void main(String[] args) {
        testGetFirstHalfWord1();
        testGetFirstHalfWord2();
    }

    public static void testGetFirstHalfWord1() {
        src.Assert.assertEquals("testGetFirstHalfWord1", "Ja", TaskT03N03.getFirstHalfWord("Java"));
    }

    public static void testGetFirstHalfWord2() {
        src.Assert.assertEquals("testGetFirstHalfWord2", "Kot", TaskT03N03.getFirstHalfWord("Kotlin"));
    }
}
