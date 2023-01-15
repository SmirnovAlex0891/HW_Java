package hw_21_12_2022.Ex7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
