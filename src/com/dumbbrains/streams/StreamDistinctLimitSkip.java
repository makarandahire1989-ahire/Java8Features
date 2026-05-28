package com.dumbbrains.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctLimitSkip {
    static void main() {
        //Remove duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);

        List<Integer> numbersDistinct = numbers.stream().distinct().toList();
        System.out.println(numbersDistinct);

        //Limit the stream to first 3 elements
        List<Integer> numbersLimit = numbers.stream().limit(3).toList();
        System.out.println(numbersLimit);

        //Skip first 3 elements
        List<Integer> numbersSkip = numbers.stream().skip(3).toList();
        System.out.println(numbersSkip);


    }
}
