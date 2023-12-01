package org.example;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] a , int[] b) {

        //a->list
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());

        // b->list
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());

        // filter in listA, what is not in listB
        List<Integer> result = listA.stream().filter(elementA -> !listB.contains(elementA)).collect(Collectors.toList());

        // back to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}



