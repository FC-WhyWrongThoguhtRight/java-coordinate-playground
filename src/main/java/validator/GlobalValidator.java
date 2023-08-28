package validator;

import java.util.regex.Pattern;

public class GlobalValidator {
    private static final Pattern pattern = Pattern.compile("\\(0?[1-9]|[1-2][0-4]\\,0?[1-9]|[1-2][0-4]\\)\\-\\(0?[1-9]|[1-2][0-4]\\,0?[1-9]|[1-2][0-4]\\)");

    public static boolean isValidPattern(String input) {
        if(pattern.matcher(input).find()) return true;
        System.out.println("잘못된 요청입니다. 다시 입력하세요");
        return false;
    }
}
