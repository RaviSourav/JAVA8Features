package Supplier;

import java.util.function.Supplier;

public class OTP6Digit {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String otp="";
            for(int i =1;i<=6;i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());


        //Random Password
        Supplier<String> s=()->
        {
            String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
            Supplier<Integer> d=()->(int)(Math.random()*10);
            Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
            String pwd="";
            for(int i =1;i<=8;i++)
            {
                if(i%2==0)
                {
                    pwd=pwd+d.get();
                }
                else
                {
                    pwd=pwd+c.get();
                }
            }
            return pwd;
            };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
