package hwJava_16_11_2022.service;


import hwJava_16_11_2022.jobTitle;
import hwJava_16_11_2022.model.Employees;

public class Service {
    private hwJava_16_11_2022.jobTitle jobTitle;
    public static void jobChangeToCeo(Employees employees) {
  employees.changePosition();

}
}
