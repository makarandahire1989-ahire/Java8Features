package com.dumbbrains.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOptional {
    static void main() {
        //Find first
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = ints.stream().findFirst();
        System.out.println(first.get());


        //Handle Null Safely

        Optional<String> name = Optional.ofNullable(null);
        name.ifPresent(System.out::println);

        String result = Optional.ofNullable(getValue()).orElse("Default Value");
        System.out.println(result);



    }

    public static String getValue() {
        return "Test";
    }

}
