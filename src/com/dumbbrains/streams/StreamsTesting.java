package com.dumbbrains.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTesting {

    static void main() {


        List<String> words = Arrays.asList("apple", "mango", "banana", "cherry");
        // Convert the list of words to uppercase using streams
        List<String> uppercaseStrings = words.stream().map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);


        //Filter Even numbers from a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNums = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNums);


        //Count numbers greater than 10

        List<Integer> numbers = Arrays.asList(1, 12, 3, 24, 25, 6, 07, 80, 92, 10);

        long count = numbers.stream().filter(x -> x > 10).count();
        System.out.println(count);

        //String find which starts with "A"

        List<String> names = Arrays.asList("apple", "mango", "cherry", "banana", "ananan");
        List<String> namesWithA = names.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
        System.out.println(namesWithA);


        //remove null from the list
        List<String> listWithNulls = Arrays.asList("apple", null, "mango", null, "cherry");
        List<String> listWithoutNulls = listWithNulls.stream()
                .filter(x -> Objects.nonNull(x)).collect(Collectors.toList());

        System.out.println(listWithoutNulls);

        //Square all numbers
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = nums2.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squares);

        /**
         * Collectors (Very Important)
         * Concepts Covered: collect(), Collectors.toList(), joining(), counting()
         */

        //Join with comma delimeter
        List<String> fruits = Arrays.asList("apple", "mango", "banana", "cherry");
        String joined = fruits.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined);

        //Counting using collectors
        List<String> list = Arrays.asList("apple", "mango", "cherry", null);
        long countNonNull = list.stream().filter(x -> Objects.nonNull(x))
                .collect(Collectors.counting());
        System.out.println(countNonNull);

        //Convert to Set
        List<String> fruitsList = Arrays.asList("apple", "mango", "banana", "cherry", "apple", "mango");
        Set<String> fruitsSet = fruitsList.stream().collect(Collectors.toSet());
        System.out.println(fruitsSet);







    }
}
