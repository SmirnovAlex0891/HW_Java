package hwJava_16_11_2022.model;


import hwJava_16_11_2022.Work;
import hwJava_16_11_2022.jobTitle;

public class Freelancers extends Employees implements Work {
    private String position;

    public Freelancers() {
        position = String.valueOf(jobTitle.QA_ENGINEER);
    }
    public void show() {
        System.out.println(name + " " + position);

    }
}
