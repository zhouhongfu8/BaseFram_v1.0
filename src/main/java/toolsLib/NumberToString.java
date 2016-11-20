package toolsLib;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016-11-17.
 */
public class NumberToString {
    public static String numbertostring(String bigInteger) {
        String numberString;
        if (bigInteger.length()>=11) {
            BigDecimal big = new BigDecimal(bigInteger);
            numberString = big.toPlainString();
        } else {
            numberString = bigInteger.replace(".0", "");
        }
        return numberString;
    }

}
