package hwJawa_18_01_2023;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCardToFile {
    public void writeCard(String cardData, String file, boolean overwrite) {
        try (FileWriter fileWriter = new FileWriter(file, overwrite)) {
            fileWriter.write("Start\n" + cardData + "\n" + "Stop\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
