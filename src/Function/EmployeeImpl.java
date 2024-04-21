package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


//Progarm to find Total Monthly Salary of All Employees by using Function:
public class EmployeeImpl {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);
        Function<ArrayList<Employee>, Object> totalSalary = e -> {
            double total = 0;
            for (Employee emp:employees) {
                total+=emp.salary;
            }
            return total;
        };
        System.out.println(totalSalary.apply(employees));


        //Progarm to perform Salary Increment for Employees by using Predicate & Function:
        Predicate<Employee> p = e -> e.salary<3500;
        Function<Employee,Employee> f = e -> {
            return new Employee(e.name,e.salary+500);
        };
        ArrayList<Employee> employees1 = new ArrayList<>();
        for (Employee emp:employees) {
            if(p.test(emp))
            {
                employees1.add(f.apply(emp));
            }
        }
        employees1.forEach(emp-> System.out.print(emp.name+" "+emp.salary+"\n"));
    }
    public static void populate(ArrayList<Employee> employees)
    {
        employees.add(new Employee("Sunny",1000));
        employees.add(new Employee("Bunny",2000));
        employees.add(new Employee("Chinny",3000));
        employees.add(new Employee("Pinny",4000));
        employees.add(new Employee("Vinny",5000));
    }
}
