package com.dumbbrains.functionalInterfaces;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

    //Takes in Double and return type T

    static void main() {
        DoubleFunction<String> df  = d -> "The input is "+d+" which is double";

        System.out.println(df.apply(23.0));
    }
}
