package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q09_PartitionEvenOdd {

    /*
     * Problem:
     * Given a list of integers, partition them into even and odd numbers.
     *
     * Input:
     * [1, 2, 3, 4, 5, 6]
     *
     * Output:
     * {
     *   false=[1, 3, 5],
     *   true=[2, 4, 6]
     * }
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .partitioningBy(x -> x% 2==0)
                        )
        );

    }
}