package LambdaExpression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface returnPalindrome{
    List<Integer> checkAndReturnPalindrome(List<Integer> numbers);
}
public class PassLambdaExpressionAsArgument2 {
    public static void main(String[] args) {
        returnPalindrome returnPalindromes = (i) -> {
            List<Integer> result = new ArrayList<>();
            for(int x: i){
                int n = x;
                int res=0;
                while(n!=0)
                {
                    res = res*10+n%10;
                    n/=10;
                }
                if(res==x)
                    result.add(x);
            }
            return result;
        };
        List<Integer> numbers = new ArrayList<>(Arrays.asList(121,153,151,345,545,747,12121,12153));
        List<Integer> result = returnPalindromes.checkAndReturnPalindrome(numbers);
        result.forEach(System.out::println);
    }
}
