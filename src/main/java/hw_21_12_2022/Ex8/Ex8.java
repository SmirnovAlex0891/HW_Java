package hw_21_12_2022.Ex8;

import java.util.*;


public class Ex8 {
    public static void main(String[] args) {
        Integer[] arr = {10, 23, 65, 48, 81, 65, 42, 23, 101, 25, 7, 8};

            Arrays.stream(arr).sorted(Collections.reverseOrder())
                    .limit(7)
                    .forEach(System.out::println);
    }
}
