package hw_21_12_2022.Ex9;

import java.util.HashMap;
import java.util.Map;


public class Ex9 {
    public static void main(String[] args) {
        String s = "AAGGTFFDDVVAA";

        Map<Character, Integer> map = s.chars()
                .map(e -> {
                    if (e > 64 && e < 91 | e > 96 && e < 123)
                        return e;
                    else {
                        try {
                            throw new MyException("String cannot contain anything other than CHAR!");
                        } catch (MyException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                })
                .mapToObj(e -> (char) e)
                .collect(HashMap::new, (m, letter) -> {
                    if (m.containsKey(letter))
                        m.put(letter, m.get(letter) + 1);
                    else
                        m.put(letter, 1);
                }, HashMap::putAll);
        String res = new String();

        for (Map.Entry entry : map.entrySet()) {
            res = res + entry.getValue() + entry.getKey();
        }
        System.out.println(res);
    }
}
