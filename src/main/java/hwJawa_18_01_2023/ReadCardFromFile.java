package hwJawa_18_01_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCardFromFile {
    public List<String> dataCards(String path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            Boolean wr = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (wr) {
                    list.add(line);
                    wr = false;
                }
                if (line.equals("Start")) {
                    wr = true;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
