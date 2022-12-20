package FileHandling.ByteStream;


import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("new_file.txt");
        int temp;
        String output = "";
        while((temp = fileInputStream.read()) != -1)
        {
            output += (char) temp;
        }

        System.out.println(output);
    }
}
