package LambdaExpression.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingWithLambdas {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(7,2,4,1,6,0,9,8,5,3));

        //This will not store the elements, this will only stream and sort it and perform the operations and release it.
        integers.stream().sorted((I1,I2) -> I2.compareTo(I1)).forEach(System.out::println);
        System.out.println();
        integers.forEach(System.out::println);

        System.out.println();

        //This will sort the value and then you can use anytime
        //Ascending order
//        Collections.sort(integers, (I1,I2) -> I1.compareTo(I2));

//        integers.sort((I1,I2)-> (I1>I2)?-1:((I1<I2)?1:0));
        integers.sort((I1,I2) -> I2.compareTo(I1));
        integers.forEach(System.out::println);
    }
}
