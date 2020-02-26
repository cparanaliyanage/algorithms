package com.charith.general.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        List<Integer> evenIntegers = IntStream.range(0, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(evenIntegers);

        Map<Integer, Integer> evenIntegerMap = IntStream.range(0, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(evenIntegerMap);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long emptyStringCount = strings.stream().filter(String::isEmpty).count();
        System.out.println(emptyStringCount);

        System.out.println(strings.stream().filter(string -> string.length() > 3).count());

        System.out.println(strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList()));

        System.out.println(strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", ")));

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(numbers.stream().map(i -> i * 2).distinct().collect(Collectors.toList()));

        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println(integers.stream().mapToInt(i -> i).summaryStatistics().getMax());

        Solution solution = new Solution();
        MathOperation addition = (i, j) -> i + j;
        System.out.println(solution.operation(10, 15, addition));

        System.out.println(solution.operation(10, 15, n -> 10));

        System.out.println(lcm(new int[]{4, 2}));

        System.out.println(gcd(new int[]{4, 2}));

        System.out.println(lcm(new int[]{4, 3}));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operation(int a, int b, ToIntFunction<Integer> predicate) {
        if (predicate.applyAsInt(a) == 10) {
            return a + b;
        }
        return 0;
    }

    private static int gcd(int x, int y) {
        return (y==0) ? x : gcd(y, x % y);
    }

    private static int gcd(int... numbers) {
        return Arrays.stream(numbers).reduce(0, (x, y) -> gcd(x, y));
    }

    private static int lcm(int... numbers) {
        return Arrays.stream(numbers).reduce(1, (x, y) -> x * (y / gcd(x, y)));
    }

    private int operation(int a, int b, MathOperation operation) {
        return operation.operation(a, b);
    }
}
