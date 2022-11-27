package StaticAndFinal;

public class Math {

    public Double pi = 3.17;

    public static Double staticPi = 3.14;

    public static Integer c =10;

    public static void add(Integer a , Integer b)
    {
        System.out.println("Addition: " + (a+b));
    }

    public static void subtract(Integer a , Integer b ){
        // accessing static fields
        System.out.println("Subtraction : " + (a-b-c));
    }

    public void multiply(Integer a, Integer b)
    {
        System.out.println("Multiplication:" + (a*b));
    }

    public static void areaOfCircle(Double radius)
    {
        System.out.println("-------------- Area Of Circle ------------");

        System.out.println("Area of circle is:"+ staticPi * radius * radius * 2);
//        static method can oly access static data and cannot refer to this keyword
//        System.out.println("Area of circle is:",this.pi*radius^2);
    }

    public static void allOperation(Integer a, Integer b)
    {
        System.out.println("----------- All Operation -------------");
        add(a,b);
        subtract(a,b);
//        static methods can only call other static methods
//        ,so we cannot call non-static method multiply() from here
//        multiply(a,b);
    }


    public static void main(String[] args) {
        allOperation(10,2);
        areaOfCircle(10.2);
    }
}
