package hw_21_12_2022.Ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        Student st0 = new Student("Steven","King", 'm', 23, 3, 7.5);
        Student st1 = new Student("Neena" , "Kochhar", 'f', 25, 2, 7.4);
        Student st2 = new Student("Alexander" , "Hunold", 'm', 24, 4, 8.4);
        Student st3 = new Student("Bruce" , "Ernst", 'm', 27, 3, 9.4);
        Student st4 = new Student("Diana" , "Lorentz", 'f', 30, 2, 6.5);
        Student st5 = new Student("Shelli" , "Baida", 'f', 32, 4, 9.9);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st0);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Map<Integer, List<Student>> map = list.stream()
                .map(student -> {student.setName(student.getName().toUpperCase());
                student.setLastName(student.getLastName().toUpperCase());
                return student;})
                .collect(Collectors.groupingBy(student -> student.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
