package com.problems.preparation;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
    Supplier<String> supplier = ()->"This is message";//returns something
    String messageSupplier = supplier.get();

    Consumer<String> consumer = System.out::println;


    Predicate<Integer> isEven = num -> num%2 == 0;
    boolean isEvenOrNot = isEven.test(13);

    Function<String, Integer> length = String::length;
    int lengthFunction = length.apply("Hello");


}
