package hw_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestReadFile {
    public static void main(String[] args) {
        String path = "xxx.jpg";
        ReaderFile reader = new ReaderFile();
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
    }
}

class ReaderFile {
    public List<Integer> read_file(String path) {
        List<Integer> list = new ArrayList<>();
        int ch;
        try (FileInputStream inputStream = new FileInputStream(path)) {
            while ((ch = inputStream.read()) > -1) {
                list.add(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}

