package revision;

import java.util.*;

public class Q013_FlattenListOfLists {

    /*
     * Problem:
     * Given a list of lists, flatten it into a single list.
     *
     * Input:
     * [
     *   [1, 2],
     *   [3, 4],
     *   [5, 6]
     * ]
     *
     * Output:
     * [1, 2, 3, 4, 5, 6]
     */

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        System.out.println(
                list
                        .stream()
                        .flatMap(list1 -> list1.stream())
                        .toList()
        );

        System.out.println(
                list
                        .stream()
                        .flatMap(List::stream)
                        .toList()
        );

    }
}