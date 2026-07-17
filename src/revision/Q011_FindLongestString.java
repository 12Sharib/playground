package revision;

import java.util.*;

public class Q011_FindLongestString {

    /*
     * Problem:
     * Given a list of strings, find the longest string using Java Streams.
     *
     * Input:
     * ["java", "springboot", "api", "microservices"]
     *
     * Output:
     * "microservices"
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "java",
                "springboot",
                "api",
                "microservices"
        );

        System.out.println(
                list
                        .stream()
                        .max(Comparator.comparingInt(String::length))
                        .orElse(null)
        );

    }
}