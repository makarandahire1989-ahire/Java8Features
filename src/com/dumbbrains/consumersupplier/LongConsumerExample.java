package com.dumbbrains.consumersupplier;

import java.util.function.LongConsumer;

public class LongConsumerExample {
    //Accepts Long value but does not return anything

    /**
     * THis has following methods:
     * 1. accept() : takes in long and return nothing
     * 2. andThen() : Used for chaining the consumers
     */

    static void main() {
        LongConsumer longConsumer = a -> System.out.println("His age is "+a+" years");

        longConsumer.accept(17);


        LongConsumer longConsumer2 = a -> System.out.println(a*10);

        LongConsumer longConsumerMul = a -> System.out.println(a*=100);

        LongConsumer composite = longConsumer2.andThen(longConsumerMul);
        composite.accept(17);

    }
}
