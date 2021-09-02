package com.minmax;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long[] tempter = new long[arr.size()];
        tempter = arr.stream().mapToLong(i->i.longValue()).toArray();
        Arrays.sort(tempter);
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;
        System.out.println((min)+" "+(max));
        for(int i=0;i<tempter.length;i++){
            sum+=tempter[i];
            max = Math.max(max,tempter[i]);
            min = Math.min(min,tempter[i]);
            //System.out.println((min)+" "+(max));
        }

        System.out.println((sum-max)+" "+(sum-min));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
