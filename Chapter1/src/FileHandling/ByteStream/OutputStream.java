package FileHandling.ByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

    static String source = "Now is the time for all good men\n"
            + " to come to the aid of their country\n"
            + " and pay their due taxes.";

    public static void main(String[] args) throws IOException {

        File file = new File("new_file.txt");
       FileOutputStream fileOutputStream = new FileOutputStream(file);

//        writing strategy 1
        byte bytesArray[] = source.getBytes();

        fileOutputStream.write(bytesArray);
//        fileOutputStream.write(bytesArray,10,20);

//        for(int i=0; i < bytesArray.length ; i++)
//        {
//            System.out.println(bytesArray[i]);
//            fileOutputStream.write(bytesArray[i]);
//        }

//        writing strategy 2
//        for(int i=0; i < source.length();i++)
//        {
//            fileOutputStream.write(source.charAt(i));
//        }

        fileOutputStream.close();

    }
}
