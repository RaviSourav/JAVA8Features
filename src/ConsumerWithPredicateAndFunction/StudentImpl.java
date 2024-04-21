package ConsumerWithPredicateAndFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentImpl {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        apply(students);

        Predicate<Student> predicate = s -> s.marks>=60;
        Function<Student,String> function = s -> {
          int marks = s.marks;
            if (marks >= 80) {
                return "A[Dictinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        Consumer<Student> consumer = s -> {
            System.out.println("Student Name:" + s.name);
            System.out.println("Student Marks:" + s.marks);
            System.out.println("Student Grade:" + function.apply(s));
            System.out.println();
        };

        for (Student s: students){
            if(predicate.test(s))
                consumer.accept(s);
        }
    }

    public static void apply(List<Student> students){
        students.add(new Student(1,"Sunny", 100));
        students.add(new Student(2,"Bunny", 65));
        students.add(new Student(3,"Chinny", 55));
        students.add(new Student(4,"Vinny", 45));
        students.add(new Student(5,"Pinny", 25));
        students.add(new Student(6,"Priya", 75));
    }
}
