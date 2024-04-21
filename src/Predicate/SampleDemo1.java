package Predicate;

import java.util.function.Predicate;


public class SampleDemo1 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,0};
        Predicate<Integer> p1 = i -> (i>5);
        Predicate<Integer> p2 = i -> (i%2==0);
        System.out.println("Numbers Greater than 5 are: ");
        m1(p1,a);
        System.out.println("Even numbers are: ");
        m1(p2,a);
        System.out.println("Numbers not greater than 5 are: ");
        m1(p1.negate(),a);
        System.out.println("Odd Numbers are");
        m1(p2.negate(),a);
        System.out.println("Numbers greater than 5 and even are: ");
        m1(p1.and(p2),a);
        m1(p2.and(p1),a);// both are correct
        System.out.println("Numbers less than 5 or even: ");
        m1(p1.negate().or(p2),a);
        m1(p2.or(p1.negate()),a);//both are correct
    }
    public static void m1(Predicate<Integer> p , int[] a)
    {
        for (int data: a)
        {
            if(p.test(data))
                System.out.print(data+" ");
        }
        System.out.println();
    }
}

