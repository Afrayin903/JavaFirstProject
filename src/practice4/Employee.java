package practice4;

public class Employee {
    private String name;
    private char gender;
    private String jobTitle;
    private double Salary;

    Employee(String name, char gender, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
         if(salary<=0) {
             System.out.println("Invalid salary " + salary);
             System.exit(0);
         }
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
