package utils;

import static constant.CoordinateNumber.*;

public class ValidateUtility {
    public static boolean validateLength(int position) {
        if (position > MIN_VALUE && position <= MAX_VALUE) {
            return true;
        }
        return false;
    }
}
