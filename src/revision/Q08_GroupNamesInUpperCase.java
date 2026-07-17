package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q08_GroupNamesInUpperCase {

    /*
     * Problem:
     * Given a list of strings, group them by their length
     * and store the names in uppercase.
     *
     * Input:
     * ["java", "api", "spring", "boot", "ai"]
     *
     * Output:
     * {
     *   2=[AI],
     *   3=[API],
     *   4=[JAVA, BOOT],
     *   6=[SPRING]
     * }
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "java",
                "api",
                "spring",
                "boot",
                "ai"
        );

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors
                                                .mapping(String::toUpperCase, Collectors.toList())
                                )
                        )
        );

    }
}