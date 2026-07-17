package revision;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q07_GroupNamesByLength {

    /*
     * Problem:
     * Given a list of strings, group them by their length.
     *
     * Input:
     * ["java", "api", "spring", "boot", "ai"]
     *
     * Output:
     * {
     *   2=[ai],
     *   3=[api],
     *   4=[java, boot],
     *   6=[spring]
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
                                        String::length, Collectors.toList()
                                )
                        )
        );

    }
}