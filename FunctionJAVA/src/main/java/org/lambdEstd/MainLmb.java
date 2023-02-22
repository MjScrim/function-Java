package org.lambdEstd;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MainLmb {
    public static void main(String[] args) {
        List<String> strings = List.of("stringhhhhh", "stringjjjjj");
        List<Integer> charNumbers = map(strings, (String s) -> s.length());
        List<String> upperCase = map(strings, (String s) -> s.toUpperCase());

        System.out.println(charNumbers);
        System.out.println(upperCase);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e: list) {
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}