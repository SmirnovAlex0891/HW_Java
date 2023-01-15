package hw_21_12_2022.Ex9;

public class MyException extends Throwable {
    public MyException(String s) throws MyException {
        System.out.println(s);
    }
}
