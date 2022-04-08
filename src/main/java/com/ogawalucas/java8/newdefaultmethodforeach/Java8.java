package com.ogawalucas.java8.newdefaultmethodforeach;

import java.util.ArrayList;
import java.util.Comparator;

public class Java8 {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        strings.add("string1");
        strings.add("string333");
        strings.add("string22");

        strings.sort(new StringComparator());

        strings.forEach(System.out::println);
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        if (string1.length() < string2.length()) {
            return -1;
        }

        if (string1.length() == string2.length()) {
            return 0;
        }

        return 1;
    }
}
