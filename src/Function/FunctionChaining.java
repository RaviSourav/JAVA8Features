package Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> f1 = s->s.toUpperCase();
        Function<String,String> f2 = s->s.substring(0,9);
        System.out.println(f1.apply("AishwaryaAbhi"));
        System.out.println(f1.andThen(f2).apply("AishwaryaAbhi"));
        System.out.println(f1.compose(f2).apply("AishwaryaAbhi"));

        Function<Integer,Integer> f3 = i->i+i;
        Function<Integer,Integer> f4 = i->i*i*i;
        System.out.println(f3.andThen(f4).apply(2));
        System.out.println(f3.compose(f4).apply(2));

        //Returns identity of input Argument
        Function<String,String> f5 = Function.identity();
        System.out.println(f5.apply("Ravi"));
        Function<Integer,Integer> f6 = Function.identity();
        System.out.println(f6.apply(10));
    }
}
