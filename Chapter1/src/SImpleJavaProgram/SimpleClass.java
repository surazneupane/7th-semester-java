package SImpleJavaProgram;

public class SimpleClass {
    public Integer a = 10;

    public String text()
    {
        return  "hello from function";
    }


    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        System.out.println(simpleClass.a);
        simpleClass.text();

    }

}
