package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface checkPalindrome{
    boolean check(int a);
}

public class PassLambdaExpressionAsArgument {
    public static void main(String[] args) {
        checkPalindrome checkPalindromes = (i)-> {
            int x = i;
            int res=0;
            while(x!=0)
            {
                res = res*10+x%10;
                x/=10;
            }
            return res == i;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(121,153,151,345,545));
        List<Integer> result = check(numbers,checkPalindromes);
        result.forEach(System.out::println);
    }
    public static <T> List<T> check(List<T> numbers, checkPalindrome checks)
    {
        List<T> result = new ArrayList<>();
        for (T x: numbers)
        {
            if(checks.check((Integer) x))
                result.add(x);
        }
        return result;
    }
}
