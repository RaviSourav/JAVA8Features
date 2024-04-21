package StreamAPI;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
//        integers.sort(Collections.reverseOrder());

        //Get All the even numbers
//      This will directly stream and display doesn't store
        integers.stream().filter(i -> i%2==0).forEach(System.out::println);
//      This will store and the display
//        List<Integer> res1 = integers.stream().filter(i -> i%2==0).collect(Collectors.toList());
        List<Integer> res1 = integers.stream().filter(i -> i%2==0).toList();
        res1.forEach(System.out::println);

        System.out.println();


//      To get string of length greater than 5
        List<String> names = new ArrayList<>(Arrays.asList("Swati","Abc","Ravi","RaviS","Saloni","Sonali","12345","abc"));
//      This will directly stream and display doesn't store
        names.stream().filter(c-> c.length()>=5).forEach(System.out::println);
//      List<String> res2 = names.stream().filter(c -> c.length()>=5).collect(Collectors.toList());
        List<String> res2 = names.stream().filter(c -> c.length()>=5).toList();
        res2.forEach(System.out::println);

        System.out.println();

        //change every letter to uppercase
        names.stream().map(c-> c.toUpperCase()).forEach(System.out::println);
//        List<String> res3 = names.stream().map(c-> c.toUpperCase()).collect(Collectors.toList());
        List<String> res3 = names.stream().map(c-> c.toUpperCase()).toList();
        res3.forEach(System.out::println);

        System.out.println();

        //sort names ascending order
        //it will stream and sort it and doesn't store it
        names.stream().sorted().forEach(System.out::println);
        //it will sort and store it
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

        System.out.println();

        //sort names descending order
        //it will stream and sort it and doesn't store it
        names.stream().sorted((s1,s2) -> s2.compareToIgnoreCase(s1)).forEach(System.out::println);
        //it will sort and store it
        //first method
        Collections.sort(names,Collections.reverseOrder());
        names.forEach(System.out::println);
        //2nd method
        names.sort((s1,s2) -> s2.compareToIgnoreCase(s1));
        names.forEach(System.out::println);

        System.out.println();



        //min() and max() in stream
        System.out.println(res3.stream().min((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(res3.stream().min((s1,s2)-> s2.compareTo(s1)).get());
        System.out.println(res3.stream().max((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(res3.stream().max((s1,s2)-> s2.compareTo(s1)).get());
        System.out.println(res3.stream().min((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(res3.stream().max((s1,s2)-> s1.compareTo(s2)).get());
        System.out.println(integers.stream().min((s1,s2)-> s1-s2).get());
        System.out.println(integers.stream().max((s1,s2)-> s1-s2).get());


        System.out.println();


        //copy the element of the list to array
        Integer[] arr = integers.toArray(Integer[]::new);
        Arrays.stream(arr).forEach(System.out::print);
        for (Integer i:arr) {
            System.out.print(i+" ");
        }

        System.out.println();
        Stream s1 = Stream.of(arr);
//        s1.forEach(System.out::print);  //here we can not use s1 at same place otherwise it will throw CE
        s1.forEach(i-> System.out.print(i+" ")); // Stream is already used
        Stream.of(arr).forEach(i-> System.out.print(i+" "));
    }
}
