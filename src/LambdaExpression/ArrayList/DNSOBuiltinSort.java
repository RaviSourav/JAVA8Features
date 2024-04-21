package LambdaExpression.ArrayList;

import java.util.*;

public class DNSOBuiltinSort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7,2,4,1,6,0,9,8,5,3));
        Collections.sort(numbers);
        numbers.forEach(System.out::println);
    }
}
