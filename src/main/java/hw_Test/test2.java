package hw_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        String path = "xxx.jpg";
        String path2 = "yyy.jpg";
        ReaderFileNew reader = new ReaderFileNew();
        reader.read_file(path, path2);
    }
}

class ReaderFileNew {
    public void read_file(String path, String path2) {
        List<Integer> list = new ArrayList<>();
        int ch1;
        int ch2;
        int i = 0;
        try (FileInputStream file1 = new FileInputStream(path); FileInputStream file2 = new FileInputStream(path2)) {
            while ((ch1 = file1.read()) > -1 && (ch2 = file2.read()) > -1) {
                if (ch1 != ch2) {
                    System.out.println(ch1 + " !!! " + ch2 + " index = " + i + " " + path2);
                }
                i++;
            }
            System.out.println("DONE");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
