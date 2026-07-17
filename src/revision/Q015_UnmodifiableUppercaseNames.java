package revision;

import java.util.*;
import java.util.stream.Collectors;

public class Q015_UnmodifiableUppercaseNames {

    /*
     * Problem:
     * Given a list of names, convert them to uppercase
     * and return an unmodifiable list.
     *
     * Input:
     * ["java", "stream", "api"]
     *
     * Output:
     * [JAVA, STREAM, API]
     *
     * The returned list should be unmodifiable.
     */

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "java",
                "stream",
                "api"
        );

        System.out.println(
                list
                        .stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toUnmodifiableList())
        );

        System.out.println(
                Optional.ofNullable(list
                        .stream()
                        .collect(
                                Collectors
                                        .collectingAndThen(
                                                Collectors.toList(),
                                                Collections::unmodifiableList
                                        )
                        ))
        );

    }
}