package com.dumbbrains.functionalInterfaces;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionExample {
    //This function takes Long as input and give int as output

    static void main() {
        LongToIntFunction longToIntFunction = a -> (int) a* 1000;
        System.out.println(longToIntFunction.applyAsInt(17));


    }
}
