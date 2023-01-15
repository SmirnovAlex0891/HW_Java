package hw_21_12_2022.Ex4;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo","ffff");

        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of("ddd2", "aa2", "bb1", "bb3", "cc", "aaa2");
        streamSupplier.get().filter(str -> str.length() == streamSupplier.get()
                .max(Comparator.comparingInt(String::length)).get().length())
                .forEach(System.out::println);

    }
}
