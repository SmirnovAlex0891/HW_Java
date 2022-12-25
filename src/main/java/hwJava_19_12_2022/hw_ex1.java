package hwJava_19_12_2022;

import java.util.Arrays;


public class hw_ex1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 9, 17, 6, 12, 17, 18, 19, 10, 11, 14, 24, 29, 21, 27, 26};

        testMetod(arr);

    }

    private static void testMetod(int[] arr) {
        int w = Arrays.stream(arr)
                .map(el -> {
                    if (el % 2 == 0) {
                        el = el * 3;
                    } else {
                        el = el * 5;
                    }
                    return el;
                })
                .filter(el -> el > 25)
                .reduce((el1, el2) -> el1 + el2)
                .getAsInt();
        System.out.println(w);
    }
}
