package hw_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String path = "xxx.jpg";
        String path2 = "xxx.jpg";
        Reader_file reader = new Reader_file();
        List<Integer> list1 = reader.read_file(path);
        List<Integer> list2 = reader.read_file(path);

        Iterator iteratorList1 = list1.iterator();
        Iterator iteratorList2 = list2.iterator();
        int i = 0;
        while (iteratorList1.hasNext() && iteratorList2.hasNext()) {
            if (iteratorList1.next() != iteratorList2.next()) {
                System.out.println(iteratorList1.next() + " !!! " + iteratorList2.next() + " index: " + i);
            }
            i++;
        }

//        for (int i = 0; i < 1000; i++) {
//            if (list1.get(i) != list2.get(i))
//            System.out.println(list1.get(i) + " !!!! " + list2.get(i));
//        }

    }
}
class Reader_file {
    public List<Integer> read_file(String path) {
        List<Integer> list = new ArrayList<>();
        int ch;
        try (FileInputStream inputStream = new FileInputStream(path)) {
            while ((ch = inputStream.read()) > -1) {
                list.add(ch);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

