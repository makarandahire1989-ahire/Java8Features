package com.dumbbrains.functionalInterfaces;

import java.util.function.LongFunction;

public class LongFunctionExample {

    static void main() {
        LongFunction<Double> ol = a -> a/2.0;

        System.out.println(ol.apply(4));

        LongFunction<String> ol2 = a -> "His age is "+a;

        System.out.println(ol2.apply(4));

    }
}
