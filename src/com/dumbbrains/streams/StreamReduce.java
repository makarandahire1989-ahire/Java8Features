package com.dumbbrains.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    static void main() {
        /**
         *
         * Stream Reduce
         */

        //Sum of elements
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //Product of elements
        int products = list.stream().reduce(1, (a, b) -> a * b);

        System.out.println(products);


        //max element using reduce
        Optional<Integer> max = list.stream().reduce(Integer::max);
        max.ifPresent(System.out::println);
    }
}
