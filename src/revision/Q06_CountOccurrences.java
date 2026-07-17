package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q06_CountOccurrences {

    /*
     * Problem:
     * Given a list of strings, count the occurrences of each string.
     *
     * Input:
     * ["apple", "banana", "apple", "orange", "banana", "apple"]
     *
     * Output:
     * {
     *   apple=3,
     *   banana=2,
     *   orange=1
     * }
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "banana",
                "apple",
                "orange",
                "banana",
                "apple"
        );

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                l -> l, Collectors.counting()
                                        )
                        )
        );

    }
}