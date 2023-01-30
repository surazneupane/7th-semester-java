package FileHandling.WritingAndReadingObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fileInputStream = new
                FileInputStream("employee.txt");
        ObjectInputStream objectInputStream =
                new ObjectInputStream(fileInputStream);
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println("Name:" +employee.getName());
        System.out.println("Age:"+employee.getAge());

        objectInputStream.close();
        fileInputStream.close();

    }
}
