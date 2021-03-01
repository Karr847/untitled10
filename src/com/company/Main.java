package com.company;

import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.concat(Stream.of(4, 5, 6), Stream.of(1, 2, 3))
                .forEach(System.out::print);

        Stream.of(Stream.of(4,5,6),Stream.of(1,2,3),Stream.of(7,8,9))
                .flatMap(Function.identity())
                .forEach(System.out::print);





    }
}