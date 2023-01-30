package FileHandling.WritingAndReadingObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setAge(22);
        employee.setName("Ram");

        FileOutputStream fileOutputStream = new
                FileOutputStream("employee.txt");
        ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);

        System.out.println("Done");
        objectOutputStream.close();
        fileOutputStream.close();

    }
}
