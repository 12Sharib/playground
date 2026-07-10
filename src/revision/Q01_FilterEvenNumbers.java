package revision;

import java.util.*;
import java.util.stream.*;

public class Q01_FilterEvenNumbers {

    /*
     * Problem:
     * Given a list of integers, filter all even numbers using Java Streams.
     *
     * Input:
     * [10, 15, 20, 25, 30, 35]
     *
     * Output:
     * [10, 20, 30]
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println(
                list
                        .stream()
                        .filter(n -> n%2 ==0)
                        .toList()
        );
    }
}