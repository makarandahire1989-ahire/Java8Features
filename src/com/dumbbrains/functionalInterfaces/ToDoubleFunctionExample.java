package com.dumbbrains.functionalInterfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {

    //ToDoubleFunction take any parameter of type T and return Double as output
    static void main() {

        ToDoubleFunction<Integer> toDoubleFunction = a -> a+1;

        System.out.println(toDoubleFunction.applyAsDouble(23));

    }
}
