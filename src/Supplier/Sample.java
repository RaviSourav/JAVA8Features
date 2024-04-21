package Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> {
            String[] str = {"Sunny","Bunny","Chinny","Pinny"};
            return str[(int)Math.random()*7];
        };
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());

        //supply Date
        Supplier<Date> s2 = () -> new Date();
        System.out.println(s2.get());
        System.out.println(s2.get());
    }
}
