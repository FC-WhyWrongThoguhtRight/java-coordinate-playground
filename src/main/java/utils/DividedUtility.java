package utils;

public class DividedUtility {
    public static String[] divideHyphenAndDeleteBracket(String input) {
        return input.replaceAll("[()]", "").split("-");
    }
}
