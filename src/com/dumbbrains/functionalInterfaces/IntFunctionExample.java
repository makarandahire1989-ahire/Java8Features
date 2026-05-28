package com.dumbbrains.functionalInterfaces;

import java.util.function.IntFunction;

public class IntFunctionExample {

    static void main() {
        IntFunction<String> ol = a -> "His age is "+a;
        System.out.println(ol.apply(4));

    }
}
