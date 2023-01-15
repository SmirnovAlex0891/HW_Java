package hwJava_11_01_2023;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class hw2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String s;
            while ((s = reader.readLine()) != null) {
               sb.append(s);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        String text = sb.toString();
        System.out.println(ex(text));
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
