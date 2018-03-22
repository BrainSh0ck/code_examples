package com.stream;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Roman Vyhovskyi
 */
public class Main {
    public static void main(String[] args) {
        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        list.stream().forEachOrdered((p) -> p.append("_new"));
        System.out.println(list);
    }
}
