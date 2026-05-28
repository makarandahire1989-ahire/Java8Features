package com.dumbbrains.functionalInterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {

    //Take in parameter of type T and return output as Integer

    static void main() {
        ToIntFunction<Double> intFunction = a -> (int) (a*3);

        System.out.println(intFunction.applyAsInt(278.0));
    }
}
