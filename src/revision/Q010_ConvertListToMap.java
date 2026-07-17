package revision;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q010_ConvertListToMap {

    /*
     * Problem:
     * Given a list of strings, create a Map where:
     * key = string
     * value = length of the string
     *
     * Input:
     * ["java", "stream", "api"]
     *
     * Output:
     * {
     *   java=4,
     *   stream=6,
     *   api=3
     * }
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream", "api");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .toMap(
                                             Function.identity(),
                                                String::length
                                        )
                        )
        );

//        If code has duplicate keys
//        Collectors.toMap(
//    Function.identity(),
//    String::length,
//    (existing, replacement) -> existing
//)

    }
}