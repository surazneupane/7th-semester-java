package FileHandling.LineByLine;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("new_file.txt");
        FileReader fileReader = new FileReader(file);

        File file1 = new File("output.txt");
        FileWriter fileWriter = new FileWriter(file1);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;

        while((line = bufferedReader.readLine()) != null)
        {
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
