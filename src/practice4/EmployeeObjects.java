package practice4;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee = new Employee("Kahar", 'M', "SDET", 100000);
        System.out.println(employee);

        System.out.println("==============================");
        employee.setName("Nihat");
        employee.setSalary(-120000);
        System.out.println("He is name " + employee.getName() + " and salary is more than " +employee.getSalary());
    }
}
