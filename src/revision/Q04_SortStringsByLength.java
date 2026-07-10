package revision;

import java.util.*;
import java.util.stream.*;

public class Q04_SortStringsByLength {

    /*
     * Problem:
     * Given a list of strings, sort them by their length in ascending order.
     *
     * Input:
     * ["banana", "kiwi", "fig", "apple"]
     *
     * Output:
     * ["fig", "kiwi", "apple", "banana"]
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "kiwi", "fig", "apple");

        System.out.println(
                list
                        .stream()
                        .sorted(Comparator.comparing(String::length))
                        .toList()
        );

    }
}