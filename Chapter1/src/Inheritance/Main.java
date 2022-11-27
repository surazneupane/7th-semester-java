package Inheritance;

public class Main {
    public static void main(String[] args) {

        // inheritance example
        Programmer programmer1 = new Programmer("Ram",50000, 1000);
        Programmer programmer2 = new Programmer("Shyam", 40000,2000);

        programmer1.printName();
        programmer1.printSalary();
        programmer1.printSalaryWithBonus();
        System.out.println("----------------------------");
        programmer2.printName();
        programmer2.printSalary();
        programmer2.printSalaryWithBonus();







    }
}
