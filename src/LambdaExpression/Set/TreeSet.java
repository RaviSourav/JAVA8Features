package LambdaExpression.Set;


import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(3);
        set.add(30);
        set.add(13);
        set.add(12);
        set.add(15);
        set.add(300);
        set.forEach(System.out::println);
    }
}
