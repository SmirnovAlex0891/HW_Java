package hwJava_16_11_2022.model;

import java.util.Scanner;

public class Employees {

    protected String name;

public Employees (){
    System.out.println("Enter name");
    Scanner input = new Scanner(System.in);
    name = input.nextLine();

}
    public void show(){

    }
    public void changePosition(){

    }

}
