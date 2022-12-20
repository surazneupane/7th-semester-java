package FileHandling.CharacterStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("new_file.txt");
        File file1 = new File("output.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        int temp;
        while((temp = fileReader.read()) != -1)
        {
            System.out.println(temp);
            fileWriter.write(temp);
        }

        fileReader.close();
        fileWriter.close();
    }
}
