package com.problems.streamApi;


import java.util.Arrays;
import java.util.List;


public class AverageCalculator {
    //Given a list of employees find avg salary by age range
    // (range was given, e.g. 18-25) using java8 stream
    // Find the sum of square of, all even numbers {1,2,3,4,5,6} using java 8?
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Bibbo", "Aball", "Mboll", "Ballon");
//        list.stream().filter(s -> s.startsWith("B")).forEach(System.out::println);
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int sum = numbers.stream().filter(a -> a%2==0).mapToInt(a -> a*a).sum();
        System.out.println(sum);
    }


}
