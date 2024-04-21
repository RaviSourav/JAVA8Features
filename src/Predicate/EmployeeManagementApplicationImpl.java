package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagementApplicationImpl {
    public static void main(String[] args) {
        ArrayList<EmployeeManagementApplication> employeeManagementApplications = new ArrayList<>();
        populate(employeeManagementApplications);

        System.out.println("Managers Information");
        Predicate<EmployeeManagementApplication> p1 = emp -> emp.designation.equals("Manager");
        display(p1,employeeManagementApplications);

        System.out.println("Bangalore Employees Information");
        Predicate<EmployeeManagementApplication> p2 = emp -> emp.city.equals("Bangalore");
        display(p2,employeeManagementApplications);

        System.out.println("Employees whose salary less than 20000 and to give increment");
        Predicate<EmployeeManagementApplication> p3 = emp -> emp.salary<20000;
        display(p3,employeeManagementApplications);

        System.out.println("All Managers from Bangalore city for Pink Slip");
        display(p1.and(p2),employeeManagementApplications);

        System.out.println("Employees Information who are either Managers or salary <20000");
        display(p1.and(p3),employeeManagementApplications);

        System.out.println("All Employees information who are not managers");
        display(p1.negate(),employeeManagementApplications);

//        Predicate<EmployeeManagementApplication> isCEO = Predicate.isEqual(new EmployeeManagementApplication
//                ("Ravi","CEO",300000,"Bangalore"));
//        System.out.println(isCEO.test(
//                new EmployeeManagementApplication("Durga","CEO",30000,"Hyderabad")
//        ));//false
//        System.out.println(isCEO.test(
//                new EmployeeManagementApplication("Ravi","CEO",300000,"Bangalore")
//        ));//true

//        Predicate<EmployeeManagementApplication> isCEO=Predicate.isEqual(new EmployeeManagementApplication("Durga","CEO",30000," Hyderabad"));
        EmployeeManagementApplication e1=new EmployeeManagementApplication("Durga","CEO",30000,"Hyderabad");
        EmployeeManagementApplication e3=e1;
        EmployeeManagementApplication e2=new EmployeeManagementApplication("Sunny","Manager",20000,"Hyderabad");
        Predicate<EmployeeManagementApplication> isCEO=Predicate.isEqual(e3);

        System.out.println(isCEO.test(e1));//true
        System.out.println(isCEO.test(e2));//false
    }

    public static void populate(ArrayList<EmployeeManagementApplication> employeeManagementApplications)
    {
        employeeManagementApplications.add(new EmployeeManagementApplication("Durga","CEO",30000,"Hyderabad"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Sunny","Manager",20000,"Hyderabad"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Mallika","Manager",20000,"Bangalore"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Kareena","Lead",15000,"Hyderabad"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Katrina","Lead",15000,"Bangalore"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Anushka","Developer",10000,"Hyderabad"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Kanushka","Developer",10000,"Hyderabad"));
        employeeManagementApplications.add(new EmployeeManagementApplication("Sowmya","Developer",10000,"Bangalore"));
    }

    public static void display(Predicate<EmployeeManagementApplication> p,ArrayList<EmployeeManagementApplication> employeeManagementApplication)
    {
        for (EmployeeManagementApplication emp:employeeManagementApplication) {
            if(p.test(emp))
                System.out.println(emp);
        }
        System.out.println();
    }
}
