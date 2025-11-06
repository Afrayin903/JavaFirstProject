package practice2;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double Salary;

    Employee(String name, char gender, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.Salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
