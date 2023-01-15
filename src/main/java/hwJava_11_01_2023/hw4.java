package hwJava_11_01_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hw4 {
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
        Map<String, Integer> map = new HashMap<>();
        String[] arrayStr = sb.toString().toLowerCase().split("\\P{LD}+");
        Arrays.stream(arrayStr)
                .forEach(word -> {
                    map.merge(word, 1, Integer::sum);
                });
        int sum = 0;
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
            sum += m.getValue();
        }
        System.out.println("Number of words " + sum);
    }
}
