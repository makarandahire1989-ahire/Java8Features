package com.dumbbrains.functionalInterfaces;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {
    // Takes 2 input of type T and U and then return a long valued output
    static void main() {


        ToLongBiFunction<Integer, String> toLongBiFunction = (a, b) -> a * 5673;

        System.out.println(toLongBiFunction.applyAsLong(30,"Stringdhjf"));
    }
}
