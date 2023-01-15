package hwJava_11_01_2023;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class hw3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String s;
            while ((s = reader.readLine()) != null) {
                sb.append(s);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of(sb.toString().split("\\P{LD}+"));
        streamSupplier.get().filter(str -> str.length() == streamSupplier.get()
                        .max(Comparator.comparingInt(String::length)).get().length())
                .forEach(System.out::println);
    }
}
