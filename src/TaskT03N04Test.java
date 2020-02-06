public class TaskT03N04Test {

    public static void main(String[] args) {
        testIsPalindrome1();
        testIsPalindrome2();
        testIsPalindrome3();
        testIsPalindrome4();
    }

    private static void testIsPalindrome1() {
        src.Assert.assertEquals("testIsPalindrome1", true, TaskT03N04.isPalindrome("rotor"));
    }

    private static void testIsPalindrome2() {
        src.Assert.assertEquals("testIsPalindrome2", false, TaskT03N04.isPalindrome("java"));
    }

    private static void testIsPalindrome3() {
        src.Assert.assertEquals("testIsPalindrome3", true, TaskT03N04.isPalindrome("baoboab"));
    }

    private static void testIsPalindrome4() {
        src.Assert.assertEquals("testIsPalindrome4", false, TaskT03N04.isPalindrome("kotlin"));
    }
}
