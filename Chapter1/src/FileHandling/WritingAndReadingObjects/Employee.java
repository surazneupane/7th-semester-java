package FileHandling.WritingAndReadingObjects;

import java.io.Serializable;

//serializable class allows an class object to be converted to stream
//so that we can write the object into file or database
public class Employee implements Serializable {

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
