package hw_21_12_2022.Ex12;

import org.apache.commons.lang3.StringUtils;

public class Ex12 {
    public static void main(String[] args) {
        String s = "my name is big bob";

        System.out.println(ex(s));
    }

    private static String ex(String s) {
        String[] arrS = StringUtils.split(s);
        String x = new String();
        for (int i = arrS.length-1; i >= 0 ; i--) {
            x = x + (arrS[i]) + " ";
        }
        return x;
    }
}
