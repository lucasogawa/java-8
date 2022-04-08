package com.ogawalucas.java8.newdefaultmethodforeach;

import java.util.List;

public class Java8 {

    public static void main(String[] args) {
        List.of("word1", "word2", "word3")
            .forEach(System.out::println);
    }
}

