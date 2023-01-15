package hwJava_16_11_2022.model;

import hwJava_16_11_2022.fireAnEmployee;
import hwJava_16_11_2022.hireAnEmployee;
import hwJava_16_11_2022.jobTitle;

public class Top extends Employees implements fireAnEmployee, hireAnEmployee {
    private hwJava_16_11_2022.jobTitle jobTitle;
    protected String position;
    public Top(){
        position = String.valueOf(jobTitle.CEO);
    }
    public void show() {
        System.out.println(name + " " + position);
    }
}
