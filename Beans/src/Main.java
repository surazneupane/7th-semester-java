public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge(26);
        employee.setName("Suraj Neupane");
        System.out.println(
                String.format("The age of employee %s is %d",
                        employee.getName(),
                        employee.getAge()));
    }
}
