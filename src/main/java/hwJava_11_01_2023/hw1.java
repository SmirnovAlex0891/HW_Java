package hwJava_11_01_2023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

public class hw1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new  FileReader("text.txt"))){
            int characters;
            while ((characters = reader.read()) != -1) {
                sb.append((char) characters);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        String s = sb.toString();
        String[] arrayStr = s.toLowerCase().split("\\P{LD}+");
        Arrays.stream(arrayStr)
                .sorted()
                .forEach(System.out::println);

        arrayStr = Arrays.stream(arrayStr)
                .sorted(Collections.reverseOrder())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(arrayStr));
    }
}
