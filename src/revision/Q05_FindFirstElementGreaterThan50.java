package revision;

import java.util.*;
import java.util.stream.*;

public class Q05_FindFirstElementGreaterThan50 {

    /*
     * Problem:
     * Given a list of integers, find the first element greater than 50.
     *
     * Input:
     * [12, 45, 60, 78, 90]
     *
     * Output:
     * 60
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 60, 78, 90);

        System.out.println(
                list
                        .stream()
                        .filter(x -> x > 50)
                        .findFirst()
                        .orElse(null)
        );

    }
}