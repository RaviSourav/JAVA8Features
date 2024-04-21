package LambdaExpression.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer I1, Integer I2) {
//        if(I1<I2)
//            return 1;
//        else if (I1>I2) {
//            return -1;
//        }
//        else
//            return 0;

        //Above code can be written as:
//        return  I1>I2?-1:(I1<I2)?1:0;

        //Most Efficient way
        return I2.compareTo(I1);
    }
}

public class CustomizeSOComparator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(7,2,4,1,6,0,9,8,5,3));
        //below both way is valid
//        Collections.sort(numbers,new MyComparator());

        //use to first sort and then display whenever required
        numbers.sort(new MyComparator());
        numbers.forEach(System.out::println);

        System.out.println();

        //Once Stream it doesn't store the value it performs the operation and release it.
        numbers.stream().sorted(new MyComparator()).forEach(System.out::println);

        System.out.println();

        Integer[] a = new Integer[]{3,2,5,4,1};
        //For Ascending or Default NSO
        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);

        System.out.println();

        //for Descending Order or Customise SO
        Arrays.sort(a, new MyComparator());
        Arrays.stream(a).forEach(System.out::println);

        System.out.println();

        //DNSO directly based on streams but it will not store the value after sorting, it directly sort and display
        //or we can stream over the operations.
        Arrays.stream(a).sorted().forEach(System.out::println);
    }
}
