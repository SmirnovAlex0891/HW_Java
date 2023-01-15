package hw_21_12_2022.Ex6;

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        int[] arr = {10, 23, 65, 48, 81, 65, 42, 23, 101, 25, 7, 8};

        Arrays.stream(arr)
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
    }
}
