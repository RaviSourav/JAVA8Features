package LambdaExpression.Set;

import java.util.Set;

public class TreeSetCSO {
    public static void main(String[] args) {
//        Set<Integer> set = new java.util.TreeSet<>((I1,I2) -> I2.compareTo(I1));
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(3);
        set.add(30);
        set.add(13);
        set.add(12);
        set.add(15);
        set.add(300);
        set.forEach(System.out::println);
        System.out.println();

//        set.sorted() functions is not available in set
        //this will stream and sort and doesn't store elements
        set.stream().sorted((I1,I2) -> I2.compareTo(I1)).forEach(System.out::println);
    }
}
