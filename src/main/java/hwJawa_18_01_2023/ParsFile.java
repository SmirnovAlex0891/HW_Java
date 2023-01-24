package hwJawa_18_01_2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsFile {
    public void parser(String s) {
        if (s.isEmpty()) return;
        String regex = "^(Name)(.+)(Number)(.+)(CVV)(.+)(Date)(.+)/(.+)";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);

        String name = "";
        String cardNumber = "";
        String cvv = "";
        String mouth = "";
        String year = "";

        while (matcher.find()) {
            name = matcher.group(2);
            cardNumber = parsNumber(matcher.group(4));
            cvv = matcher.group(6);
            mouth = matcher.group(8);
            year = matcher.group(9);
        }
        System.out.printf("Name: %-25s Card number: %-21s CVV: %-5s Date: %2s/%-4s\n", name, cardNumber, cvv, mouth, year);

    }
    private static String parsNumber(String strNum) {
        if (strNum.isEmpty()) return null;
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})";
        Pattern patternNum = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcherNum = patternNum.matcher(strNum);
        String cardNum = matcherNum.replaceAll("$1 $2 $3 $4");
        return cardNum;
    }
}
