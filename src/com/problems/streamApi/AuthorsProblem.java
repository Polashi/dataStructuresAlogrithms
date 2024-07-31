package com.problems.streamApi;

import java.util.Arrays;
import java.util.List;

public class AuthorsProblem {
    public static void main(String[] args) {
        //get any 3 authors with unique surname in uppercase
        // and age above 50(Provided Author class with some fields)
//        Author a1 = new Author("Alok","Jain", 25);
//        Author a2 = new Author("Ranjit","Panda", 20);
//        Author a3 = new Author("Manya","Panda", 40);
//        Author a4 = new Author("Vivek","Lamba", 37);
//        Author a5 = new Author("Nayan","Bora", 30);
//        List<Author> authors = Arrays.asList(a1, a2, a3,a4,a5);
//        authors.stream()
//                .filter(a -> a.age > 30)
//                .map(a -> a.surname.toUpperCase())
//                .distinct()
//                .limit(3)
//                .forEach(System.out::println);
//        ;

//        List<String> names = Arrays.asList("Dave", "Joe", "Ryan", "Iyan");
//        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.stream().filter(a -> a%2==0).mapToInt(a -> a*a).sum());


    }

    static class Author{
        String firstName;
        String surname;
        int age;

        Author(String f, String s, int a){
            firstName = f;
            surname = s;
            age = a;
        }
    }
}
