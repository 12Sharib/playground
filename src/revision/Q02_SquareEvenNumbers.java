package revision;

import java.util.*;
import java.util.stream.*;

public class Q02_SquareEvenNumbers {

    /*
     * Problem:
     * Given a list of integers, filter even numbers and return their squares.
     *
     * Input:
     * [1, 2, 3, 4, 5, 6]
     *
     * Output:
     * [4, 16, 36]
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(
                list
                        .stream()
                        .filter(n->n%2==0)
                        .map(n-> n*n)
                        .toList()
        );
    }
}