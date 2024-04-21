package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PassPredicateAsArgument {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Predicate<Integer> checkEven = (i) -> i%2==0;
        List<Integer> result = check(integers, checkEven);

//        result.forEach(integer -> System.out.println(integer));
        result.forEach(System.out::println);
    }

    public static <T> List<T> check(List<T> integers, Predicate<T> checkEven){
        List<T> result = new ArrayList<>();
        for (T x: integers)
        {
            if (checkEven.test(x))
                result.add(x);
        }
        return result;
    }
}
