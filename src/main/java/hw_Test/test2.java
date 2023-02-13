package hw_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        String path = "xxx.jpg";
        String path2 = "xxx.jpg";
        Reader_file_2 reader = new Reader_file_2();
        reader.read_file(path, path2);
        //List<Integer> list1 = reader.read_file(path, path2);
        //List<Integer> list2 = reader.read_file(path);

//        Iterator iteratorList1 = list1.iterator();
//        Iterator iteratorList2 = list2.iterator();
//
//        while (iteratorList1.hasNext() && iteratorList2.hasNext()) {
//            if (iteratorList1 != iteratorList2) {
//                System.out.println("nnnnnnnnnnnnnn");
//            }
//        }

//        for (int i = 0; i < 1000; i++) {
//            if (list1.get(i).equals(list2.get(i)))
//            System.out.println(list1.get(i) + " !!!! " + list2.get(i));
//        }

    }
}
class Reader_file_2 {
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
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
