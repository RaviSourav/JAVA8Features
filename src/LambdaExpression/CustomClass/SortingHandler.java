package LambdaExpression.CustomClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingHandler {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Ravi"));
        employees.add(new Employee(3,"Sourav"));
        employees.add(new Employee(2,"Swati"));
        employees.add(new Employee(14,"Saloni"));
        employees.add(new Employee(5,"Sonali"));
        employees.add(new Employee(16,"Rupak"));
//        System.out.println(employees);
        employees.forEach(System.out::println);
        employees.forEach(i -> System.out.print(i.eno+" "+i.ename+" \n"));

        System.out.println();


        //Sorting based on Employee number
        employees.sort((e1,e2) -> e1.eno-e2.eno);
        employees.forEach(System.out::println);
//        This will not store the value, only stream and sort it and display it.
//        employees.stream().sorted((e1,e2) -> e1.eno-e2.eno).forEach(System.out::println);


        System.out.println();

        //Sorting based on Employee name on Ascending order
        employees.sort((e1,e2) -> e1.ename.compareToIgnoreCase(e2.ename));
        employees.forEach(i -> System.out.print(i.eno+" "+i.ename+" \n"));
//        This will not store the value, only stream and sort it and display it.
//        employees.stream().sorted((e1,e2) -> e1.ename.compareTo(e2.ename)).forEach(System.out::println);

        System.out.println();


        //Sorting based on Employee name on Ascending order
        employees.sort((e1,e2) -> e2.ename.compareToIgnoreCase(e1.ename));
        employees.forEach(i -> System.out.print(i.eno+" "+i.ename+" \n"));
//        This will not store the value, only stream and sort it and display it.
//        employees.stream().sorted((e1,e2) -> e2.ename.compareTo(e1.ename)).forEach(System.out::println);
//        Collections.sort(employees,(e1,e2) -> e1.ename.compareToIgnoreCase(e2.ename));
    }
}
