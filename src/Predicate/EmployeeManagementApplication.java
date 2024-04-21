package Predicate;

public class EmployeeManagementApplication {
    String name;
    double salary;
    String designation;
    String city;

    public EmployeeManagementApplication(String name, String designation,double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeManagementApplication{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}
