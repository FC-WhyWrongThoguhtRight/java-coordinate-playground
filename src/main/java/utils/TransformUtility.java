package utils;

import java.text.DecimalFormat;

public class TransformUtility {
    public static String DoubleToString(double number) {
        DecimalFormat df = new DecimalFormat("0.#####");
        return df.format(number);
    }
}
