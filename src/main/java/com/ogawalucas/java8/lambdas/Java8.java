package com.ogawalucas.java8.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class Java8 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        strings.add("string1");
        strings.add("string333");
        strings.add("string22");

        // ===== Comparator =====
        //  - method1:
        Comparator<String> stringComparator = (string1, string2) -> {
            if (string1.length() < string2.length()) {
                return -1;
            }
            if (string1.length() == string2.length()) {
                return 0;
            }
            return 1;
        };
        strings.sort(stringComparator);

        //  - method2:
        strings.sort((string1, string2) -> Integer.compare(string1.length(), string2.length()));

        //  - method3:
        strings.sort(Comparator.comparingInt(String::length));



        // ===== Consumer =====
        //  - method1:
        Consumer<String> stringConsumer = string -> System.out.println(string);
        strings.forEach(stringConsumer);

        //  - method2:
        strings.forEach(string -> System.out.println(string));

        //  - method2:
        strings.forEach(System.out::println);



        // ===== Threads =====
        //  - without Lambda:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Without Lambda");
            }
        });

        //  - with Lambda:
        new Thread(() -> System.out.println("Thread With Lambda"));
    }
}
