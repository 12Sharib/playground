package revision;

import java.util.*;
import java.util.stream.*;

public class Q03_RemoveDuplicates {

    /*
     * Problem:
     * Given a list of integers, remove duplicate elements while preserving insertion order.
     *
     * Input:
     * [1, 2, 2, 3, 4, 4, 5, 1]
     *
     * Output:
     * [1, 2, 3, 4, 5]
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 1);

        System.out.println(
                list
                        .stream()
                        .distinct()
                        .toList()
        );
    }
}