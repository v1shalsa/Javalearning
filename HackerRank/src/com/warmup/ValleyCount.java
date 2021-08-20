package com.warmup;//Sample Input
//8
//UDDDUDUU
//Sample Output
// 1
//Explanation
//If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:
//
//        _/\      _
//        \    /
//        \/\/
//The hiker enters and leaves one valley.

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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valley =0;
        int level = 0;
        for(char ch : path.toCharArray()){
            if(ch == 'D' && level ==0)valley++;
            if(ch=='U')level++;
            else level--;
        }
        return valley;
    }

}

class ValleyCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedReader.close();
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();


        //bufferedWriter.close();
    }
}
