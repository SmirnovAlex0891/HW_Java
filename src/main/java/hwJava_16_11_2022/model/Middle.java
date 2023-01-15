package hwJava_16_11_2022.model;

import hwJava_16_11_2022.jobTitle;
import hwJava_16_11_2022.rewardAnEmployee;

public class Middle extends Employees implements rewardAnEmployee {
    private String position;

    public Middle() {
        position = String.valueOf(jobTitle.FINANCE_MANAGER);
    }
    public void show() {
        System.out.println(name + " " + position);

    }
}
