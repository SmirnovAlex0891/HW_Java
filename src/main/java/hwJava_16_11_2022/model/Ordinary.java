package hwJava_16_11_2022.model;

import hwJava_16_11_2022.Work;
import hwJava_16_11_2022.jobTitle;

public class Ordinary extends Employees implements Work {
    private String position;

    public Ordinary() {
        position = String.valueOf(jobTitle.DEVELOPER);
    }
    public void show() {
        System.out.println(name + " " + position);

    }

}
